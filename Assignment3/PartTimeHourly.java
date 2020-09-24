
public class PartTimeHourly extends Employee{

	public PartTimeHourly(String firstname, String lastname, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double HourlyPay, int numHrs) {
		super(firstname, lastname, age, ssn, address, id, educationLevel, directDeposit);
		this.HourlyPay = HourlyPay;
		this.numHrs = numHrs;
	}

	double HourlyPay;	// money earned per hour
	int numHrs;			// number hours per week
	double computePay;

	public void setHourlyPay(double HourlyPay) {
		this.HourlyPay = HourlyPay;
	}
	public void setnumHurs(int numHrs) {
		this.numHrs = numHrs;
	}
	public double getHourlyPay() {
		return HourlyPay;
	}
	public int getnnumHrs() {
		return numHrs;
	}
	public String toString() {
		String str = "Firstname" + getfirstname()
				 + "\n Lastname" + getlastname()
				   + "\nAddress" + getAddress()
				   + "\nPayment" + HourlyPay
				 + "\numHrs"	 + numHrs;
		return str;
	}

	public void introduce(boolean displaySSN) {
		
		if (displaySSN) {
			
			System.out.println("SSN No: " + super.getssn());
			System.out.println();
		}
		else 
			System.out.println("There is no SSN" + super.getssn());		
	}

	public double computePay() {
		if (numHrs > 40) 
			return -1;
		
		else {
			computePay = numHrs * HourlyPay;
			System.out.println("-----------------------------");
			System.out.printf("Compute Pay: $%.2f" , computePay);
			System.out.println("\n-----------------------------");
		}
			
		return computePay;
			
	}
}
