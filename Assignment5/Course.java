
public class Course{

	private String Courseid;
	private String Coursename;
	private String Coursedescription;
	private String department;
	private String time;
	private String Weekday;
	
	public Course (String Coursename, String Coursedescription, String department, String time, String Weekday) {
		
		this.Coursename = Coursename;
		this.Coursedescription = Coursedescription;
		this.department = department;
		this.time = time;
		this.Weekday = Weekday;
	}
	public void setCourseId(String Courseid) {
        this.Courseid = Courseid;
    }

	public void setCoursename(String Coursename) {
		this.Coursename = Coursename;
	}
	public void setCoursedescription(String Coursedescription) {
		this.Coursedescription = Coursedescription;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public void settime(String time) {
		this.time = time;
	}
	public void setWeekday(String Weekday) {
		this.Weekday = Weekday;
	}
	public String getCourseId() {
        return Courseid;
    }
	public String getCoursename() {
		return Coursename;
	}
	public String getCoursedescription() {
		return Coursedescription;
	}
	public String getdepartment() {
		return department;
	}
	public String gettime() {
		return time;
	}
	public String getWeekday() {
		return Weekday;
	}
	
}
