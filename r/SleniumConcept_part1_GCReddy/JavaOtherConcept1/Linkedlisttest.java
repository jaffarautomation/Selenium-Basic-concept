package JavaOtherConcept1;
import java.util.*;


public class Linkedlisttest {

	
	
	
	/*Similar to arrays in Java, LinkedList is a linear data structure. However LinkedList elements are not stored in contiguous locations like arrays, they are linked with each other using pointers. Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList.
	*/
	
	
	
	public static void main(String[] args) {
		
		
		
		LinkedList<String> list=new LinkedList<String>();

		
		//Adding element to linked list 
		list.add("john");
		list.add("johnny");
		list.add("Steve");
		
		// Adding  first and last element in link list 
		
		list.addFirst("Rona");
		
		list.addLast("monica");
		
		// Adding element to specific position in linkedlist in java 
		
		System.out.println(list);
		
		
		
		
		
	}

}
