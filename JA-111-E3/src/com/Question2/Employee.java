package com.Question2;

public class Employee {
	
	protected int EmployeeID; 
	protected String employeeName;
	protected double salary;
	
	public int getEmployee() {
		return EmployeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setEmployee(int employee) {
		EmployeeID = employee;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int EmployeeID,String employeeName) {
		this.EmployeeID = EmployeeID;
		this.employeeName = employeeName;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	 public void calculateSalary() {
	}
}
