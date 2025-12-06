package BankDetail;

import java.util.*;

public class AcountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		System.out.println("Customer Details....................................... ");
		// Name
		System.out.println("Enter name");
		String n = sc.nextLine();

		c.setName(n);
		System.out.println("Your Name is " + c.getName());

		
		
		System.out.println("Enter Address");
		String n1 = sc.nextLine();

		c.setAddress(n1);
		System.out.println("Your Address is " + c.getAddress());

		// Phone Number
		System.out.println("Enter Number");
		String n2 = sc.nextLine();

		c.setPhone(n2);
		System.out.println("Your Number is +91" + c.getPhone());

//Address
	
		System.out.println("Customer Bank Details....................................... ");
		Account a = new Account();
//Account number
		System.out.println("Enter Account number ");
		String n3=sc.nextLine();
		a.setAccount(n3);
		System.out.println("Your Account number is " + a. getAccount());
		
		//Balance;
		
				System.out.println("Enter Balance ");
				double n4=sc.nextDouble();
				a.setBalance(n4);
				System.out.println("Your Balance  is " + a. getBalance());
				char again ='Y';
				
				while(again=='Y' || again=='y') {
				//switch case menu
				   System.out.println("\nChoose Operation:");
			        System.out.println("1. Deposit");
			        System.out.println("2. Withdraw");
			        System.out.println("3. Check Balance");
			        System.out.println("4. Exit");
			        System.out.println("please select ");
			        int choice = sc.nextInt();
				
			switch(choice) {
			
			
			
			case 1 : 
				System.out.println("Enter Amount of Deposit");	
				int a1=sc.nextInt();
				a.deposit(a1);
				break;
			
			case 2: 
				System.out.println("Enter Amount of Withdraw");	
				int a2=sc.nextInt();
				
				a.withdrawn(a2);
				break;
			case 3:
				System.out.println("Your Balance  is " + a. getBalance());
			break;
			case 4 :
				System.out.println("Thankyou ! please visit again");
				break;
			
	 default:
         System.out.println("Invalid Choice!");
			}
			

		    System.out.print("\nDo you want to continue? (Y / N): ");
		    again = sc.next().charAt(0);   // y/n input
				}

System.out.println("Program Closed. Have a good day!");	
				
				
		
				
	}

}
