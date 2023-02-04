public class Savings_S2023_Team1 extends Account_S2023_Team1 {
	private String type;
	
	public  Savings_S2023_Team1() {

	}
	
	
	public Savings_S2023_Team1(int owner_id, int account_number, String routing_number) {
		super(owner_id,account_number, routing_number);
		setType();
	}

	
	public String getType() {
		return type;
	}

	public void setType() {
		type = "SavingAccount";
	}
	

	@Override
	public String toString() {
		return "[OwnerID="+ super.getOwnerID() +"Account_ID=" + getAccountNumber() +"type=" + type + ", getRouting_number()=" + getRouting_number() + ", getBalance()="
				+ getBalance()+"]";
	}


	@Override
	public void withdraw(double amount) {
		System.out.println("Account n."+this.getAccountNumber()+" - You cannot withdraw any amount from this account. Sorry.");
		
	}
}
