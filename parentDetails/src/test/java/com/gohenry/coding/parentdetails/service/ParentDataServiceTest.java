/**
 * 
 */
package com.gohenry.coding.parentdetails.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gohenry.coding.parentdetails.ParentDetailsApplicationTests;
import com.gohenry.coding.parentdetails.dto.ParentDataDto;
import com.gohenry.coding.parentdetails.utility.TestDataUtility;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = ParentDetailsApplicationTests.class)
@ExtendWith(SpringExtension.class)
public class ParentDataServiceTest {
	
	@Mock
	private ParentDetailsService parentDataService;
	
	
	@Test
	public void testGetParentDetails() {
		when(parentDataService.getParentDetails(ArgumentMatchers.any(Integer.class))).thenReturn(TestDataUtility.getParentDataDetails1());
		ParentDataDto dataDto = parentDataService.getParentDetails(1);
		assertNotNull(dataDto);
	}
	
	@Test
	public void testGetParentDetails_one() {
		when(parentDataService.getParentDetails(ArgumentMatchers.any(Integer.class))).thenReturn(TestDataUtility.getParentDataDetails1());
		ParentDataDto dataDto = parentDataService.getParentDetails(1);
		assertNotNull(dataDto);
	}
	
	
}
