package com.gohenry.coding.parentdetails.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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
				.perform(get("/parents/{2}/", 2).accept(APPLICATION_JSON).contentType(APPLICATION_JSON));
		MvcResult result = actions.andReturn();
		LOGGER.info(result.getResponse().getContentAsString());
		actions.andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(APPLICATION_JSON))
				.andExpect(jsonPath("$.id", is(2)));

	}

	@Test
	public void testgetParentDetails() throws Exception {

		ResultActions actions = mvc
				.perform(get("/parents/{2}/", 2).accept(APPLICATION_JSON).contentType(APPLICATION_JSON));
		MvcResult result = actions.andReturn();
		LOGGER.info(result.getResponse().getContentAsString());
		actions.andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(APPLICATION_JSON))
				.andExpect(jsonPath("$.id", is(2))).andExpect(jsonPath("$.title", is("Mr")))
				.andExpect(jsonPath("$.firstName", is("Louis"))).andExpect(jsonPath("$.lastName", is("James")))
				.andExpect(jsonPath("$.emailAddress", is("louis.james@gohenry.co.uk")))
				.andExpect(jsonPath("$.dateOfBirth", is("1985-02-01"))).andExpect(jsonPath("$.gender", is("Male")))
				.andExpect(jsonPath("$.secondName", is("")));

	}

}