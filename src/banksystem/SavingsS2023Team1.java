package banksystem;

public class SavingsS2023Team1 extends AccountS2023Team1 {
	private String type;

	public SavingsS2023Team1() {

	}

	public SavingsS2023Team1(int ownerId, int accountNumber, String routingNumber) {
		super(ownerId, accountNumber, routingNumber);
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
		return "[OwnerID=" + super.getOwnerID() + "Account_ID=" + getAccountNumber() + "type=" + type
				+ ", getRouting_number()=" + getRouting_number() + ", getBalance()=" + getBalance() + "]";
	}

	@Override
	public void withdraw(double amount) {
		System.out.println(
				"Account n." + this.getAccountNumber() + " - You cannot withdraw any amount from this account. Sorry.");

	}
}
