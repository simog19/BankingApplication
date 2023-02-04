import java.util.Date;

public class Person {
	private String name;
	private String surname;
	private String birthDate;
	private String SSN;
	private String city;
	private String accountNumber;
	private java.util.Date dateCreated;
	
	protected Person() {

	}
	
	protected Person(String name, String surname, String birthDate, String ssn, String city, String accountNumber) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.SSN = ssn;
		this.city = city;
		this.accountNumber = accountNumber;
		this.dateCreated = new java.util.Date();
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

/*	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
*/
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/*
	public long getZip_code() {
		return zipCode;
	}

	public void setZip_code(int zip_code) {
		zipCode = zip_code;
	}
*/
	public String getAccount_number() {
		return accountNumber;
	}

	public void setAccount_number(String account_number) {
		accountNumber = account_number;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Account Holder [Account N.="+ accountNumber + " - name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", SSN=" + SSN
				+ ", city=" + city + ", dateCreated=" + dateCreated + "]";
	}

}
