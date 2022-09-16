package com.nagarro.springmvc.domain;

import javax.persistence.*;

@Entity
@Table(name = "tshirt_csv_details")
public class TShirt {

	@Id
	@Column(name = "tshirt_id")
	private String id;
	@Column(name = "tshirt_name")
	private String name;
	@Column(name = "tshirt_color")
	private String color;
	@Column(name = "tshirt_gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "tshirt_size")
	private String size;
	@Column(name = "tshirt_price")
	private double price;
	@Column(name = "tshirt_rating")
	private double rating;
	@Column(name = "tshirt_availability")
	private String availability;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

//	public String toString() {
//
//		return this.id + " | " + this.name + " | " + this.color + " | " + this.gender + " | " + this.size + " | " + this.price + " | "
//				+ this.rating + " | " + this.availability;
//	}

}
