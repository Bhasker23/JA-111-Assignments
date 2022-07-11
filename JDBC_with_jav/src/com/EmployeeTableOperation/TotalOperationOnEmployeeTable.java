package com.EmployeeTableOperation;

import java.util.List;

import com.BeanClasses.Employee;
import com.userDefinedException.EmployeeNotFound;

public interface TotalOperationOnEmployeeTable {

	public int enterIdGetSalryOfEmployee(int roll) throws EmployeeNotFound;
	
	public List<Employee> printAllEmployees() throws EmployeeNotFound;

	public void withoutAddressInserFields(int id, String name, int salary) throws EmployeeNotFound;
	
	public Employee searchEmployee(int id) throws EmployeeNotFound;
	
	public List<Employee> printAllEmployeesWithCondition() throws EmployeeNotFound;
}
