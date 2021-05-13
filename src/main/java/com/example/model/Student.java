package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student_details")
public class Student {
	@Id
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
public Student() {
		
	}
private String name;
private String email;
private String phoneNo;
private int stdclass;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getStdclass() {
		return stdclass;
	}
	public void setStdclass(int stdclass) {
		this.stdclass = stdclass;
	}
	
	
	
	
	
}
