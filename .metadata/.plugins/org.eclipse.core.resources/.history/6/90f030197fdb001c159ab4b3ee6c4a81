package com.day5.EmpQ1;

import java.util.Scanner;

public class EmployeeMain {

	public static Employee getEmployeeDetails() {
		Employee e1 = new Employee();
		Scanner emp1 =  new Scanner(System.in);
		
		System.out.println("Enter ID");
		int x = emp1.nextInt();
		
		emp1.nextLine();
		
		System.out.println("Enter Name");
		String name = emp1.nextLine();
		
		System.out.println("Enter Salary");
		double salary = emp1.nextDouble();
		
		e1.setEmployeeId(x);
		e1.setEmployeeName(name);
		e1.setSalary(salary);
		
		
		
//		emp1.close();
		return e1;
	}
	
	public static int getPFPercentage() {
		Scanner employeePF1 = new Scanner(System.in);
		System.out.println("Enter Pf percentage");
		int z = employeePF1.nextInt();
		
		employeePF1.close();
		return z;
	}
	
	public static void main(String[] args) {
		
		Employee e1;
		
		
		e1 = getEmployeeDetails();
		 int x  = getPFPercentage();
		 
		e1.calculateNetSalary(x);
		
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getNetSalary());
		
	}
	
}
