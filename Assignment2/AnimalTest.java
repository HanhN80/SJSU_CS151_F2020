
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		Dog dog = new Dog("Animal", "Dog", "Male", "Home");
		Cat cat = new Cat("Animal", "cat", "Female", "Home");
		Raccoon raccoon = new Raccoon("Animal", "cat", "Female", "Home");
		Whale whale = new Whale ("Animal", "cat", "Female", "Home");
		
		dog.type();
		dog.name();
		dog.gender();
		dog.environment();
		dog.move();
		dog.sound();
		dog.eat();
		dog.sleep();
		dog.bark();
		dog.domesticated();
		dog.walk();
		dog.greetHuman();
		System.out.println("------------");
		
		cat.type();
		cat.name();
		cat.gender();
		cat.environment();
		cat.move();
		cat.sound();
		cat.eat();
		cat.sleep();
		cat.scratch();
		cat.domesticated();
		cat.walk();
		cat.greetHuman();
		System.out.println("------------");
		
		raccoon.type();
		raccoon.name();
		raccoon.gender();
		raccoon.environment();
		raccoon.move();
		raccoon.sound();
		raccoon.eat();
		raccoon.sleep();
		raccoon.scratch();
		System.out.println("------------");
		
		whale.type();
		whale.name();
		whale.gender();
		whale.environment();
		whale.move();
		whale.sound();
		whale.eat();
		whale.sleep();
		whale.swim();
		System.out.println("------------");


	}

}
