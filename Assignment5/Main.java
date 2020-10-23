
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> list = new ArrayList<Integer>();
		  list.add(11);
	      list.add(2);
	      list.add(7);
	      list.add(3);
	      list.add(22);
	      list.add(38);
	      list.add(56);
	      list.add(4);
	      list.add(5);
	      list.add(8);
	      list.add(23);
	      list.add(7);   
	      System.out.println("Before Sorting:");
		   for(int counter: list){
				System.out.println(counter);
			}
		      
		   Collections.sort(list);
		   System.out.println("After Sorting:");
		   
		   for(int counter: list){
				System.out.println(counter);
			}
		   
		   System.out.println("------------------------------------------\n");
		   
		   System.out.println("After swapping largest and smallest numbers:");
		   ArrayList<Integer> tempList = ListManipulator.swapLargestSmallest(list);
		      if (tempList.size() == 0)
		      {
		          System.out.println("The list is empty");
		      }
		      else
		      {
		         for (Integer i : tempList)
		         {
		            System.out.println(i);
		         }
		      }   
		   
		   ListManipulator.table(list);   
	}
}
	
	