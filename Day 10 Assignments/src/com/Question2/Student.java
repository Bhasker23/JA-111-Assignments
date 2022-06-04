package com.Question2;

public abstract class Student {

	String name;
	String address;
	
	abstract void getPercentage();

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
}
