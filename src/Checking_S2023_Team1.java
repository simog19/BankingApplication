public class Checking_S2023_Team1 extends Account_S2023_Team1{
	private String type;
	
	
	public Checking_S2023_Team1(String account_number, String routing_number) {
		super(account_number, routing_number);
		setType();
	}

	//do checks on money availability and printing status of operation
	public void withdraw(double amount) {
		this.setBalance(this.getBalance()-amount);
	}


	public String getType() {
		return type;
	}


	public void setType() {
		type = "CheckingAccount";
	}
	
	@Override
	public String toString() {
		return "[Account_ID=" + getAccountNumber() +"type=" + type + ", getRouting_number()=" + getRouting_number() + ", getBalance()="
				+ getBalance()+"]";
	}

}

		
