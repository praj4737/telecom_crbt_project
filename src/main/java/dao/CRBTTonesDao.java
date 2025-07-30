package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import crbt.db_utils.DBConnection;

public class CRBTTonesDao {
	
	public List<String> getTones(){
		Connection con = DBConnection.getConnection();
		try {
		Statement st = con.createStatement();
		}catch (SQLException e) {
			System.out.println("Failed to create statement.");
		}
		
	}

}
