package com.Question2;

public class PermanentEmployee extends Employee {
	
	private double basicPay;
	
	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int EmployeeID, String employeeName, double basicPay) {
		super(EmployeeID, employeeName);
		this.basicPay = basicPay;
	}

	@Override
	public void calculateSalary() {
		
	salary = basicPay - (basicPay * 0.12);
	
	setSalary(salary);
	}
	
	
}
