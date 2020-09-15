

public class Student {
	private String firstname;
	private String lastname;
	private int age;
	private double gpa;
	private String major;
	private String department;
	String C1 = "CS151 Tue/Thur 6-7:15";
	String C2 = "Eng101 Mon/Wed 10-11:15";
	String C3 = "Hist100 Tue/Thur 1:30-2:45";
	
	Student (String firstname, String lastname, int age, double gpa, String major, String department){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;	
		
	}
	
	Student (Student S){
		this.firstname = S.firstname;
		this.lastname = S.lastname;
		this.age = S.age;
		this.gpa = S.gpa;
		this.major = S.major;
		this.department = S.department;
	}
	public void setfirstname (String firstname) {
		this.firstname = firstname;
	}
	public void setlastname (String lastname) {
		this.lastname = lastname;
	}
	public void setage (int age) {
		this.age = age;
	}
	public void setgpa (float gpa) {
		this.gpa = gpa;
	}
	public void setmajor (String major) {
		this.major = major;
	}
	public void setdepartment (String department) {
		this.department = department;
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
	public double getgpa() {
		return gpa;
	}
	public String getmajor() {
		return major;
	}
	public String getdepartment() {
		return department;
	}
	public String toString() {
		
		String str = firstname + " " + lastname + ", " + age + " years old,  " + gpa + " gpa,  " + major + ", " + department + " ";
		
		return str;
	}

		class Course {	
					
			void printSchedule()
			{
				System.out.println("         " + C1);
				System.out.println("         " + C2);
				System.out.println("         " + C3);
				
			}
			
		}
		
	
}


	
	


