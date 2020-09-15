
public class Employee {
	private String firstname;
	private String lastname;
	private int age;
	private String ssn;
	private String address;
	private String gender;
	private Double weight;
	private int id;
	private String status; //(can be contractor, full time, part time), 
	private String contractor;
	private Double basePay;
	private Double netPayment;
	private Double HourAweek;
	private Double Week;
	
	
public Employee (String firstname, String lastname, int age, String ssn, String address, String gender, 
		Double weight, int id, String status, Double basePay, Double HourAweek)
{
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.ssn = ssn;
	this.address = address;
	this.gender = gender;
	this.weight = weight;
	this.id = id;
	this.status = status;
	this.basePay = basePay;
	this.HourAweek = HourAweek;
	
}
public Employee (String firstname, String lastname, int age, String ssn, String address, String gender, 
		Double weight, int id, String status, Double basePay, Double HourAweek, Double Week)
{
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.ssn = ssn;
	this.address = address;
	this.gender = gender;
	this.weight = weight;
	this.id = id;
	this.status = status;
	this.basePay = basePay;
	this.HourAweek = HourAweek;
	this.Week = Week;
	
}

Employee (Employee E)
{
	this.firstname = E.firstname;
	this.lastname = E.lastname;
	this.age = E.age;
	this.ssn = E.ssn;
	this.address = E.address;
	this.gender = E.gender;
	this.weight = E.weight;
	this.id = E.id;
	this.status = E.status;
	this.basePay = E.basePay;
}
public void setfirstname(String firstname) 
{
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
public void setid (int id)
{
	this.id = id;
}
public void setstatus(String status)
{
		this.status = status;
}
public void setcontractor(String contractor) {
	this.contractor = contractor;
}
public void setbasePay(Double basePay) { 
	if (basePay < 0.0)
	 throw new IllegalArgumentException("Base Pay must be >= 0.0");	
	this.basePay = basePay;
	
	}
public void setHourAweek(Double HourAweek) {
	this.HourAweek = HourAweek;
}
public void setWeek(Double Week) {
	this.Week = Week;
}
public void setnetPayment(Double netPayment) {
	this.netPayment = netPayment;
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
public int getid() 
{
	return id;
}
public String getstatus()
{
	return status;
}
public String getcontractor() {
	return contractor;
}
public Double getbasePay()
{
	return basePay;
}
public Double getHourAweek(){
	return HourAweek;
}
public Double getWeek() {
	    return Week;
}
public Double getnetPayment() {
	return netPayment;
}

public Double CalculatePay() {
	
	if (basePay>0 && basePay<=50) 
	{
	
	netPayment = basePay * HourAweek;
		System.out.println("Net Payment: " + netPayment);
		System.out.println("------------------------------");
	}
	else
	{
		
		netPayment = basePay  * 1/52 * getWeek() ;
		System.out.printf("Net Payment: %.2f " , netPayment);
		System.out.println();
	 	System.out.println("------------------------------");
		
	}
	
	return netPayment;
	
}

public void introduce() {
	 System.out.println("First name: " + firstname);
	 System.out.println("Last name : " + lastname);
	 System.out.println("Age       : " + age);
	 System.out.println("Social No : " + ssn);
	 System.out.println("Address   : " + address);
	 System.out.println("Gender    : " + gender);
	 System.out.println("Weight    : " + weight);
	 System.out.println("ID        : " + id);
	 System.out.println("Status    : " + status);
	 System.out.println("Base Pay  : " + basePay);
	 System.out.println("Hour Aweek: " + HourAweek);
	 System.out.println("Week      : " + Week);
	 System.out.println("------------------------------");
}
}
