
class Course implements Cloneable	{
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
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
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
    public String toString() {
        String str = Coursename + ", " + Coursedescription + ", " + department + ", " + time + ", " + Weekday;
        return str;
    }
}
