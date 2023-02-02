import java.util.Date;

public class Savings_S2023_Team1 extends Account_S2023_Team1 {
	private String type;

	public Savings_S2023_Team1(String name, String surname, String birth_date, String ssn, String address, String city,
			long zip_code, String account_number, String routing_number, double balance) {
		super(name, surname, birth_date, ssn, address, city, zip_code, account_number, routing_number, balance);
		// TODO Auto-generated constructor stub
	}	
	
	public String getType() {
		return type;
	}


	public void setType() {
		type = "SavingAccount";
	}
}
