package com.empmgmnt.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.empmgmnt.app.model.Employee;

@Component("empJdbcDao")
public class EmployeeDaoJdbcImpl implements EmployeeDao{

	@Autowired
	private Connection conn;
	
	private PreparedStatement psmt;
	
	
	
	

	@Override
	public Employee saveEmployee(Employee employee) throws SQLException {
		
		
		String query= "insert into emp values(?,?,?,?)";
		psmt=conn.prepareStatement(query);
		
		psmt.setInt(1, employee.getEmployeeId());
		
		psmt.setString(2, employee.getEmployeeName());
		
		
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		
		psmt.setString(3, dateString);
		
		psmt.setString(4, employee.getEmail());
		
		int updatedRowCount = psmt.executeUpdate();
		
		if(updatedRowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(int employeeId) throws SQLException {
		
		
		String query= "select * from emp where employeeId=?";
		psmt=conn.prepareStatement(query);
		psmt.setInt(1, employeeId);
		
		ResultSet resultSet = psmt.executeQuery();
		
		Employee employee=null;
		
		if(resultSet.next()) {
			employee=new Employee();
			
			employee.setEmployeeId(employeeId);
			employee.setEmployeeName(resultSet.getString("employeeName"));
			LocalDate dob = LocalDate.parse(resultSet.getString("dob"));
			employee.setDob(dob);
			employee.setEmail(resultSet.getString("email"));	
		}
		
		return employee;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws SQLException {
		
		
		String query= "update emp set employeeName=? email=? dob=? where employeeId=?";
		psmt=conn.prepareStatement(query);
		
		psmt.setInt(4, employee.getEmployeeId());
		
		psmt.setString(1, employee.getEmployeeName());
		
		
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		
		psmt.setString(3, dateString);
		
		psmt.setString(2, employee.getEmail());
		
		int updatedRowCount = psmt.executeUpdate();
		
		if(updatedRowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		
		
		String query= "select * from emp";
		psmt=conn.prepareStatement(query);
		
		
		ResultSet resultSet = psmt.executeQuery();
		
		Employee employee=null;
		List<Employee> employeeList=new ArrayList<>();
		
		while(resultSet.next()) {
			employee=new Employee();
			
			employee.setEmployeeId(resultSet.getInt("employeeId"));
			employee.setEmployeeName(resultSet.getString("employeeName"));
			LocalDate dob = LocalDate.parse(resultSet.getString("dob"));
			employee.setDob(dob);
			employee.setEmail(resultSet.getString("email"));
			
			employeeList.add(employee);
		}
		return employeeList;
		
	}

}
