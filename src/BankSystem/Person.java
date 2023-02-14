package BankSystem;
import java.util.Date;


//this class contains all the personal information of a person, it is a sort of database template
public class Person {
	private String name;
	private String surname;
	private String birthDate;
	private String SSN;
	private String city;
	private int ownerID;
	private java.util.Date dateCreated;
	
	public Person() {

	}
	
	
	public Person(String name, String surname, String birthDate, String ssn, String city, int owner_id) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.SSN = ssn;
		this.city = city;
		this.ownerID = owner_id;
		this.dateCreated = new java.util.Date();
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Account Holder [Account_id="+ ownerID + " - name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", SSN=" + SSN
				+ ", city=" + city + ", WithUsSince=" + dateCreated + "]";
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

}
