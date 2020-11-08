package com.hibernateP19LazyCollectionMapping.model;

import java.util.List;

public class Student {

	private int id, age;
	private String name, gender;
	private List<String> laptops;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int age, String name, String gender, List<String> laptops) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.laptops = laptops;
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

	public List<String> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<String> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", laptops=" + laptops
				+ "]";
	}
	
	
	
	
}
