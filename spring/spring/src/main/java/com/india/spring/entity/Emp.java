package com.india.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="register1")
public class Emp {

	@Id
	Integer eid;
	String name;	
	long phone;
	String city;
	
	public Emp() {}


	public Emp(int eid, String name, long phone, String city) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.city = city;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}
	
}