package banksystem;

import java.security.InvalidAlgorithmParameterException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exceptions.InsufficientFundsException;
import exceptions.InvalidDepositAmountException;



/**
 * 
 * The BankingApp program implements an application for supporting banking system in its procedure.
 * 
 * @author Matthew Steckman, Simone Galota, Timothy Barefield, 
 * @version 1.0
 * @since 2023-02-01
 * 
 * */
public class TestBankingApp {
	
	private static Logger logger = LogManager.getLogger(TestBankingApp.class.getName());
	
	
	/**
	 * 
	 * This is the main method in which we create a demo customers database and make use of deposit, chargingfee, withdraw methods.
	 * 
	 * @author Matthew Steckman, Simone Galota, Timothy Barefield, 
	 * @version 1.0
	 * @throws InvalidAlgorithmParameterException 
	 * @since 2023-02-01
	 * 
	 * */
	public static void main(String[] args) throws InvalidAlgorithmParameterException {

		// Creating three Account Holders: Name, Surname, Birth_date, SSN, City,
		// account number temporarily assigned by hand

		System.out.println("Creating Database...");
		Person p1 = new Person("Simon", "Beng", "02/19/1997", "1234567", "NewYork", 0001);
		Person p2 = new Person("Jeff", "Bezos", "04/09/1980", "3344556", "NewYork", 0002);
		Person p3 = new Person("Simon", "Garl", "03/22/1995", "7432154", "NewYork", 0003);
		System.out.println("...Database created");
		
		logger.info("Database created successfully");

		// routing number temporarily assigned by hand
		// creating an instance of Checking Account
		System.out.println("Creating Account1...");
		AccountS2023Team1 account1 = new CheckingS2023Team1(p2.getOwnerID(), 00001, "12345678");
		System.out.println("1 Account created");
		
		logger.info("Checking Account created successfully");

		// creating an instance of Saving Account
		System.out.println("Creating Account2...");
		AccountS2023Team1 account2 = new SavingsS2023Team1(p3.getOwnerID(), 00002, "45678901");
		System.out.println("2 Accounts created");
		
		logger.info("Saving Account created successfully");

		// creating an instance of Saving Account
		System.out.println("Creating Account3...");
		AccountS2023Team1 account3 = new SavingsS2023Team1(p1.getOwnerID(), 00003, "45688999");
		System.out.println("3 Accounts created");
		
		logger.info("Saving Account created successfully");
		
		// creating an instance of Saving Account
		System.out.println("");
		System.out.println("");
		System.out.println(
				"---------------------------------**DEPOSIT TEST**-----------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		

		// ******** TEST: operation on the accounts

		// deposit
		try {
			account1.deposit(50.0);
			System.out.println("");
			account2.deposit(10000.0);
			System.out.println("");
			account3.deposit(100.0);
			System.out.println("");
			account3.deposit(-1.0);
			System.out.println("");

		} catch (InvalidDepositAmountException ex) {
			logger.error("Deposit failed");
			System.out.println(ex);
		}

		System.out.println("");
		System.out.println(
				"--------------------------------**CHARGING FEE TEST**----------------------------------------------");
		System.out.println("");

		// charging fee
		account1.chargeFee(10.54);
		System.out.println("");
		account2.chargeFee(23.44);
		System.out.println("");
		account3.chargeFee(2.50);
		System.out.println("");

		System.out.println("");
		System.out.println(
				"----------------------------------**WITHDRAW TEST**----------------------------------------------");
		System.out.println("");

		// withdrawal
		try {
			account1.withdraw(30);
			System.out.println("");
			account1.withdraw(15);
			System.out.println("");
			account1.chargeFee(15);
			System.out.println("");
			account1.withdraw(20);
			System.out.println("");
			account2.withdraw(20);
		}

		catch (InsufficientFundsException ex) {
			logger.error("Withdraw failed");
			System.out.println(ex);
		}
		
		//********************************************************encryption
		
    	String plaintext1 = account1.toString();
    	String plaintext2 = account2.toString();
    	String plaintext3 = account3.toString();
    	
        String phonykey = "phonykeyAbc123456abc!!!"; 
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------**Encryption TEST**------------------------------------------");
        System.out.println("");
        System.out.println("input text : " + plaintext1);
        System.out.println("secret : " + phonykey);
        
        String encryptedString1 = Encryption.encrypt(plaintext1, phonykey);
        String encryptedString2 = Encryption.encrypt(plaintext2, phonykey);
        String encryptedString3 = Encryption.encrypt(plaintext3, phonykey);
        
        // encryption pass       
        System.out.println("cipher text: " + encryptedString1);
        
        //String decryptedString = Encryption.decrypt(encryptedString, phonykey);
        
        // decryption phase, if you need to work on them in plaintext
        //System.out.println("plain text : " + decryptedString );
        

	}
}
