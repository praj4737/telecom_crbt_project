package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import crbt.db_utils.DBConnection;
import pojo.Customer;

public class CustomerDao {
	
	public boolean saveCustomer(Customer customer) {
		
		try {
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		String query = "insert into user_details(name,mobile) values('"+customer.getName()+"','"+customer.getMobile()+"');";
		int row = st.executeUpdate(query);
		
		if(row>0) {
			return true;
		}
		}catch(Exception se) {
			
		}
		
		return false;
	}
}
