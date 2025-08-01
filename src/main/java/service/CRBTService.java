package service;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

import crbt.db_utils.DBConnection;
import dao.CRBTTonesDao;
import pojo.Customer;

public class CRBTService{
	
	public static final double callerTunePrice = 50;
	
	public HashMap<String, String> getTones(){
		ResultSet rs = new CRBTTonesDao().getTones();
		HashMap<String, String> map = new HashMap<String, String>();
		
		try {
			while(rs.next()) {
				map.put( rs.getInt(1)+". "+rs.getString(3),rs.getString(2) );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}
	public boolean setTone(String mobileNumber, int toneId) {
		
		return new CRBTTonesDao().setTone(mobileNumber, toneId);
		
	}
	public boolean deduct(String mobile) {
		
		return new CustomerServie().updateCustomerBalance(callerTunePrice,mobile);
	}
	public boolean deactivateRingtone(String mobileNumber) {
		
		return new CRBTTonesDao().decativateRingtone(mobileNumber);
	}

}













