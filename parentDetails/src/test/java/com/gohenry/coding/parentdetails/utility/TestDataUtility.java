package com.gohenry.coding.parentdetails.utility;

import com.gohenry.coding.parentdetails.dto.ParentDataDto;

public class TestDataUtility {

	public static ParentDataDto getParentDataDetails1() {

		ParentDataDto parentDataDto = new ParentDataDto();
		parentDataDto.setId(3);
		return parentDataDto;
	}

	public static ParentDataDto getParentDataDetails2() {

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
