package com.p5.hibernateP5ComponentAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column (name = "State")
	private String state;
	@Column (name = "City")
	private String city;
	@Column (name = "Pincode")
	private int pincode;
	
	public Address() {}
	public Address(String state, String city, int pincode) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
