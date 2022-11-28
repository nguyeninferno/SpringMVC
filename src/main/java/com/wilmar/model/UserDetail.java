package com.wilmar.model;

import java.time.LocalDate;

import com.wilmar.entity.User;

public class UserDetail {
	
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String email;
	private String phone;
	private String gender;
	
	public UserDetail convertEntityToModel(User user) {
		this.id = user.getId();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.dob = user.getDob();
		this.email = user.getEmail();
		this.phone = user.getPhone();
		this.gender = user.getGender();
		return this;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
