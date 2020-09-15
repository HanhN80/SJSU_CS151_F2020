
public class Person {
	private String firstname;
	private String lastname;
	private int age;
	private String ssn;
	private String address;
	private String gender;
	private Double weight;

 Person (String firstname, String lastname, int age, String ssn, String address, String gender, Double weight ){
	 this.firstname = firstname;
	 this.lastname = lastname;
	 this.age = age;
	 this.ssn = ssn;
	 this.address = address;
	 this.gender = gender;
	 this.weight = weight;
	 
 }
 Person (Person P){
	 this.firstname = P.firstname;
	 this.lastname = P.lastname;
	 this.age = P.age;
	 this.ssn = P.ssn;
	 this.address = P.address;
	 this.gender = P.gender;
	 this.weight = P.weight;
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
 public void setaddress(String address) {
	 this.address = address;
 }
 public void setgender(String gender) {
	 this.gender = gender;
 }
 public void setweight(Double weight) {
	 this.weight = weight;
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
 public String getaddress() {
	 return address;
 }
 public String getgender() {
	 return gender;
 }
 public Double getweight() {
	 return weight;
 }
 public void calculatePay( Double hour, Double week) {
	 
	 
 }
 public String toString() {
	 String str = firstname + " " + lastname + " " + age + " " + ssn + " " + address + " " + gender + " " + weight + " ";
	return str;
	 
 }
 public void introduce() {
	 System.out.println("First name: " + firstname);
	 System.out.println("Last name : " + lastname);
	 System.out.println("Age       : " + age);
	 System.out.println("Social No : " + ssn);
	 System.out.println("Address   : " + address);
	 System.out.println("Gender    : " + gender);
	 System.out.println("Weight    : " + weight);
 }
}
