
public class StudentTest {

    public static void main(String[] args) {

        Course course1 = new Course ("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");


        Student [] student = new Student[2];
        student[0] = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science department", course1);
        student[1] = null;

        try {
            student[1] = (Student) student[0].clone();

        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        student[0].printInfo();
        System.out.println();
        student[1].setCourse("CS147", "Computer Architecture", "CS", "7:30am", "Monday");

        for (Student x : student) {
            x.printInfo();
            System.out.println();

        }

    }

}
