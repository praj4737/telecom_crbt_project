package service;

import java.time.LocalDate;

public class Invoice{
	
	public String generateInvoice(String name, String mobile, double available_balance) {
		
		return "\n------------abc telecom invoice------------\nDate:"+LocalDate.now()+"\nYay!!Ring tone is set successfully for you \nName: "+name+"\n"+"Mobile: "+mobile+"\nDeducted: 50 rs.\navailable balance: "+available_balance+" rs.\nValidity: from and t0.\n----------------------------------------\n";
	}
	
}
