import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class ListManipulator
{

   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> temp = null;
      if (n <= 0)  
      {
         temp = new ArrayList<Integer>();
      }
      else        
      {
         temp = makeList(n - 1);  
         temp.add(n);             
         return temp;
      }
      return temp; 
   }

   public static ArrayList<Integer> reverseList(ArrayList<Integer> myList)
   {
      ArrayList<Integer> list = ListManipulator.deepClone(myList); 
      if ((list.size() == 1) || (list.size() == 0))
      {
         return list;
      }
      else
      {
      }
      return list;
   }

   public static ArrayList<Integer> deepClone(ArrayList<Integer> myList)
   {
      ArrayList<Integer> list = new ArrayList<Integer>(); 
      for (Integer i : myList)
      {
         list.add(new Integer(i));
      }
      return list;
   }

   public static ArrayList<Integer> largest(ArrayList<Integer> myList)
   {
      ArrayList<Integer> list = ListManipulator.deepClone(myList);
      if ((list.size() == 0) || (list.size() == 1))
      {
         return list;
      }
      else
      {
         Integer tempInt = list.remove(0);
         list.remove(0);  
         list = ListManipulator.largest(list);
         list.add(0, tempInt);
      }
      return list;
   }  

   public static ArrayList<Integer> smallest(ArrayList<Integer> myList)
   {
      ArrayList<Integer> list = ListManipulator.deepClone(myList);
      if ((list.size() == 0) || (list.size() == 1))
      {
         return list;
      }
      else
      {
         list.remove(0);  
         Integer tempInt = list.remove(0);  
         list = ListManipulator.smallest(list);
         list.add(0,tempInt);
      }
      return list;      
   }
   public static ArrayList<Integer> merge(ArrayList<Integer> tList1, 
		   ArrayList<Integer> tList2)
		   {
		      ArrayList<Integer> list1 = ListManipulator.deepClone(tList1);
		      ArrayList<Integer> list2 = ListManipulator.deepClone(tList2);
		      ArrayList<Integer> tempList; 
		      if (list1.size() == 0)
		      {
		         return list2;
		      }
		      else if (list2.size() == 0)
		      {
		         return list1;
		      }
		      else
		      { 
		         Integer lastElement1 = list1.get(list1.size() - 1);
		         Integer lastElement2 = list2.get(list2.size() - 1);
		         if (lastElement1.compareTo(lastElement2) < 0)
		         {
		               lastElement2 = list2.remove(list2.size() - 1);
		               tempList = ListManipulator.merge(list1, list2);
		                   tempList.add(lastElement2);
		            }
		            else
		            {
		                lastElement1 = list1.remove(list1.size() - 1);		           
		                tempList = ListManipulator.merge(list1,list2);		               
		                tempList.add(lastElement1);
		            }            
		         }  
		         return tempList;
		      }

   public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
   {
      ArrayList<Integer> list = ListManipulator.deepClone(myLst); 
      if ((list.size() == 0) || (list.size() == 1))
      {
         return list;
      }
      else
      {

         ArrayList<Integer> smallest = ListManipulator.smallest(list);
         ArrayList<Integer> largest = ListManipulator.largest(list);
         return merge(smallest, largest);

      }
   }


   public static void table(ArrayList<Integer> myLst) {
	   HashSet<Integer> hashsetList = new HashSet<Integer>(myLst);
	   System.out.printf("\nUnique value using HashSet: %s%n", hashsetList);
	   
	   TreeSet<Integer> treesetList = new TreeSet<Integer>(myLst);
	   System.out.printf("\nUnique value using TreeSet: %s%n", treesetList);
	     
	   }

 
   }


   

