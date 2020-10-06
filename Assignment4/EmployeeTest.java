
public class EmployeeTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee[] employee = new Employee[1];
        employee[0] = new Employee ("John","Smith", 101, 35.0, 40 );
        for (Employee x: employee) {
            x.introduce();
            x.computePay();
        }
    }

}
