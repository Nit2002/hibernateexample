package com.hibernateP17AnnotationOneToOneCollectionMapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "annotation_onetoone_address")
public class Address {
	@Id
	@GeneratedValue
	@Column ( name = "Id")
	private int id;
	@Column (name = "Pincode")
	private int pincode;
	@Column ( name = "State")
	private String state;
	@Column ( name = "City" )
	private String city;
	@OneToOne ( mappedBy = "address")
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
