
public abstract class Person {

	protected String firstname;
	protected String lastname;
	protected int age;
	protected String ssn;
	protected Address address;
	
	public Person (String firstname, String lastname, int age, String ssn, Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setssn(String ssn) {
		this.ssn = ssn;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getfirstname() {
		return firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public int getage() {
		return age;
	}
	public String getssn() {
		return ssn;
	}
	public Address getAddress() {
		return address;
	}
	public String toString() {
		String str = "Firstname" + firstname + "LastName" + lastname + "Age" + age + "SSN" + ssn + "Address" + getAddress();
		return str;
	}

	public void display() {
		 System.out.println("First name    : " + firstname);
		 System.out.println("Last name 	   : " + lastname);
		 System.out.println("Age           : " + age);
		 System.out.println("Address       : " + getAddress());
		 
	}

}
