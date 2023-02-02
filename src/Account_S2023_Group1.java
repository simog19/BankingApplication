import java.util.Date;

public abstract class Account_S2023_Group1 {
	private String Name;
	private String Surname;
	private String Birth_date;
	private String SSN;
	private String Address;
	private String City;
	private long Zip_code;
	private String Account_number;
	private String Routing_number;
	private double Balance;
	private java.util.Date dateCreated;
	
	

	public Account_S2023_Group1(String name, String surname, String birth_date, String ssn, String address, String city,
			long zip_code, String account_number, String routing_number, double balance, Date dateCreated) {
		super();
		Name = name;
		Surname = surname;
		Birth_date = birth_date;
		SSN = ssn;
		Address = address;
		City = city;
		Zip_code = zip_code;
		Account_number = account_number;
		Routing_number = routing_number;
		Balance = balance;
		this.dateCreated = dateCreated;
	}
	
	public abstract void charge_fee(double fee);
	public abstract void deposit(double amount);
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getBirth_date() {
		return Birth_date;
	}

	public void setBirth_date(String birth_date) {
		Birth_date = birth_date;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String ssn) {
		SSN = ssn;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public long getZip_code() {
		return Zip_code;
	}

	public void setZip_code(long zip_code) {
		Zip_code = zip_code;
	}

	public String getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(String account_number) {
		Account_number = account_number;
	}

	public String getRouting_number() {
		return Routing_number;
	}

	public void setRouting_number(String routing_number) {
		Routing_number = routing_number;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	
}
