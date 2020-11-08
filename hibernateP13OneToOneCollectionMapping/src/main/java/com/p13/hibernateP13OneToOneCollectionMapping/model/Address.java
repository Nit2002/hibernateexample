package com.p13.hibernateP13OneToOneCollectionMapping.model;

public class Address {
	private int id, pincode;
	private String state, city;
	private Intern intern;
	
	public Address() {}

	public Address(int id, int pincode, String state, String city) {
		this.id = id;
		this.pincode = pincode;
		this.state = state;
		this.city = city;
	}
	
	public Address(int pincode, String state, String city) {
		this.pincode = pincode;
		this.state = state;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
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

	public Intern getIntern() {
		return intern;
	}

	public void setIntern(Intern intern) {
		this.intern = intern;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", pincode=" + pincode + ", state=" + state + ", city=" + city + "]";
	}
	
	
}
