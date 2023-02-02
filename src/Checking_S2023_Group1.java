import java.util.Date;

public class Checking_S2023_Group1 extends Account_S2023_Group1{
	private String Type;

	public Checking_S2023_Group1(String name, String surname, String birth_date, String ssn, String address,
			String city, long zip_code, String account_number, String routing_number, double balance,
			Date dateCreated) {
		super(name, surname, birth_date, ssn, address, city, zip_code, account_number, routing_number, balance, dateCreated);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void charge_fee(double fee) {
		this.setBalance(this.getBalance()-fee);
	}
  
	public void withdraw(double amount) {
		this.setBalance(this.getBalance()-amount);
	}

	@Override
	public void deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
		
	}
	
  
  
}
