package com.operations;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.EmployeeTableOperation.ImplTotalOperationOnEmployeeTable;
import com.EmployeeTableOperation.TotalOperationOnEmployeeTable;
import com.userDefinedException.EmployeeNotFound;

public class SearchSalaryByEmployeeId {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID to Get his salary:");
		int id= scanner.nextInt();
		
		TotalOperationOnEmployeeTable operation= new ImplTotalOperationOnEmployeeTable();
		try {
			int salary= operation.enterIdGetSalryOfEmployee(id);
			
			System.out.println("Salary of employee having ID "+id+" is "+salary);
		} catch (EmployeeNotFound e) {
			System.out.println(e.getMessage());
		}
	}

}
