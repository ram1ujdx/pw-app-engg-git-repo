package com.empmgmnt.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.empmgmnt.app.dao.EmployeeDaoJdbcImpl;
import com.empmgmnt.app.service.EmployeeServiceImpl;
import com.empmgmnt.app.ui.AppUi;

@Configuration
@ComponentScan(basePackages = {"com.empmgmnt.app"})
public class AppConfig {

	@Bean(name = "dbConnection")
	public Connection getDbConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/pwc_db";
		String username = "root";
		String password = "password";
		return DriverManager.getConnection(url,username,password);
	}
	
//	@Bean(name = "employeeDao")
//	public EmployeeDaoJdbcImpl getEmployeeDaoJdbcImpl() throws SQLException {
//		EmployeeDaoJdbcImpl dao=new EmployeeDaoJdbcImpl();
//		dao.setConn(getDbConnection());
//		return dao;
//	}
	
//	@Bean(name="employeeService")
//	public EmployeeServiceImpl getEmployeeServiceImpl() throws SQLException {
//		EmployeeServiceImpl service=new EmployeeServiceImpl();
//		service.setDao(getEmployeeDaoJdbcImpl());
//		return service;
//	}
	
//	@Bean(name="appUi")
//	public AppUi getAppUi() throws SQLException {
//		AppUi uiObj = new AppUi();
//		uiObj.setService(getEmployeeServiceImpl());
//		Scanner scanner = new Scanner(System.in);
//		uiObj.setScanner(scanner);
//		return uiObj;
//		
//	}
	
	
}
