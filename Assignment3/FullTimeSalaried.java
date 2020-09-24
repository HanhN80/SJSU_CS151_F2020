
public class FullTimeSalaried extends FullTimeEmployee{


	public FullTimeSalaried(String firstname, String lastname, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, int numWeeks, double basePay) {
		super(firstname, lastname, age, ssn, address, id, educationLevel, directDeposit);
		// TODO Auto-generated constructor stub
		this.numWeeks = numWeeks;
		this.basePay = basePay;
	}

	private int numWeeks;
	private double netPayment;
	
	public void setnumWeeks(int numWeeks) {
		this.numWeeks = numWeeks;
	}
	public int getnumWeeks() {
		return numWeeks;
	}
	public String toString() {
		String str = "Firstname" + getfirstname()
				+ "\n Lastname" + getlastname()
				+ "\n Address" + getAddress()
				+ "\n Salary" + basePay;
		
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
		if (numWeeks > 0 && numWeeks <=4) {
		netPayment = basePay  * 1/52 * getnumWeeks() ;
		System.out.println("------------------------------");
		System.out.printf("Net payment a month: $%.2f " , netPayment);
		System.out.println();
	 	System.out.println("------------------------------");
		}
		else if (numWeeks > 4){
			netPayment = (basePay * 1/52 * (getnumWeeks()-4))+(basePay * 1/52 * getnumWeeks());
			System.out.println("------------------------------");
			System.out.printf("Net payment a month: $%.2f " , netPayment);
			System.out.println();
		 	System.out.println("------------------------------");
		}
		return netPayment;
		
	}
}
