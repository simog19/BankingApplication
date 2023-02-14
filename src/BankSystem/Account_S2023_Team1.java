package BankSystem;

//abstract class cannot be instantiated, but they can be subclassed
public abstract class Account_S2023_Team1 {
	private int ownerID;
	private int accountNumber;
	private String routingNumber;
	private double Balance;
	
	public  Account_S2023_Team1() {

	}

	public Account_S2023_Team1(int owner_id,int account_number, String routing_number) {
		ownerID = owner_id;
		accountNumber = account_number;
		routingNumber = routing_number;
		Balance = 0.00;
	}
	
	
	//method to charge fees
	public void chargeFee(double fee) {
		System.out.println("Account n."+this.getAccountNumber()+" - Charging Fee...");
		
		this.setBalance(this.getBalance()-fee);
		
		System.out.println("Fee Charged: $" + fee + " - New balance: $"+ this.getBalance());
		
		if (this.getBalance() < 0.0 ) {
			System.out.println("!!!! Account with insufficent funds !!!!");
		}
	}
	

	//method to deposit money
	public void deposit(double amount) {
		System.out.println("Account n."+this.getAccountNumber()+" - Deposit ongoing... Current balance: $"+ this.getBalance() + " - Amount to deposit: $"+amount);
		
		this.setBalance(this.getBalance()+amount);
		
		System.out.println("Deposit done! New balance: $"+ this.getBalance());
		
		if (this.getBalance() < 0.0 ) {
			System.out.println("!!!! Account still with insufficent funds !!!!");
		}
			
		
	}
	
	//method to withdraw to override
	public abstract void withdraw(double amount);

	public int getOwnerID() {
		return ownerID;
	}


	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}


	
	public String getRouting_number() {
		return routingNumber;
	}

	public void setRouting_number(String routing_number) {
		routingNumber = routing_number;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	

	
}
