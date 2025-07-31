package dao;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import crbt.db_utils.DBConnection;
import pojo.Customer;

public class CRBTTonesDao {
	
	public ResultSet getTones(){
		Connection con = DBConnection.getConnection();
		ResultSet rs = null;
		
		try {
		Statement st = con.createStatement();
		String query = "select * from crbt_tones;";
		 rs = st.executeQuery(query);
		
		
		
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println("statement not initialized properly.");
		}
		
		return rs;
		
	}
	public boolean setTone(String mobileNumber, int toneId) {
		int row = 0;
		int id =getCustomerId(mobileNumber);
		try {
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
	 	String query = "insert into subscription(subscription_type,crbt_id,user_id) values('caller tune',"+"'"+toneId+"','"+id+"');";   
	 	row = st.executeUpdate(query);
	 	
		}catch (SQLException e) {
			// TODO: handle exception
		}
		
		return row>0?true:false;
	}
	
	public int getCustomerId(String mobileNumber) {
		Connection con = DBConnection.getConnection();
		int id =0;
		ResultSet rs = null;
		try {
		Statement st = con.createStatement();
		String query = "select id,name from user_details where mobile = '"+mobileNumber+"';";
		 rs = st.executeQuery(query);
		 //always move the result set to next before accessing data
		 //otherwise the cursor will be default at 0;
		 if(rs.next()) {
		 id = rs.getInt(1);
		 }
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(mobileNumber);
		
		System.out.println("customer id: "+id);
		
		return id;
	}
	public ResultSet getCustomerDetails(String mobileNumber) {
		Connection con = DBConnection.getConnection();
		int id =0;
		ResultSet rs = null;
		try {
		Statement st = con.createStatement();
		String query = "select id,name from user_details where mobile = '"+mobileNumber+"';";
		 rs = st.executeQuery(query);
		 //always move the result set to next before accessing data
		 //otherwise the cursor will be default at 0;
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(mobileNumber);
		
		System.out.println("customer id: "+id);
		
		return rs;
	}

}







