package com.operations;

import java.util.Scanner;

import com.EmployeeTableOperation.ImplTotalOperationOnEmployeeTable;
import com.EmployeeTableOperation.TotalOperationOnEmployeeTable;
import com.userDefinedException.EmployeeNotFound;

public class InsertWithoutAddress {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id= sc.nextInt();
		
		System.out.println("Enter name");
		String name= sc.next();
		
		System.out.println("Enter Salary");
		int salary= sc.nextInt();
		
		TotalOperationOnEmployeeTable total= new ImplTotalOperationOnEmployeeTable();
		try {
			total.withoutAddressInserFields(id, name, salary);
		} catch (EmployeeNotFound e) {
			System.out.println(e.getMessage());
		}
	}

}
