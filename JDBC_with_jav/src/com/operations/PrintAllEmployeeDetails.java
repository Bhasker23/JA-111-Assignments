package com.operations;

import java.util.List;

import com.BeanClasses.Employee;
import com.EmployeeTableOperation.ImplTotalOperationOnEmployeeTable;
import com.EmployeeTableOperation.TotalOperationOnEmployeeTable;
import com.userDefinedException.EmployeeNotFound;

public class PrintAllEmployeeDetails {

	public static void main(String[] args) {

		TotalOperationOnEmployeeTable total= new ImplTotalOperationOnEmployeeTable();
		try {
			List<Employee> listEmployees= total.printAllEmployees();
			listEmployees.forEach(s->System.out.println(s.toString()));
			
		} catch (EmployeeNotFound e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
