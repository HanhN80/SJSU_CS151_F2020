import java.util.Comparator;
import java.util.Iterator;

public class Person implements Comparable <Person>{

	protected String firstname;
	protected String lastname;
	protected int age;
	
	public Person (String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public void setage(int age) {
		this.age = age;
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
	public int compareTo(Person obj) {
		return this.lastname.length()-obj.getlastname().length();
	}
	
	public static Comparator<Person> SortbyFirstName = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			return p1.getfirstname().compareToIgnoreCase(p2.getfirstname());
		}
	};
	public int compare(Person p1, Person p2) {
		if (p1.getage() > p2.getage()) {
			return 1;
		} else if (p1.getage() < p2.getage()) {
			return -1;
		}
		return 0;
	}
	public void display() {
		 System.out.println("First name: " + firstname);
		 System.out.println("Last name : " + lastname);
		 System.out.println("Age       : " + age);
		 
	}

}
