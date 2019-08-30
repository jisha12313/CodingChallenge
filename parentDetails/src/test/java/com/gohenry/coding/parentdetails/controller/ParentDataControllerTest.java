package com.gohenry.coding.parentdetails.controller;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.gohenry.coding.parentdetails.ParentDetailsApplicationTests;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = ParentDetailsApplicationTests.class)
@ExtendWith(SpringExtension.class)
public class ParentDataControllerTest {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ParentDataControllerTest.class);

	private MockMvc mvc;

	@InjectMocks
	private ParentDataController parentDataController;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(parentDataController).build();
	}

	@Test
	public void testControllerInstance() {
		assertNotNull(parentDataController);
	}

	@Test
	public void testRetrieveParentSeviceExists() throws Exception {
		ResultActions actions = mvc
				.perform(get("/parents/{2}/", 2).accept(APPLICATION_JSON).contentType(APPLICATION_JSON));
		actions.andExpect(status().isOk());
	}	
	
	@Test
	public void testgetParentDetails_Id() throws Exception {
		ResultActions actions = mvc
				.perform(get("/parents/{3}/", 3).accept(APPLICATION_JSON).contentType(APPLICATION_JSON));
		MvcResult result = actions.andReturn();

		LOGGER.info(result.getResponse().getContentAsString());
		actions.andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(APPLICATION_JSON))
				.andExpect(jsonPath("$.id", is(3)));

	}

}
