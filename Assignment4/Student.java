
class Student implements Cloneable {
    private String firstname;
    private String lastname;
    private int age;
    private double gpa;
    private String major;
    private String department;
    private Course course;

    public Student(String firstname, String lastname, int age, double gpa, String major, String department, Course course) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
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
    public void setCourse(String Coursename, String Coursedescription, String department, String time, String Weekday ) {
        this.course.setCoursename(Coursename);
        this.course.setCoursedescription(Coursedescription);
        this.course.setdepartment(department);
        this.course.settime(time);
        this.course.setWeekday(Weekday);
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
    public String getmajor() {
        return major;
    }
    public String getdepartment() {
        return department;
    }
    public Course getcourse() {
        return course;
    }
    protected Object clone() throws CloneNotSupportedException{
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }
    public void printInfo() {
        System.out.println("Course				:" + course);
//		System.out.println("Course Name			:" + getcourse().getCoursename());
        System.out.println("Student's firstname		:" + firstname);
        System.out.println("Student's lastname		:" + lastname);
        System.out.println("Age				:" + age);
        System.out.println("GPA				:" + gpa);
        System.out.println("Major				:" + major);
        System.out.println("Department			:" + department);


    }

}
