
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee[] employee = new Employee[5];
employee [0] = new Employee ("John", "Smith", 28, "111 222 333", "123 Cheyenne Ct", "Male", 123.0, 1000000, "contractor", 20.0, 30.0, 0.0);
employee [1] = new Employee ("Lisa", "Gray", 40, "123 111 333", "100 Peets", "Femal", 111.0, 1000001, "fulltime", 110000.0, 0.0, 2.0);
employee [2] = new Employee ("Timothy", "Briggs", 35, "124 100 331", "102 Morning Star", "Male", 140.0, 1000002, "fulltime", 80000.0, 0.0, 4.0);
employee [3] = new Employee ("George", "Wallace", 38, "120 101 321", "967 Evening Star", "Male", 160.0, 1000003, "parttime", 20.0, 25.0, 0.0);	
employee [4] = new Employee ("Amy", "Lee", 22, "100 101 111", "1787 Legend Ct", "Femal", 112.0, 1000004, "contractor", 45.0, 45.0, 0.0);		

	System.out.println("Employee Information: ");
	for (Employee x:employee) {
	x.introduce();
	x.CalculatePay();	
	System.out.println();
	
	}
	}

}
