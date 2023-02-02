
//abstract class cannot be instantiated, but they can be subclassed
public abstract class Account_S2023_Group1 {
	private String name;
	private String surname;
	private String birthDate;
	private String SSN;
	private String address;
	private String city;
	private long zipCode;
	private String accountNumber;
	private String routingNumber;
	private double Balance;
	public String Type;
	private java.util.Date dateCreated;
	
	

	public Account_S2023_Group1(String name, String surname, String birth_date, String ssn, String address, String city, long zip_code, String account_number, String routing_number, double balance) {
		this.name = name;
		this.surname = surname;
		birthDate = birth_date;
		SSN = ssn;
		this.address = address;
		this.city = city;
		zipCode = zip_code;
		accountNumber = account_number;
		routingNumber = routing_number;
		Balance = 0.0;
		dateCreated = new java.util.Date();
	}
	
	@Override
	public String toString() {
		return "Account_S2023_Group1 [Name:" + name + ", Surname:" + surname + ", Birth_date:" + birthDate + ", SSN:"
				+ SSN + ", Address:" + address + ", City:" + city + ", Zip_code:" + zipCode + ", Account_number:"
				+ accountNumber + ", Routing_number:" + routingNumber + ", Balance:" + Balance + ", dateCreated:"
				+ dateCreated + "]";
	}

	public void chargeFee(double fee) {
		this.setBalance(this.getBalance()-fee);
	}
	

	public void deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirth_date() {
		return birthDate;
	}

	public void setBirth_date(String birth_date) {
		birthDate = birth_date;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String ssn) {
		SSN = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZip_code() {
		return zipCode;
	}

	public void setZip_code(long zip_code) {
		zipCode = zip_code;
	}

	public String getAccount_number() {
		return accountNumber;
	}

	public void setAccount_number(String account_number) {
		accountNumber = account_number;
	}

	public String getRouting_number() {
		return routingNumber;
	}

	public void setRouting_number(String routing_number) {
		routingNumber = routing_number;
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
