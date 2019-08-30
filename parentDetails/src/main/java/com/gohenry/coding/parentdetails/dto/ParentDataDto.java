package com.gohenry.coding.parentdetails.dto;

import java.util.List;

public class ParentDataDto {

	private int id;

	private String title;

	private String firstName;

	private String lastName;

	private String emailAddress;

	private String dateOfBirth;

	private String gender;

	private String secondName;
	
	private List<ChildDto> childDtos;

	public List<ChildDto> getChildDtos() {
		return childDtos;
	}

	public void setChildDtos(List<ChildDto> childDtos) {
		this.childDtos = childDtos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

}
