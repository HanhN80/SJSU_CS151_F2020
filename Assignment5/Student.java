
import java.util.Comparator;
import java.util.LinkedList;


public class Student implements Comparable<Student>  {
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	private double gpa;
	private String major;
	private String department;
	private boolean initialized = false;
	LinkedList<Course> courses = new LinkedList<>();
	
	
	public Student(String id, String firstname, String lastname, int age, double gpa, String major, String department) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		
	}
	public void setId(String id) {
        this.id = id;
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
	public void setgpa(double gpa) {
		this.gpa = gpa;
	}
	public void setmajor(String major) {
		this.major = major;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getId() {
        return id;
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

	public int compareTo(Student student) {
		if (gpa > student.gpa)
			return 1;
		else if (gpa == student.gpa)
			return 0;
		else
			return -1;
	}
	
	public void addCourse() {
		
	}
	public void removeCourse() {
		
	}
	public static Comparator<Course> SortCourse = new Comparator<Course>() {
		@Override
		public int compare(Course c1, Course c2) {
			return c1.getCourseId().compareToIgnoreCase(c2.getCourseId());
		}
	};
	


}
