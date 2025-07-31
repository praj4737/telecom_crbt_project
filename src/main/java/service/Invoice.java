package service;

import pojo.Billing;

public class Invoice implements Billing{
	public static final double callerTunePrice = 50;

	@Override
	public boolean deduct() {
		new CustomerServie().updateCustomerBalance(callerTunePrice);
		return false;
	}
	public String generateInvoice(String name, String mobile, double available_balance) {
		
		return "\n--------abc telecom invoice-------\n Name: "+name+"\n"+"Mobile: "+mobile+"\n available balance: "+available_balance+"\n";
	}
	
}
