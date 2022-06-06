package com.Question2;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		double amount;
		Employee employee = employeeObj;
		if (employee instanceof PermanentEmployee ) {
			amount = ((employeeObj.salary * 15)/100);
			return amount;
		}
		else if (employee instanceof TemporaryEmployee) {
			amount = ((employeeObj.salary * 10)/100);
			return amount;
		}
		
		
		else {
			return amount = 0;
		}
		
		
	}

	private Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
