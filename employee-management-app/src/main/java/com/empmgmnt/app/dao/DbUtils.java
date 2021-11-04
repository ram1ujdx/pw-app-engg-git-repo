package com.empmgmnt.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class DbUtils {

	
	
	public static Connection getDbConnection() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/pwc_db";
		String username = "root";
		String password = "password";
		
	
		
		return DriverManager.getConnection(url,username,password);
		
	}
	
	
}
