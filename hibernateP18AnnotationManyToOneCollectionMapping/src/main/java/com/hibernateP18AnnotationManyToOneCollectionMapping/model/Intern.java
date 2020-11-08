package com.hibernateP18AnnotationManyToOneCollectionMapping.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "annotation_manytoone_intern")
public class Intern {
	@Id
	@Column( name = "Id")
	private int id;
	@Column( name = "Age")
	private int age;
	@Column( name = "Name")
	private String name;
	@Column( name = "Gender")
	private String gender;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Address.class)
	@JoinColumn( name = "Aid")
	private Address address;
	
	public Intern() {}

	public Intern(int id, int age, String name, String gender, Address address) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Intern [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ "]";
	}

	
	
}
