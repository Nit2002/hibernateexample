package com.p14.hibernateP14ManyToOneCollectionMapping.model;

public class Intern {
	private int id, age;
	private String name, gender;
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
