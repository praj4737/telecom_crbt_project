package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import crbt.db_utils.DBConnection;
import pojo.Customer;

public class CustomerDao {
	
	public boolean saveCustomer(Customer customer) {
		int row =0;
		try {
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		String query = "insert into user_details(name,mobile) values('"+customer.getName()+"','"+customer.getMobile()+"');";
		 row = st.executeUpdate(query);
		
		
		}catch(Exception se) {
			
		}
		
		return row>0?true:false;
	}
	
	public boolean updateBalance(double deductBalance) {
		int row =0;
		Connection con = DBConnection.getConnection();
		try {
		Statement st = con.createStatement();
		String query = "udpate user_details set balance = balance-"+deductBalance+";";
		row = st.executeUpdate(query);
		}catch (SQLException e) {
			// TODO: handle exception
		}
		
		return row>0?true:false;
	}	
	
	
	
	
	
	
}
