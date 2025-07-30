package pojo;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private long mobile;
	private List<Subscription> subscriptions;
	
	
	
	public Customer() {
		
	}

	

	public Customer(int id, String name, long mobile, List<Subscription> subscriptions) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.subscriptions = subscriptions;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getMobile() {
		return mobile;
	}



	public void setMobile(long mobile) {
		this.mobile = mobile;
	}



	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}



	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	public String toString() {
		
		return "Customer Name: "+this.name+" Mobile: "+this.mobile;
	}
	
	

}