package com.empmgmnt.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.empmgmnt.app.dao.EmployeeDao;
import com.empmgmnt.app.dao.EmployeeDaoImpl;
import com.empmgmnt.app.dao.EmployeeDaoJdbcImpl;
import com.empmgmnt.app.model.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	@Qualifier("empHashMapDao")
	private EmployeeDao dao;
	
	
	
	
	public EmployeeServiceImpl() {
	}
	
	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		
		return dao.saveEmployee(employee);
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws Exception {
		
		return dao.getEmployeeById(employeeId);
	}

}
