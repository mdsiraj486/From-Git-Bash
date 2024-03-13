package com.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pincode;
	private String street;
	private String area;
	private String city;
	private String state;
	
	@OneToOne(mappedBy = "address")
	private Customer customer;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pincode, String street, String area, String city, String state) {
		super();
		this.pincode = pincode;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", street=" + street + ", area=" + area + ", city=" + city + ", state="
				+ state + ", customer=" + customer + "]";
	}
	
	
	

}
