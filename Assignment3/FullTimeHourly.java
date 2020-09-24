
public class FullTimeHourly extends FullTimeEmployee{

	public FullTimeHourly(String firstname, String lastname, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double basePay, int numHrs, double overtimePay) {
		super(firstname, lastname, age, ssn, address, id, educationLevel, directDeposit);
		// TODO Auto-generated constructor stub
		this.basePay = basePay;
		this.numHrs = numHrs;
		this.overtimePay= overtimePay;
	}

	double overtimePay; // money for overtime
	int numHrs; // number hours a week
	private double netpayment;
	
	public void setnumHrs(int numHrs) {
		this.numHrs = numHrs;
	}
	public void setovertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}
	public int getnumHrs() {
		return numHrs;
	}
	public double getovertimePay() {
		return overtimePay;
	}
	public String toString() {
		String str = "Firstname" + getfirstname()
				+ "\n Lastname" + getlastname()
				+ "\nAddress" + getAddress()
				+ "\nID" + getid()
				+ "\nbasePay" + getbasePay()	
				+ "\novertime" + overtimePay;
			
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
		if (numHrs > 0 && numHrs <= 40) {
		netpayment =  basePay * 1/52 * 1/40 * getnumHrs();
		System.out.println("------------------------------");
		System.out.printf("Payment a week: $%.2f " , netpayment);
		System.out.println("\n------------------------------");
		
		}
		else if (numHrs > 40 ) {
			netpayment = (basePay * 1/52 * 1/40 * getnumHrs()) + ((getnumHrs() - 40) * overtimePay);
			System.out.println("------------------------------");
			System.out.printf("Net Payment a week: $%.2f " , netpayment);
			System.out.println("\n------------------------------");
		}
		return netpayment;
	
	}
}
