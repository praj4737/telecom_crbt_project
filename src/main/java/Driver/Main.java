package Driver;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import dao.CRBTTonesDao;
import pojo.Customer;
import service.CRBTService;
import service.CustomerServie;
import service.Invoice;

public class Main {
	public static void main(String[] args) throws Exception{
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
				System.out.println("-----------------------------------------");
				System.out.println(new CRBTService().getTones());
				System.out.println("-----------------------------------------");
				break;
			case 3:
				String mobileNumber = readPhoneNumber(sc);
				if(new CRBTService().setTone(mobileNumber, readSongId(sc))) {
					System.out.println("Caller tune set successfully.");
					new Invoice().deduct();
					CRBTTonesDao dao = new CRBTTonesDao();
					ResultSet rs = dao.getCustomerDetails(mobileNumber);
					
					if(rs.next()) {
						new Invoice().generateInvoice(rs.getString(2), mobileNumber, choice);
					}else {
						System.out.println("failed to generate invoice.");
					}
					
				}else {
					System.out.println("failed to set caller tune .");
				}
				
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
	public static int readSongId(Scanner sc) {
		System.out.println("Enter the song id you want as caller tune: ");
		int songId = sc. nextInt();
		return songId;
	}
	public static String readPhoneNumber(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter ypur Phone number"); 
		String mobileNumber = sc.nextLine();
		
		return mobileNumber;
	}
}









