class TooManyHoursWorkedException extends Exception{
    TooManyHoursWorkedException(String s){
        super(s);
    }
}

public class Employee {
    private String firstname;
    private String lastname;
    private int id;
    private Double hourlypay;
    int numHrs;			// number hours per week
    double computePay;

    public Employee (String firstname, String lastname, int id, Double hourlypay, int numHrs)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.hourlypay = hourlypay;
        this.numHrs = numHrs;

    }

    public void setfirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    public void setid (int id)
    {
        this.id = id;
    }

    public void sethourlypay(Double hourlypay) {
        this.hourlypay = hourlypay;
    }
    public void setnumHrs(int numHrs) {
        this.numHrs = numHrs;
    }
    public String getfirstname() {
        return firstname;
    }
    public String getlastname() {
        return lastname;
    }

    public int getid()
    {
        return id;
    }

    public Double gethourlypay(){
        return hourlypay;
    }
    public int getnumHrs() {
        return numHrs;
    }
    public double computePay() {
        try {
            if (numHrs < 0) {
                throw new NumberFormatException("Number hour must be greater than 0");
            }
            else if (numHrs > 40)
                throw new TooManyHoursWorkedException("Number of hours is not over 40 ");

            else {
                computePay = numHrs * hourlypay;
                System.out.println("-----------------------------");
                System.out.printf("Compute Pay: $%.2f" , computePay);
                System.out.println("\n-----------------------------");
            }

        }catch (TooManyHoursWorkedException e) {
            e.printStackTrace();

        }

        return computePay;

    }
    public void introduce() {
        System.out.println("First name: " + firstname);
        System.out.println("Last name : " + lastname);
        System.out.println("ID        : " + id);
        System.out.println("Hourly Pay: " + hourlypay);
        System.out.println("Number hour: " + numHrs);

    }
}
