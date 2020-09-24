
public class Contractor extends Employee{

	
	public Contractor(String firstname, String lastname, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double basePay, int numHrs) {
		super(firstname, lastname, age, ssn, address, id, educationLevel, directDeposit);
		this.basePay = basePay;
		this.numHrs = numHrs;
	}

	double basePay;
	int numHrs;
	double computePay;
	
	public void firstname() {
		super.getfirstname();
	}
	public void setbasePay(double basePay) {
		this.basePay = basePay;
	}
	public void setnumHurs(int numHrs) {
		this.numHrs = numHrs;
	}
	public double getbasePay() {
		return basePay;
	}
	public int getnnumHrs() {
		return numHrs;
	}
	public String toString() {
		String str = "Firstname" + super.getfirstname()
				+ "\n Lastname" + super.getlastname()
				+ "\nAddress" + super.getAddress()
				+ "\nPayment" + basePay
				+ "\numHrs"	  + numHrs;
		return str;
}
	public void introduce(boolean displaySSN) {
		
		if (displaySSN) {
			System.out.printf("SSN No: " + super.getssn());
			System.out.println();
		}
		else System.out.println("There is no SSN");		
	}
	
	
	public double computePay() {
		if (numHrs > 40) 
			return -1;
		
		else {
			computePay = numHrs * basePay;
			System.out.println("-----------------------------");
			System.out.printf("Compute Pay: %.2f" , computePay);
			System.out.println("\n-----------------------------");
		}
			
		return computePay;
			
	}
	
	
}
