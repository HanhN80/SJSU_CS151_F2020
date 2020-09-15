

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Student[] student = new Student[1];
	        student[0] = new Student("John","Smith ", 20 , 3.6 , " Computer Science", " Computer Science department");    
	        System.out.println("");
	        for (Student x:student) 
	        	System.out.println(x);
	        	System.out.println("Student's schedule: ");
	        	
	     Student.Course innerObject = student[0].new Course();
	     innerObject.printSchedule();
	     
		}
}



