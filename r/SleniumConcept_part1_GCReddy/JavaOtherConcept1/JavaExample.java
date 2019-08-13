package JavaOtherConcept1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class JavaExample{
	
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Steve");
     list.add("Carl");
     list.add("Raj");

     //Adding an element to the first position
     list.addFirst("Negan");

     //Adding an element to the last position
     list.addLast("Rick");
     
     System.out.println(list);

     //Adding an element to the 3rd position
     list.add(2, "Glenn");
     
     System.out.println(list);

    /* //Iterating LinkedList
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());*/
    
   
   // to remove element  from list 
     
     list.remove(2);
     System.out.println(list);
     
     // to remove first and last element
     
     list.removeFirst();
     System.out.println(list);
     
     list.removeLast();
     System.out.println(list);
     
     for (String string : list) {
		
    	 System.out.println("This is called iterator : " + string);
	}
     
     
     //This piece of code would add all the elements of ArrayList to the LinkedList.
   // here we are copying all the values from arraylist to linklist 
     
     ArrayList<String> arraylist= new ArrayList<String>();
     arraylist.add("ronica");
     arraylist.add("ashley");
     
    boolean result = list.addAll(arraylist);
   System.out.println("arraylist copy to linkedlist " + result);
   System.out.println(list);
   
   
   
   //It adds all the elements of collection c to the list starting from a give index in the list. It throws NullPointerException if the collection c is null and IndexOutOfBoundsException when the specified index is out of the range.
 
   list.addAll(2, arraylist);
   System.out.println(list);
   
   // It checks whether the given item is present in the list or not. If the item is present then it returns true else false.
   boolean result2 = list.contains("ronica");
   System.out.println(result2);
   
   //int size(): It returns the number of elements of the list.
   
  int size = list.size();
   System.out.println(size);
   
   
   
   // iterator concept in java collection framework.
   Iterator t =list.iterator();
   
   while(t.hasNext())
   {
	   
	   System.out.println(t.next());
   }
   
   
   
   }
   
   } 

