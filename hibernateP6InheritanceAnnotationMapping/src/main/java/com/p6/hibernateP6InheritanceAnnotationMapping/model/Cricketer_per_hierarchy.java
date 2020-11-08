package com.p6.hibernateP6InheritanceAnnotationMapping.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;  
import javax.persistence.DiscriminatorType;  

@Entity
@Table (name = "cricketer_per_hierarchy_annotation")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn (name = "type" , discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue (value = "Staff")

public class Cricketer_per_hierarchy {
	@Id
	@GeneratedValue
	@Column (name = "Id")
	private int id;
	@Column (name = "Name")
	private String name;
	
	public Cricketer_per_hierarchy(){}

	public Cricketer_per_hierarchy(int id, String name) {
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
