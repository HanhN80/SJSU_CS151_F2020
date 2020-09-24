
public class Executive extends Employee{

	
	public Executive(String firstname, String lastname, int age, String ssn, Address address, int id,
			String educationLevel, boolean directDeposit, double pay, double yearlyBonus) {
		super(firstname, lastname, age, ssn, address, id, educationLevel, directDeposit);
		// TODO Auto-generated constructor stub
		this.pay = pay;
		this.yearlyBonus = yearlyBonus;
	}
	private double yearlyBonus;
	private double pay;
	private double netPayment;
	
	public void setyearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}
	public double getyearlyBonus() {
		return yearlyBonus;
	}
	public double pay() {
		return pay;
	}
	public String toString() {
		String str = "Firstname" + getfirstname()
				+ "\n Lastname" + getlastname()
				+ "\nAddress" + getAddress()
				+ "\nID" + getid()
//				+ "\nPayment" + payment
				+ "\nYearlyBonus" + yearlyBonus;
			
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
	public double computePay( ) {
		
		if (pay >= 100000) {
			netPayment = pay + yearlyBonus ;
			System.out.println("------------------------------");
			System.out.printf("Salary + Yearly Bonus: $%.2f " , netPayment);
			System.out.println();
		 	System.out.println("------------------------------");
			}
			else if (pay < 100000){
				netPayment = pay;
				System.out.println("------------------------------");
				System.out.printf("Salary + Yearly Bonus: $%.2f " , netPayment);
				System.out.println();
			 	System.out.println("------------------------------");
			}
			return netPayment;
			
		}
		
		
	}

