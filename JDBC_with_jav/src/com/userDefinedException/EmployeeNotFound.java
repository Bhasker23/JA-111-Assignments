package com.userDefinedException;

public class EmployeeNotFound extends Exception{

	public EmployeeNotFound() {
		
	}
	public EmployeeNotFound(String massage) {
		
		super(massage);
	}
}
