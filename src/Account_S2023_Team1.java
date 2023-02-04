
//abstract class cannot be instantiated, but they can be subclassed
public abstract class Account_S2023_Team1 {
	private String accountNumber;
	private String routingNumber;
	private double Balance;
	

	protected Account_S2023_Team1(String account_number, String routing_number) {
		setAccountNumber(account_number);
		routingNumber = routing_number;
		Balance = 0.0;
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


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	

	
}
