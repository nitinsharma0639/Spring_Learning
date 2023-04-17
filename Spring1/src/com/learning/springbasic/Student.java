package com.learning.springbasic;

public class Student {
	
	private int id;
	private String name;
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
		name = name;
	}
	
	
	void getMessage() {
		System.out.println("hello" +name);
	}

}
