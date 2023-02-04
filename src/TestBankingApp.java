
public class TestBankingApp {
	public static void main(String[] args) {
		
		//Creating three Account Holders: Name, Surname, Birth_date, SSN, City, 
		//account number temporarily assigned by hand
		//TO-DO: deal with the case of one person with more accounts 
		
		System.out.println("Creating Database...");
		Person p1 = new Person("Simon", "Beng", "02/19/1997","1234567","NewYork",0001);
		Person p2 = new Person("Jeff", "Bezos", "04/09/1980","3344556","NewYork",0002);
		Person p3 = new Person("Simon", "Garlic", "03/22/1995","7432154","NewYork",0003);
		System.out.println("...Database created");
		
		
		//routing number temporarily assigned by hand
		//creating an instance of Checking Account
		System.out.println("Creating Account1...");
		Account_S2023_Team1 account1= new Checking_S2023_Team1(p2.getOwnerID(), 00001,"12345678");
		System.out.println("Accont created");
		
		//creating an instance of Saving Account
		System.out.println("Creating Account2...");
		Account_S2023_Team1 account2= new Savings_S2023_Team1(p3.getOwnerID(),00002,"45678901");
		System.out.println("Account created");
		
		
		//operation on the accounts
		
			//deposit
		
			//charging fee
		
			//withdrawal
		
		
		
		
	}
}
