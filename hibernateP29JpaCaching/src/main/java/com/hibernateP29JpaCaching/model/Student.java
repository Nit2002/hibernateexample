package com.hibernateP29JpaCaching.model;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@NamedQueries({
	@NamedQuery(name = "findStudentById",
			query = "FROM Student WHERE id = :id" )
})

@Entity
@Table( name = "student_list")

@Cacheable
@Cache( usage= CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Id
	@Column( name = "Id")
	private int id;
	@Column( name = "Age")
	private int age;
	@Column( name = "Name")
	private String name;
	@Column( name = "Gender")
	private String  gender;
	@ElementCollection(fetch = FetchType.LAZY) // LAZY (SPECIFIED DATA , FAST) or EAGER (ALL DATA , SLOW)
	@JoinTable( name = "laptop_list",
	joinColumns = {@JoinColumn( name = "Id")})
	@OrderColumn( name = "Type")
	private List<String> laptops;
	
	public Student() {}

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
