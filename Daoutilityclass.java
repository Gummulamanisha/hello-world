package com.agilcrm.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Daoutilityclass {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root123");
			return con;
		} catch (Exception ex) {
			System.out.println("Error -->" + ex.getMessage());
			return null;
		}
}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
