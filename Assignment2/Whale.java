
public class Whale extends Swimmer {

	public Whale(String type, String name, String gender, String environment) {
		super(type, name, gender, environment);	
	}
	public void type() {
		super.gettype();
		System.out.println("I am a fish");
	}
	public void name() {
		super.getname();
		System.out.println("I am a Whale");
	}
	public void gender() {
		super.getgender();
		System.out.println("I am female");
	}
	public void environment() {
		super.getenvironment();
		System.out.println("I live in the Ocean");
	}
	public void move() {
		System.out.println("I can move 31 mph");
	}
	public void sound() {
	System.out.println("I can call Whistles");	
	}
	public void eat() {
		System.out.println("I eat krill, fish");
		
	}
	public void sleep() {
		System.out.println("I can rest quietly in the water");
		
	}
	public void swim() {
		super.Swim();
	}
	public String tostring() {
		String str = "" ;
		return str;
	}
}
