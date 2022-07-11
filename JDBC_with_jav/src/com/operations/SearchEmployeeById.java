package com.operations;

import java.util.Scanner;

import com.BeanClasses.Employee;
import com.EmployeeTableOperation.ImplTotalOperationOnEmployeeTable;
import com.EmployeeTableOperation.TotalOperationOnEmployeeTable;
import com.userDefinedException.EmployeeNotFound;

public class SearchEmployeeById {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID to Get his salary:");
		int id= scanner.nextInt();
		
		TotalOperationOnEmployeeTable operation= new ImplTotalOperationOnEmployeeTable();
		
		try {
			Employee employee= operation.searchEmployee(id);
			System.out.println(employee.toString());
		} catch (EmployeeNotFound e) {
			System.out.println(e.getMessage());
		}
	}

}
