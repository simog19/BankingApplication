package exceptions;


public class InvalidDepositAmountException extends Exception {
	private double amount;

	/** Construct an exception */
	public InvalidDepositAmountException(double amount) {
		super("Amount not valid: " + amount);
		this.amount = amount;
	}

	/** Return the amount */
	public double getAmount() {
		return amount;
	}
}
