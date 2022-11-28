package com.wilmar.model;

import java.time.LocalDate;

import com.wilmar.entity.User;

public class UserCreator {

	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String email;
	private String phone;
	private String gender;
	
	public User convertModelToEntity( ) {
		User user = new User();
		user.setFirstName(this.firstName);
		user.setLastName(this.lastName);
		user.setDob(this.dob);
		user.setEmail(this.email);
		user.setPhone(this.phone);
		user.setGender(this.gender);
		return user;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
