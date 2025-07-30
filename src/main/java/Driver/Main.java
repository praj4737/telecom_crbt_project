package Driver;

import java.util.Scanner;

import pojo.Customer;
import service.CustomerServie;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Customer customer = new Customer();
//		customer.setName("Pranav");
//		customer.setMobile(1234567898);
//		
//		System.out.println(new CustomerServie().createCustomer(customer));
		int choice =0;
		do {
			System.out.println("1.create customer");
			System.out.println("2.get ringtones");
			System.out.println("3.set ringtone");
			System.out.println("4.get customer");
			System.out.println("5.deactivate ringtone");
			System.out.println("0.exit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(new CustomerServie().createCustomer(readCustomerDetails())) {
					System.out.println("Customer Registerd Sucessfully.");
					//System.out.println(customer);
				}else {
					System.out.println("Failed to create customer try again.");
				}
				break;
			case 2:
				//pass.
				break;

			default:
				break;
			}
			
		}while(choice!=0);
		
		
		
	}
	
	public static Customer readCustomerDetails() {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println();
		customer.setName(name);
		sc.nextLine();
		
		System.out.println("Enter your mobile number: ");
		customer.setMobile(Long.parseLong(sc.nextLine()));
		
		return customer;
	}
}









