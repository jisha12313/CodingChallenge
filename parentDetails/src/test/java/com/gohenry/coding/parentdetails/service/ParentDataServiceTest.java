/**
 * 
 */
package com.gohenry.coding.parentdetails.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gohenry.coding.parentdetails.ParentDetailsApplicationTests;
import com.gohenry.coding.parentdetails.config.ParentDetailsConfig;
import com.gohenry.coding.parentdetails.dto.ParentDataDto;
import com.gohenry.coding.parentdetails.entity.Parent;
import com.gohenry.coding.parentdetails.exception.ParentDetailsNotFoundException;
import com.gohenry.coding.parentdetails.repository.ParentDetailsRepository;
import com.gohenry.coding.parentdetails.utility.TestDataUtility;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ParentDetailsApplicationTests.class)
@ContextConfiguration(classes = ParentDetailsConfig.class)
public class ParentDataServiceTest {

	@Mock
	private ParentDetailsRepository parentDetailsRepository;

	@Spy
	private DozerBeanMapper mapper;

	@InjectMocks
	private ParentDataServiceImpl parentDetailsService;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetParentDetails_WithoutChild() {
		when(parentDetailsRepository.findById(ArgumentMatchers.any(Integer.class)))
				.thenReturn(Optional.of(TestDataUtility.getParentDetails()));
		ParentDataDto dataDto = parentDetailsService.getParentDetails(1);
		assertNotNull(dataDto);
		assertNull(dataDto.getChildren());
	}

	@Test
	public void testGetParentDetails_withOneChild() {
		when(parentDetailsRepository.findById(ArgumentMatchers.any(Integer.class)))
				.thenReturn(Optional.of(TestDataUtility.getParentDetails_withOneChild()));
		ParentDataDto dataDto = parentDetailsService.getParentDetails(1);
		assertNotNull(dataDto.getChildren());
		assertEquals(1, dataDto.getChildren().size());
		assertEquals(1, dataDto.getChildren().iterator().next().getId());
	}

	@Test
	public void testGetParentDetails_withTwoChild() {
		when(parentDetailsRepository.findById(ArgumentMatchers.any(Integer.class)))
				.thenReturn(Optional.of(TestDataUtility.getParentDetails_withTwoChild()));
		ParentDataDto dataDto = parentDetailsService.getParentDetails(1);
		assertNotNull(dataDto.getChildren());
		assertEquals(dataDto.getChildren().size(), 2);
		assertTrue(dataDto.getChildren().stream().map(o -> o.getId()).collect(Collectors.toList())
				.containsAll(Arrays.asList(2, 1)));
	}

	@Test(expected = ParentDetailsNotFoundException.class)
	public void testSaveParentDetailforExistingParent() {
		when(parentDetailsRepository.save(ArgumentMatchers.any(Parent.class)))
				.thenReturn(TestDataUtility.getParentDetailsAfterSave());
		when(parentDetailsRepository.findById(ArgumentMatchers.any(Integer.class)))
				.thenReturn(Optional.of(TestDataUtility.getParentDetails()));

		parentDetailsService.saveParentData(TestDataUtility.getParentDetailsForSave2());
	}
	
	@Test
	public void testSaveParentDetailforNewParent() {
		when(parentDetailsRepository.save(ArgumentMatchers.any(Parent.class)))
				.thenReturn(TestDataUtility.getParentDetailsAfterSave());
		when(parentDetailsRepository.findById(ArgumentMatchers.any(Integer.class)))
				.thenReturn(null);

		ParentDataDto parentDataDto = parentDetailsService.saveParentData(TestDataUtility.getParentDetailsForSave());
		assertNotNull(parentDataDto);
	}

}
