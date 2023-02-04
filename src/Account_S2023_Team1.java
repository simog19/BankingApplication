
//abstract class cannot be instantiated, but they can be subclassed
public abstract class Account_S2023_Team1 {
	private int ownerID;
	private int accountNumber;
	private String routingNumber;
	private double Balance;
	

	protected Account_S2023_Team1(int owner_id,int account_number, String routing_number) {
		ownerID=owner_id;
		accountNumber=account_number;
		routingNumber = routing_number;
		Balance = 0.0;
	}
	

	public int getOwnerID() {
		return ownerID;
	}


	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}


	public String getRoutingNumber() {
		return routingNumber;
	}


	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}


	//
	public void chargeFee(double fee) {
		
		this.setBalance(this.getBalance()-fee);
	}
	

	//
	public void deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
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
