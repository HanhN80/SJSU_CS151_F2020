
public class Domesticated extends Animal {

	public Domesticated(String type, String name, String gender, String environment) {
		super(type, name, gender, environment);
		// TODO Auto-generated constructor stub
	}
	public void domesticated() {
		System.out.println("I am domesticated");
	}
	public void walk() {
		System.out.println("I can walk");
	}
	public void greetHuman() {
		System.out.println("I can greet Humman");
	}
}
