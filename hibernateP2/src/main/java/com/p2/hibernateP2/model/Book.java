package com.p2.hibernateP2.model;

public class Book {
	
	private int code;
	private String name,publication;
	
	Book(){}

	public Book(int code, String name, String publication) {
		this.code = code;
		this.name = name;
		this.publication = publication;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	
	
}
