package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity 
@Table (name = "cricketer_per_subclass_annotation" )
@Inheritance (strategy = InheritanceType.JOINED)

public class Cricketer_per_subclass {
	@Id
	@GeneratedValue
	@Column (name = "Id" )
	private int id;
	@Column (name = "name" )
	private String name;
	
	public Cricketer_per_subclass(){}

	public Cricketer_per_subclass(int id, String name) {
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
