package com.p5.hibernateP5ComponentAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="customer_annotation")
public class Customer {
	@Id
	@GeneratedValue
	@Column (name = "Id")
	private int id;
	@Column (name = "Name")
	private String name;
	@Embedded
	private Address address;
	
	public Customer() {}
	
	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

		
}
