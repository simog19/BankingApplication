package junit;

import banksystem.*;
import exceptions.InsufficientFundsException;
import exceptions.InvalidDepositAmountException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AccountBankingTest {

	@Test
	public void testAccount() {
		Person p1 = new Person("Simon", "Beng", "02/19/1997", "1234567", "NewYork", 0001);
		CheckingS2023Team1 account1 = new CheckingS2023Team1(p1.getOwnerID(), 00001, "12345678");

		assertEquals(0001, account1.getOwnerID());
		assertEquals(00001, account1.getAccountNumber());
		assertEquals("12345678", account1.getRouting_number());
		assertEquals("CheckingAccount", account1.getType());

		Person p2 = new Person("Jeff", "Bezos", "04/09/1980", "3344556", "NewYork", 0002);
		SavingsS2023Team1 account2 = new SavingsS2023Team1(p2.getOwnerID(), 00002, "45678901");

		assertEquals(0002, account2.getOwnerID());
		assertEquals(00002, account2.getAccountNumber());
		assertEquals("45678901", account2.getRouting_number());
		assertEquals("SavingAccount", account2.getType());

	}

	@Test
	public void testDeposit() throws InvalidDepositAmountException {
		Person p1 = new Person("Simon", "Beng", "02/19/1997", "1234567", "NewYork", 0001);
		AccountS2023Team1 account1 = new CheckingS2023Team1(p1.getOwnerID(), 00001, "12345678");

		account1.deposit(10.0);

		assertEquals(10.0, account1.getBalance());

		Person p2 = new Person("Jeff", "Bezos", "04/09/1980", "3344556", "NewYork", 0002);
		AccountS2023Team1 account2 = new SavingsS2023Team1(p2.getOwnerID(), 00002, "45678901");

		account2.deposit(15.0);
		assertEquals(15.0, account2.getBalance());

	}

	/*
	 * @Test public void testDepositSavings() { Person p1 = new Person("Simon",
	 * "Beng", "02/19/1997","1234567","NewYork",0001); Account_S2023_Team1 account1=
	 * new Savings_S2023_Team1(p1.getOwnerID(), 00001,"12345678");
	 * 
	 * account1.deposit(10.0);
	 * 
	 * assertEquals(10.0,account1.getBalance()); }
	 */

	@Test
	public void testChargeFee() throws InvalidDepositAmountException {
		Person p1 = new Person("Simon", "Beng", "02/19/1997", "1234567", "NewYork", 0001);
		AccountS2023Team1 account1 = new CheckingS2023Team1(p1.getOwnerID(), 00001, "12345678");

		account1.deposit(10.00);
		account1.chargeFee(6.00);

		assertEquals(4.0, account1.getBalance());

		Person p2 = new Person("Jeff", "Bezos", "04/09/1980", "3344556", "NewYork", 0002);
		AccountS2023Team1 account2 = new SavingsS2023Team1(p2.getOwnerID(), 00002, "45678901");

		account2.chargeFee(1.0);
		assertEquals(-1.0, account2.getBalance());
	}

	@Test
	public void testWithdrawal() throws InvalidDepositAmountException, InsufficientFundsException {
		Person p1 = new Person("Simon", "Beng", "02/19/1997", "1234567", "NewYork", 0001);
		AccountS2023Team1 account1 = new CheckingS2023Team1(p1.getOwnerID(), 00001, "12345678");

		account1.deposit(100.0);
		account1.withdraw(50.0);

		assertEquals(50.0, account1.getBalance());

		Person p2 = new Person("Jeff", "Bezos", "04/09/1980", "3344556", "NewYork", 0002);
		AccountS2023Team1 account2 = new SavingsS2023Team1(p2.getOwnerID(), 00002, "45678901");

		account2.deposit(15.0);
		account2.withdraw(50.0);

		assertEquals(15.0, account2.getBalance());

	}

}
