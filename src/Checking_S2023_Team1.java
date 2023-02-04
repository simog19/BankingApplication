public class Checking_S2023_Team1 extends Account_S2023_Team1{
	private String type;
	
	public  Checking_S2023_Team1() {

	}
	
	public Checking_S2023_Team1(int owner_id, int account_number, String routing_number) {
		super(owner_id, account_number, routing_number);
		setType();
	}

	//do checks on money availability and printing status of operation
	@Override
	public void withdraw(double amount) {
		
		System.out.println("Account n."+this.getAccountNumber()+" - Withdraw ongoing... Current balance: $"+ this.getBalance());
		if ( this.getBalance()<= 0.0) {
			System.out.println("!!!! Insufficent Funds !!!! You cannot withdraw any amount of money.");
		}
		else if ((this.getBalance()-amount)<0.0) {
			System.out.println("!!!! Insufficent Funds !!!! You can withdraw at most: $" + this.getBalance());
		}
		else {
		
			this.setBalance(this.getBalance()-amount);
		
			System.out.println("Withdraw of $"+amount+" executed. New Balance: $" + this.getBalance());
		}
	}


	public String getType() {
		return type;
	}


	public void setType() {
		type = "CheckingAccount";
	}
	
	@Override
	public String toString() {
		return "[OwnerID="+ super.getOwnerID() +"Account_ID=" + getAccountNumber() +"type=" + type + ", getRouting_number()=" + getRouting_number() + ", getBalance()="
				+ getBalance()+"]";
	}

}

		
