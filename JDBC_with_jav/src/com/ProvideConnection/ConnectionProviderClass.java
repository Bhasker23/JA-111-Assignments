package com.ProvideConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProviderClass {

	public static Connection methodConnectionProvide() {
		
		Connection connectionObj = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String string= "jdbc:mysql://localhost:3306/db1";
		
		try {
			connectionObj = DriverManager.getConnection(string, "root", "L@xmi16101995");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connectionObj;
		
	}

}
