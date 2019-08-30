package com.gohenry.coding.parentdetails.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gohenry.coding.parentdetails.dto.ParentDataDto;
import com.gohenry.coding.parentdetails.service.ParentDetailsService;

@RestController
public class ParentDataController {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ParentDataController.class);

	@Autowired
	ParentDetailsService parentDataService;

	/**
	 * Method to get Parent details of a given Id
	 * 
	 * @param id
	 * @return Parent Details
	 */
	@GetMapping(value = "/parents/{id}/")
	public ParentDataDto getParentDetails(@PathVariable final int id) {
		LOGGER.info("Get Parent Details By Id :: getParentDetails() :: Called");
		return parentDataService.getParentDetails(id);

	}
	
	@PostMapping(value = "/parents/")
	public ParentDataDto saveParentData(@RequestBody ParentDataDto parentDataDto) {
		LOGGER.info("Activate the phone for customer :: activatePhone() :: Called" + parentDataDto.getFirstName());
		return parentDataService.saveParentData(parentDataDto);
	}
}
