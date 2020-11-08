package com.p9.hibernateP9SetCollectionMapping.model;

import java.util.Set;

public class Student {
	private int id, age;
	private String name, gender;
	private Set<String> laptops;
	public Student(int id, int age, String name, String gender, Set<String> laptops) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.laptops = laptops;
	}
	public Student() {}
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
	public Set<String> getLaptops() {
		return laptops;
	}
	public void setLaptops(Set<String> laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", laptops=" + laptops
				+ "]";
	}
}
