package crbt.db_utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection con = null;
	private static final String USER_NAME = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/telecom_demo_crbt";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			System.out.println("Driver not found!!");
		}
		try {
		con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("failed to create conection.");
		}
		
		return con;
	}
	
	

}
