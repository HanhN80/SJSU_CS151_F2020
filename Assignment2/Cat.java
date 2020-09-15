
public class Cat extends Scratcher{

	public Cat(String type, String name, String gender, String environment) {
		super(type, name, gender, environment);
		// TODO Auto-generated constructor stub
	}
	public void type() {
		super.gettype();
		System.out.println("I am animal");
	}
	public void name() {
		super.getname();
		System.out.println("I am a Cat");
	}
	public void gender() {
		super.getgender();
		System.out.println("I am female");
	}
	public void environment() {
		super.getenvironment();
		System.out.println("I live at home");
	}
	public void move() {
		System.out.println("I can move 31 mph");
	}
	public void sound() {
		System.out.println("I can call Meow");	
		}
	public void eat() {
		System.out.println("I eat Cat food");
		
	}
	public void sleep() {
		System.out.println("I can sleep almost all day");
	
	}
	public void scratch() {
		super.Scratch();	
	}
	public void domesticated() {
		super.domesticated();
	}
	public void walk() {
		super.walk();
	}
	public void greetHuman() {
		super.greetHuman();
	}
	public String toString() {
		String str = "Type" +super.gettype() +"Name" + super.getname() + "Gender: " + super.getgender() + "Environment: " + super.getenvironment();
		return str;
	}

}
