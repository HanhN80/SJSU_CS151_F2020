
public class FullTimeEmployee extends Employee {

	
	public FullTimeEmployee(String firstname, String lastname, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit) {
		super(firstname, lastname, age, ssn, address, id, educationLevel, directDeposit);
		// TODO Auto-generated constructor stub
	}
	double basePay; // salary per year
	
	public void setbasePay(double basePay) {
		this.basePay = basePay;
	}
	public double getbasePay() {
		return basePay;
	}
	public String toString() {
		String str = "Firstname" + getfirstname()
				+ "\n Lastname" + getlastname()
				+ "\nAddress" + getAddress()
				+ "\nID" + getid()
				+ "\nbasePay" + basePay;			
			
		return str;
	}
}
