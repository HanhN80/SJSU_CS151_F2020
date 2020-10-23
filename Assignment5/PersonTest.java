import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PersonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Person> person = new PriorityQueue<Person>();
		person.add(new Person("Joe", "Smith", 40));
		person.add( new Person("Amy", "Gold", 32));
		person.add(new Person("Tony", "Stork", 21));
		person.add(new Person("Sean", "Irish", 24));
		person.add(new Person("Tina", "Brock", 28));
		person.add(new Person("Lenny", "Hep", 18));
		
		Iterator nameIterator = Person.iterator();
		while (nameIterator.hasNext()) {
			System.out.println(nameIterator.next());
		}
		System.out.println(person);
		System.out.println(Person.SortbyFirstName);
		
		
	}	
	
	

}
