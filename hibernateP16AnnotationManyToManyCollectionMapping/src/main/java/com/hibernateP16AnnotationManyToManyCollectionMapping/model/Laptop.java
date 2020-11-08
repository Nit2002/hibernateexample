package com.hibernateP16AnnotationManyToManyCollectionMapping.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name = "annotation_manytomany_laptop")
public class Laptop {
	@Id
	@GeneratedValue
	@Column( name = "Id" )
	private int id;
	@Column( name = "Name" )
	private String name;
	@Column( name = "Type" )
	private String type;
	@Column( name = "Price" )
	private double price;
	@ManyToMany(mappedBy = "laptops")
	private List<Student> student;
	
	public Laptop() {}
	
	public Laptop(int id, String name, String type, double price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public Laptop( String name, String type, double price) {
		
		this.name = name;
		this.type = type;
		this.price = price;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
}
