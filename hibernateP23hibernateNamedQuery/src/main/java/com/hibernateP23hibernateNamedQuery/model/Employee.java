package com.hibernateP23hibernateNamedQuery.model;

public class Employee {
	private int id;
	private String name;
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
