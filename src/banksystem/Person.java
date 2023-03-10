package banksystem;

// import java.util.Date;

/**
 * 
 * Defines a customer and all its bio details.
 * 
 * 
 * @author Matthew Steckman, Simone Galota, Timothy Barefield, 
 * @version 1.0
 * @since 2023-02-01
 * 
 * 
 * */
public class Person {
	private String name;
	private String surname;
	private String birthDate;
	private String ssn;
	private String city;
	private int ownerID;
	private java.util.Date dateCreated;

	
	/**
	 * Default constructor
	 * 
	 * */
	public Person() {

	}
	
	/**
	 * Another constructor for class Person
	 * 
	 * */

	public Person(String name, String surname, String birthDate, String ssn, String city, int ownerId) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.ssn = ssn;
		this.city = city;
		this.ownerID = ownerId;
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

	public void setBirth_date(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Account Holder [Account_id=" + ownerID + " - name=" + name + ", surname=" + surname + ", birthDate="
				+ birthDate + ", SSN=" + ssn + ", city=" + city + ", WithUsSince=" + dateCreated + "]";
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

}
