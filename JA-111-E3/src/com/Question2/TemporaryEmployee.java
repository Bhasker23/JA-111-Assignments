package com.Question2;

public class TemporaryEmployee extends Employee {
	
	private int hoursWorked;
	private int	hourlyWages;
	public TemporaryEmployee(int EmployeeID, String employeeName, int hoursWorked, int hourlyWages) {
		super(EmployeeID, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	@Override
	public void calculateSalary() {
		salary = hoursWorked * hourlyWages;
		setSalary(salary);
	}
	 
	
	
}
