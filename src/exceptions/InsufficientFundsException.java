package exceptions;

public class InsufficientFundsException extends Exception {
	private double balance;

	/** Construct an exception */
	public InsufficientFundsException(double balance) {
		super("Insufficient Funds: " + balance);
		this.balance = balance;
	}

	/** Return the balance */
	public double getBalance() {
		return balance;
	}
}
