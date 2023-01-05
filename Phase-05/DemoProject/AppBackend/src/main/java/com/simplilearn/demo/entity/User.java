package com.simplilearn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String mobile;
	private String address;
	private String dob;
	private String gender;
	private String action;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public User(String action) {
		super();
		this.action = action;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}
	public User(int id, String name, String mobile, String address, String dob, String gender,String action) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.action=action;
	}
	public User(String name, String mobile, String address, String dob, String gender,String action) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.action=action;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
