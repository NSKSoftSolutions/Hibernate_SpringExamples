package com.nsksoft.spring.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "UserDetails")
@Component
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	private String email;
	@Column(name = "pass_word")
	private String password;
	private String first_name;
	private String last_name;
	private long mobile;
	private String present_address;
	private String permanent_adreess;
	private String gender;
	private String marital_status;
	private String country;
	private String state;
	private String pincode;
	private String dob;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPresent_address() {
		return present_address;
	}

	public void setPresent_address(String present_address) {
		this.present_address = present_address;
	}

	public String getPermanent_adreess() {
		return permanent_adreess;
	}

	public void setPermanent_adreess(String permanent_adreess) {
		this.permanent_adreess = permanent_adreess;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
