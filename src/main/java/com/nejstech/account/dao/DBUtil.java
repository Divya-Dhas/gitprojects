package com.nejstech.account.dao;

import java.sql.DriverManager;
import java.sql.Connection;
public class DBUtil {
	
	public static Connection getDBConnection() throws SQLException{
		Connection connection = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver);
			connection = DriverManager.getConnection(jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example")
					
					
		}catch(Exception e) {
		e.printStackTrace();
	}
        return connection;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
