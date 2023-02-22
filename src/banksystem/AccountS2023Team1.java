package banksystem;

import exceptions.InsufficientFundsException;
import exceptions.InvalidDepositAmountException;

//abstract class cannot be instantiated, but they can be subclassed
public abstract class AccountS2023Team1 {
	private int ownerID;
	private int accountNumber;
	private String routingNumber;
	private double balance;

	public AccountS2023Team1() {

	}

	public AccountS2023Team1(int ownerId, int accountNumber, String routingNumber) {
		ownerID = ownerId;
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		balance = 0.00;
	}

	/** method to charge fees*/
	public void chargeFee(double fee) {
		System.out.println("Account n." + this.getAccountNumber() + " - Charging Fee...");

		this.setBalance(this.getBalance() - fee);

		System.out.println("Fee Charged: $" + fee + " - New Balance: $" + this.getBalance());

		if (this.getBalance() < 0.0) {
			System.out.println("!!!! Account with insufficent funds !!!!");
		}
	}

	/** method to deposit money */
	public void deposit(double amount) throws InvalidDepositAmountException {

		if (amount > 0) {
			System.out.println("Account n." + this.getAccountNumber() + " - Deposit ongoing... Current Balance: $"
					+ this.getBalance() + " - Amount to deposit: $" + amount);

			this.setBalance(this.getBalance() + amount);

			System.out.println("Deposit done! New Balance: $" + this.getBalance());

			if (this.getBalance() < 0.0) {
				System.out.println("!!!! Account still with insufficent funds !!!!");
			}

		} else {
			throw new InvalidDepositAmountException(amount);
		}

	}

	/** method to withdraw to override */
	public abstract void withdraw(double amount) throws InsufficientFundsException;

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public String getRouting_number() {
		return routingNumber;
	}

	public void setRouting_number(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}
