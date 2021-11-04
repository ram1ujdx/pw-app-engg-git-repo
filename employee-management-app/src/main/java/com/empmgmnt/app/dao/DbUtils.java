package com.empmgmnt.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@Component
public class DbUtils {

	@Value("${dburl}")
	private String url;
	@Value("${dbusername}")
	private String username;
	@Value("${dbpassword}")
	private String password;
	
	
	
	public Connection getDbConnection() throws SQLException {
		
		return DriverManager.getConnection(url,username,password);
		
	}
	
	
}
