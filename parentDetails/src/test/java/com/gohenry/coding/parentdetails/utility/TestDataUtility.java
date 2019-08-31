package com.gohenry.coding.parentdetails.utility;

import java.util.HashSet;

import com.gohenry.coding.parentdetails.dto.ParentDataDto;
import com.gohenry.coding.parentdetails.entity.Child;
import com.gohenry.coding.parentdetails.entity.Parent;

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
	
	public static ParentDataDto getParentDetailsForSave() {

		ParentDataDto parentDataDto = new ParentDataDto();
		parentDataDto.setTitle("Mr");
		parentDataDto.setFirstName("Louis");
		parentDataDto.setLastName("James");
		parentDataDto.setEmailAddress("louis.james@gohenry.co.uk");
		parentDataDto.setDateOfBirth("1985-02-01");
		parentDataDto.setGender("Male");
		parentDataDto.setSecondName("");
		return parentDataDto;
	}
	public static ParentDataDto getParentDetailsForSave2() {

		ParentDataDto parentDataDto = new ParentDataDto();
		parentDataDto.setId(1);
		parentDataDto.setTitle("Mr");
		parentDataDto.setFirstName("Louis");
		parentDataDto.setLastName("James");
		parentDataDto.setEmailAddress("louis.james@gohenry.co.uk");
		parentDataDto.setDateOfBirth("1985-02-01");
		parentDataDto.setGender("Male");
		parentDataDto.setSecondName("");
		return parentDataDto;
	}
	
	
	public static Parent getParentDetailsAfterSave() {

		Parent parentDataDto = new Parent();
		parentDataDto.setId(1);
		parentDataDto.setTitle("Mr");
		parentDataDto.setFirstName("Louis");
		parentDataDto.setLastName("James");
		parentDataDto.setEmailAddress("louis.james@gohenry.co.uk");
		parentDataDto.setDateOfBirth("1985-02-01");
		parentDataDto.setGender("Male");
		parentDataDto.setSecondName("");
		return parentDataDto;
	}

	public static Parent getParentDetails() {

		Parent parentData = new Parent();
		parentData.setId(1);
		parentData.setTitle("Mr");
		parentData.setFirstName("Louis");
		parentData.setLastName("James");
		parentData.setEmailAddress("louis.james@gohenry.co.uk");
		parentData.setDateOfBirth("1985-02-01");
		parentData.setGender("Male");
		parentData.setSecondName("");
		return parentData;
	}
	
	public static Parent getParentDetails_withOneChild() {

		Parent parentData = new Parent();
		parentData.setId(1);
		parentData.setTitle("Mr");
		parentData.setFirstName("Louis");
		parentData.setLastName("James");
		parentData.setEmailAddress("louis.james@gohenry.co.uk");
		parentData.setDateOfBirth("1985-02-01");
		parentData.setGender("Male");
		parentData.setSecondName("");
		parentData.setChildren(new HashSet<Child>(1));
		Child child = new Child();
		child.setFirstName("Louis");
		child.setLastName("James");
		child.setEmailAddress("louis.james@gohenry.co.uk");
		child.setDateOfBirth("1985-02-01");
		child.setGender("Male");
		child.setSecondName("");
		child.setId(1);
		parentData.getChildren().add(child);
		return parentData;
	}
	
	public static Parent getParentDetails_withTwoChild() {

		Parent parentData = new Parent();
		parentData.setId(1);
		parentData.setTitle("Mr");
		parentData.setFirstName("Louis");
		parentData.setLastName("James");
		parentData.setEmailAddress("louis.james@gohenry.co.uk");
		parentData.setDateOfBirth("1985-02-01");
		parentData.setGender("Male");
		parentData.setSecondName("");
		parentData.setChildren(new HashSet<Child>(1));
		Child child = new Child();
		child.setFirstName("Louis");
		child.setLastName("James");
		child.setEmailAddress("louis.james@gohenry.co.uk");
		child.setDateOfBirth("1985-02-01");
		child.setGender("Male");
		child.setSecondName("");
		child.setId(1);
		parentData.getChildren().add(child);
		child = new Child();
		child.setFirstName("Louis");
		child.setLastName("James");
		child.setEmailAddress("louis.james@gohenry.co.uk");
		child.setDateOfBirth("1985-02-01");
		child.setGender("Male");
		child.setSecondName("");
		child.setId(2);
		parentData.getChildren().add(child);
		return parentData;
	}
	
	 
}
