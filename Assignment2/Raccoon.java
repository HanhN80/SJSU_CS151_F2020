
public class Raccoon extends Scratcher{

	public Raccoon(String type, String name, String gender, String environment) {
		super(type, name, gender, environment);
		// TODO Auto-generated constructor stub
		
	}
	public void type() {
		super.gettype();
		System.out.println("I am animal");
	}
	public void name() {
		super.getname();
		System.out.println("I am a Raccoon");
	}
	public void gender() {
		super.getgender();
		System.out.println("I am male");
	}
	public void environment() {
		super.getenvironment();
		System.out.println("I live in the forest");
	}
	public void move() {
		System.out.println("I can move 9.9-15 mph");
	}
	public void sound() {
		System.out.println("I can call Chittering");	
		}
	public void eat() {
		System.out.println("I eat both plants and other animals");	
	}
	public void sleep() {
		System.out.println("I prefer sleeping in large holes in trees");	
	}
	public void scratch() {
		super.Scratch();
	}
	public String tostring() {
		String str = "" ;
		return str;
	}
}
