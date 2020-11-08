package com.hibernateP25NativeQuery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "employee")
public class Employee {
	
	@Id
	@Column( name = "Id")
	private int id;
	@Column( name = "Name")
	private String name;
	@Column( name = "Salary")
	private long sal;
	
	public Employee() {}
	
	public Employee(int id, String name, long sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
		
}
