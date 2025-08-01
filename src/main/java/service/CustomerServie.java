package service;

import dao.CustomerDao;
import pojo.Customer;

public class CustomerServie {
	
	public boolean createCustomer(Customer customer) {
		if(null ==customer.getName() || customer.getMobile()<10 || customer.getName().isBlank()) {
			return false;
		}
		return new CustomerDao().saveCustomer(customer);
	}
	public boolean updateCustomerBalance(double deductBalance,String mobile) {
		
		return new CustomerDao().updateBalance(deductBalance,mobile);
	}

}
