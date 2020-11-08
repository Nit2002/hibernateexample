package com.hibernateP15AnnotationOneToManyCollectionMapping.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table( name = "annotation_onetomany_student")
public class Student {
	@Id
	@Column ( name = "Id" )
	private int id;
	@Column ( name = "Age" )
	private int age;
	@Column ( name = "Name" )
	private String name;
	@Column ( name = "Gender" )
	private String gender;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn( name = "sid")
	@OrderColumn( name = "Type")
	private List<Laptop> laptops;
	
	public Student() {}

	public Student(int id, int age, String name, String gender, List<Laptop> laptops) {
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

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", laptops=" + laptops
				+ "]";
	} 
	
	
	
}
