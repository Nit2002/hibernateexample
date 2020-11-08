package com.p4.hibernateP4InheritanceMapping.model;

public class Cricketer {
	private int id;
	private String name;
	
	public Cricketer(){}

	public Cricketer(int id, String name) {
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
