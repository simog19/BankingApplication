public class Savings_S2023_Team1 extends Account_S2023_Team1 {
	private String type;
	
	
	public Savings_S2023_Team1(String account_number, String routing_number) {
		super(account_number, routing_number);
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
		return "[Account_ID=" + getAccountNumber() +"type=" + type + ", getRouting_number()=" + getRouting_number() + ", getBalance()="
				+ getBalance()+"]";
	}
}
