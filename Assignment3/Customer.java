
class Customer extends Person {
	public Customer(String firstname, String lastname, int age, String ssn, Address address, int customerID, String paymentPreference, double amount) {
		super(firstname, lastname, age, ssn, address);
		// TODO Auto-generated constructor stub
		this.customerID = customerID;
		this.paymentPreference = paymentPreference;
		this.amount = amount;
	}
	

	private int customerID;
	private String paymentPreference;
	private double amount;
		
	public void setcustomerID(int customerID) {
		this.customerID = customerID;
	}
	public void setPayPreference(String PayPreference) {
		this.paymentPreference = PayPreference;
	}
	
	public int getcustomerID() {
		return customerID;
	}
	public String getPayPreference() {
		return paymentPreference;
	}
	
	public void makepayment() {
		if (amount >= 100)
		System.out.println("Customer pay by transfer");
		else 
			System.out.println("Customer pay by Check");
		
	}

	public void introduce() {
		 System.out.println();
		 System.out.println("First name     : " + firstname);
		 System.out.println("Last name      : " + lastname);
		 System.out.println("Age            : " + age);
		 System.out.println("Social No      : " + ssn);
		 System.out.println("Address        : " + getAddress());
		 System.out.println("CustomerID     : " + getcustomerID());
		 System.out.println("PayPreference  : " + getPayPreference());
		 System.out.println("----------------------------------------");
		
	}
}
