package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity 
@Table (name = "cricketer_per_concrete_class" )
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Cricketer_per_concrete_class {
	@Id
	//@GeneratedValue
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column (name = "Id")
	private int id;
	@Column( name = "Name")
	private String name;
	
	public Cricketer_per_concrete_class(){}

	public Cricketer_per_concrete_class(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + "]";
	}
	
}
