
public class Employee extends Person{

	public Employee(String firstname, String lastname, int age, String ssn, Address address, int id,
											String educationLevel, boolean directDeposit) {
		super(firstname, lastname, age, ssn, address);
		// TODO Auto-generated constructor stub
		this.id = id;
		this.educationLevel = educationLevel;
		this.directDeposit = directDeposit;
	}
	
	private int id;
	private String educationLevel;
	private boolean directDeposit;

	
	public void setid(int id) {
		this.id = id;
	}
	public void seteducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public void setdirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	
	public int getid() {
		return id;
	}
	
	public String geteducationLevel() {
		return educationLevel;
	}
	public boolean getdirectDeposit() {
		return directDeposit;
	}
	public void display() {
		 System.out.println("First name    : " + firstname);
		 System.out.println("Last name 	   : " + lastname);
		 System.out.println("Age           : " + age);
		 System.out.println("Address       : " + getAddress());
		 System.out.println("EmployeeID	   : " + id);
		 System.out.println("EducationLevel: " + educationLevel);
		 System.out.println("Direct Deposit: " + directDeposit);
	}
}
