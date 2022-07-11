package com.EmployeeTableOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.BeanClasses.Employee;
import com.ProvideConnection.ConnectionProviderClass;
import com.userDefinedException.EmployeeNotFound;

public class ImplTotalOperationOnEmployeeTable implements TotalOperationOnEmployeeTable {
	
	//---------------------------------------enterIdGetSalryOfEmployee-------------------------------------------------------------------

	@Override
	public int enterIdGetSalryOfEmployee(int id) throws EmployeeNotFound {
		
		int salary=0;
		
		try(Connection connection= ConnectionProviderClass.methodConnectionProvide()) {
			
			PreparedStatement ps =connection.prepareStatement("select salary from employee where eid=?");
			
			ps.setInt(1, id);
			
			ResultSet a = ps.executeQuery();
			if(a.next()) salary=a.getInt("salary");
			else throw new EmployeeNotFound("Employee not found with id "+id);
			
		} catch (SQLException e) {
			
			throw new EmployeeNotFound(e.getMessage());
		}
		
		return salary;
	}
//---------------------------------------printAllEmployees-------------------------------------------------------------------
	
	
	@Override
	public List<Employee> printAllEmployees() throws EmployeeNotFound {
		List<Employee> listEmployees=new ArrayList<>();
		
		try(Connection connection= ConnectionProviderClass.methodConnectionProvide() ) {
			
			PreparedStatement ps= connection.prepareStatement("select * from employee");
			
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Employee employee= new Employee(resultSet.getInt("eid"), resultSet.getString("name"), resultSet.getString("address"), resultSet.getInt("salary"));
				listEmployees.add(employee);
			}
			
			if(listEmployees.size()==0) throw new EmployeeNotFound("No Employees"); 
			
		} catch (SQLException e) {
			throw new EmployeeNotFound(e.getMessage()); 
		}
		
		return listEmployees;
	}


	//---------------------------------------WithoutAddressInserFiels-------------------------------------------------------------------
	
	@Override
	public void withoutAddressInserFields(int id, String name, int salary) throws EmployeeNotFound {
		
		
		try(Connection connection= ConnectionProviderClass.methodConnectionProvide()) {
			
			PreparedStatement ps= connection.prepareCall("insert into employee(eid,name,salary) values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int a= ps.executeUpdate();
			if(a==0) throw new EmployeeNotFound("not inserted..");
			else System.out.println("inserted.");
			
			
		} catch (SQLException e) {
			throw new EmployeeNotFound(e.getMessage());
		}
	}
	//---------------------------------------searchEmployeeById-------------------------------------------------------------------


	@Override
	public Employee searchEmployee(int id) throws EmployeeNotFound {
		
		Employee employee=new Employee();
		
		try (Connection connection= ConnectionProviderClass.methodConnectionProvide()){
			
			PreparedStatement ps= connection.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, id);
			ResultSet rSet = ps.executeQuery();
			if(rSet.next()) {
				employee=new Employee(rSet.getInt("eid"), rSet.getString("name"),rSet.getString("address"), rSet.getInt("salary"));
			}
			
			
		} catch (SQLException e) {
			throw new EmployeeNotFound(e.getMessage());
		}
		
		return employee;
	}

	//---------------------------------------printAllEmployeesWithCondition-------------------------------------------------------------------

	@Override
	public List<Employee> printAllEmployeesWithCondition() throws EmployeeNotFound {
		List<Employee> listEmployees=new ArrayList<>();
		
		try(Connection connection= ConnectionProviderClass.methodConnectionProvide() ) {
			
			PreparedStatement ps= connection.prepareStatement("select * from employee where salary<80000");
			
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Employee employee= new Employee(resultSet.getInt("eid"), resultSet.getString("name"), resultSet.getString("address"), resultSet.getInt("salary"));
				listEmployees.add(employee);
			}
			
			if(listEmployees.size()==0) throw new EmployeeNotFound("No Employees"); 
			
		} catch (SQLException e) {
			throw new EmployeeNotFound(e.getMessage()); 
		}
		
		return listEmployees;
	}


	
}
