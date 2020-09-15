
public class Dog extends Domesticated{

	public Dog(String type, String name, String gender, String environment) {
		super(type, name, gender, environment);
		// TODO Auto-generated constructor stub
	}
	public void type() {
		super.gettype();
		System.out.println("I am animal");
	}
	public void name() {
		super.getname();
		System.out.println("I am a Dog");
	}
	public void gender() {
		super.getgender();
		System.out.println("I am male");
	}
	public void environment() {
		super.getenvironment();
		System.out.println("I live at home");
	}
	public void move() {
		System.out.println("I can move 20 mph");
	}
	public void sound() {
		System.out.println("I can call Woof");	
		}
	public void eat() {
		System.out.println("I eat dog food");
		
	}
	public void sleep() {
		System.out.println("I can sleep about 10 minutes,");
		
	}
	public void bark() {
		System.out.println("I can bark");
	}
	
//	public String tostring() {
//		String str = "" ;
//		return str;
//	}
}
