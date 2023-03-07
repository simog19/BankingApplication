package banksystem;

import java.security.InvalidAlgorithmParameterException;

import exceptions.InsufficientFundsException;
import exceptions.InvalidDepositAmountException;


/**
 * 
 * This class defines the structure of a bank account.
 *
 * @author Matthew Steckman, Simone Galota, Timothy Barefield, 
 * @version 1.0
 * @since 2023-02-01
 * 
 * 
 * */
public abstract class AccountS2023Team1 {
	private int ownerID;
	private int accountNumber;
	private String routingNumber;
	private double balance;
	
	
	/**
	 * Default constructor
	 * 
	 * */
	public AccountS2023Team1() {

	}
	
	/**
	 * 
	 * Another Constructor method for AccountS2023Team1 class
	 * 
	 * 
	 * */


	public AccountS2023Team1(int ownerId, int accountNumber, String routingNumber) {
		ownerID = ownerId;
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		balance = 0.00;
	}

	/** 
	 * This method implements fee charging operation.
	 * 
	 * @param fee, it must be greater than 0.0 and different from NaN and isInfinite 
	 * @throws InvalidAlgorithmParameterException 
	 * @throws ArithmeticException for handling overflow 
	 * 
	 * */
	public void chargeFee(double fee) throws InvalidAlgorithmParameterException {
		
		if (fee <= 0.0){
			throw new InvalidAlgorithmParameterException("fee param not valid");
		} 
		System.out.println("Account n." + this.getAccountNumber() + " - Charging Fee...");
		
		double newBalance = this.getBalance() - fee;
		
		if (Double.isInfinite(newBalance) || Double.isNaN(newBalance)) throw new ArithmeticException("underflow");
		
		this.setBalance(newBalance);		
		System.out.println("Fee Charged: $" + fee + " - New Balance: $" + this.getBalance());

		if (this.getBalance() < 0.0) {
			System.out.println("!!!! Account with insufficent funds !!!!");
		}
	}

	/** 
	 * This method implements deposit operation.
	 * 
	 * @param amount, it must be greater than 0.0 and different from NaN and isInfinite 
	 * @throws InvalidDepositAmountException 
	 * @throws ArithmeticException
	 * 
	 * */
	public void deposit(double amount) throws InvalidDepositAmountException {

		if (amount > 0) {
			System.out.println("Account n." + this.getAccountNumber() + " - Deposit ongoing... Current Balance: $"
					+ this.getBalance() + " - Amount to deposit: $" + amount);

			
			double newBalance = this.getBalance() - amount;
			
			if (Double.isInfinite(newBalance) || Double.isNaN(newBalance)) throw new ArithmeticException("overflow");
			
			
			this.setBalance(newBalance);	

			System.out.println("Deposit done! New Balance: $" + this.getBalance());

			if (this.getBalance() < 0.0) {
				System.out.println("!!!! Account still with insufficent funds !!!!");
			}

		} else {
			throw new InvalidDepositAmountException(amount);
		}

	}

	/** 
	 * This method implements withdraw operation.
	 * 
	 * @param amount, it must be greater than 0.0 and different from NaN and isInfinite 
	 * @throws InsufficientFundsException 
	 * @throws InvalidAlgorithmParameterException 
	 * 
	 * 
	 * */
	public abstract void withdraw(double amount) throws InsufficientFundsException, InvalidAlgorithmParameterException;

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
