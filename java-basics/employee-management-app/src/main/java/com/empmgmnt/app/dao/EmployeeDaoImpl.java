package com.empmgmnt.app.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empmgmnt.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static Map<Integer, Employee> employeeData=new HashMap<>();

	@Override
	public Employee saveEmployee(Employee employee) {
		
		employeeData.put(employee.getEmployeeId(),employee);
		
		return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeData.get(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		
		employeeData.remove(employeeId);
		
		return !employeeData.containsKey(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		employeeData.put(employee.getEmployeeId(),employee);
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return new ArrayList<>(employeeData.values());
	}
	
	

}
