package com.gohenry.coding.parentdetails.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gohenry.coding.parentdetails.dto.ParentDataDto;

@RestController
@RequestMapping("/parents")
public class ParentDataController {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ParentDataController.class);

	/**
	 * Method to get Parent details of a given Id
	 * 
	 * @param id
	 * @return Parent Details
	 */
	@GetMapping(value = "/{id}/")
	public ParentDataDto getParentDetails(@PathVariable final int id) {
		LOGGER.info("Get Parent Details By Id :: getParentDetails() :: Called");
		ParentDataDto parentDataDto = new ParentDataDto();
		parentDataDto.setId(2);
		parentDataDto.setTitle("Mr");
		parentDataDto.setFirstName("Louis");
		parentDataDto.setLastName("James");
		parentDataDto.setEmailAddress("louis.james@gohenry.co.uk");
		parentDataDto.setDateOfBirth("1985-02-01");
		parentDataDto.setGender("Male");
		parentDataDto.setSecondName("");
		return parentDataDto;

	}

}