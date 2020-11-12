import java.util.ArrayList;
import java.util.List;

public class MethodTest {

	public static <T> int Count(List<T> list) {
	   
	    return list.size();
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> slist = new ArrayList<>();
	    ArrayList<Integer> ilist = new ArrayList<>();
	    ArrayList<Double> dlist = new ArrayList<>();
	    
	    //5 String Objects
	    slist.add("Dog");
	    slist.add("Cat");
	    slist.add("Panda");
	    slist.add("Raccoon");
	    slist.add("Elephant");
	    
	    //6 Integer Objects
	    ilist.add(2);
	    ilist.add(5);
	    ilist.add(4);
	    ilist.add(7);
	    ilist.add(9);
	    ilist.add(3);
	    
	    //8 Double Objects
	    dlist.add(2.1);
	    dlist.add(3.3);
	    dlist.add(4.1);
	    dlist.add(5.4);
	    dlist.add(7.2);
	    dlist.add(11.3);
	    dlist.add(9.5);
	    dlist.add(11.7);
	    
	    
	    System.out.println("String List Count : " + Count(slist));
	    System.out.println("Integer List Count: " + Count(ilist));
	    System.out.println("Double List Count : " + Count(dlist));
	} 
}