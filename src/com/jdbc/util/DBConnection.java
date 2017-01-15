package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public Connection getConnection() throws Exception{
		Connection conn=null;
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productmanagement","root","Raha_634709");
		if (conn != null){
			System.out.println("Connected");
		}
		return conn;
	}

}
