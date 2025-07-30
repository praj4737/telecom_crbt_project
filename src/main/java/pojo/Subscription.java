package pojo;

public class Subscription {
	
	private int subscription_id;
	private String subscriptionType;
	private CRBTTones crbtTones;
	
	
	public Subscription() {
		
	}
	public Subscription(int subscription_id, CRBTTones crbtTones) {
		
		this.subscription_id = subscription_id;
		this.crbtTones = crbtTones;
	}
	public int getSubscription_id() {
		return subscription_id;
	}
	public void setSubscription_id(int subscription_id) {
		this.subscription_id = subscription_id;
	}
	public CRBTTones getCrbtTones() {
		return crbtTones;
	}
	public void setCrbtTones(CRBTTones crbtTones) {
		this.crbtTones = crbtTones;
	}
	
	public boolean subscribe(Customer customer) {
		
		
		return false;
	}
}
