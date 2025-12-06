package BankDetail;

public class Account {
	
	private String accountNo;
	private double balance;

	
	public void setAccount(String accountNo) {
		
		
		this.accountNo=accountNo;
		
		
		
		
		
		
	}
	
	
	public String getAccount() {
		
		return accountNo;
	}
	
	
	
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
	
	public double getBalance() {
		return balance;
		
	}
	
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("total balance after deposit - "+balance);
		
	}
	
	
	public void withdrawn(double amount) {
	
		if(amount>balance) {
			System.out.println("insuffient balance");
			
		}
		
		else {
			balance=balance-amount;
			System.out.println("total balance after withdrawn - " +balance);
		}
		
	}
	

}
