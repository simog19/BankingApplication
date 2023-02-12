
public class TestBankingApp {
	public static void main(String[] args) {
		
		//Creating three Account Holders: Name, Surname, Birth_date, SSN, City, 
		//account number temporarily assigned by hand
		
		System.out.println("Creating Database...");
		Person p1 = new Person("Simon", "Beng", "02/19/1997","1234567","NewYork",0001);
		Person p2 = new Person("Jeff", "Bezos", "04/09/1980","3344556","NewYork",0002);
		Person p3 = new Person("Simon", "Garl", "03/22/1995","7432154","NewYork",0003);
		System.out.println("...Database created");
		
		
		//routing number temporarily assigned by hand
		//creating an instance of Checking Account
		System.out.println("Creating Account1...");
		Account_S2023_Team1 account1= new Checking_S2023_Team1(p2.getOwnerID(), 00001,"12345678");
		System.out.println("1 Account created");
		
		//creating an instance of Saving Account
		System.out.println("Creating Account2...");
		Account_S2023_Team1 account2= new Savings_S2023_Team1(p3.getOwnerID(),00002,"45678901");
		System.out.println("2 Accounts created");
		
		System.out.println("Creating Account3...");
		Account_S2023_Team1 account3= new Savings_S2023_Team1(p1.getOwnerID(),00003,"45688999");
		System.out.println("3 Accounts created");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		//operation on the accounts
		
			//deposit
		account1.deposit(50.0);
		System.out.println("");
		account2.deposit(10000.0);
		System.out.println("");
		account3.deposit(100.0);
		System.out.println("");
		

		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");

		
		
			//charging fee
		account1.chargeFee(10.0);
		System.out.println("");
		account2.chargeFee(20.0);
		System.out.println("");
		account3.chargeFee(20.0);
		System.out.println("");
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");

		
			//withdrawal
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
}
