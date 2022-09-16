package com.nagarro.springmvc.dto;

import com.nagarro.springmvc.domain.Gender;

public class RequiredTShirtDto {

	private String size;
	private String color;
	private Gender gender;
	private String sortPreference;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getSortPreference() {
		return sortPreference;
	}

	public void setSortPreference(String sortPreference) {
		this.sortPreference = sortPreference;
	}

}
