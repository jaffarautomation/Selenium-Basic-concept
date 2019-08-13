package CollectionFramework;

import java.util.List;
import java.util.ArrayList;

public class ArraysL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> r = new ArrayList<String>(5); //5 denote the size of arraylist initially
		
	
		r.add("Cat");   //0
		r.add("dog");   //1
		r.add("fish");  //2
		r.add("ant");   //3
		
		
		System.out.println(r.containsAll(r));
		
		
		
		
		System.out.println(r);
		System.out.println(r.size());  //Remember it return the no of actual elements present in the string.
		
		
		
		// In below we have enter the string value at index 2, now automatically the value at index 2 move to index 3 and so on.
		// And finally the size of Arraylist increased by one.
		r.add(2, "bear");   // here 2 mean at second index position.
		System.out.println(r);
		System.out.println(r.size());
		
		
		//set method
		
		r.set(1, "Elephant");
		System.out.println(r);
		System.out.println(r.size());
		
		
		//Remove method() 
		//it remove the element by providing the index no, or just type the element name if it is a string.
		
		
		r.remove(2);
		System.out.println(r);
		
		r.remove("ant");
		System.out.println(r);
		
//In the above examples, we have displayed the ArrayList elements just by referring the ArrayList instance, 
		//which is definitely not the right way to displays the elements. 
		//The correct way of displaying the elements is by using an advanced for loop like this.
		
		
		for (String s : r)
		{System.out.println(s);}
		
		
		
		
		
		
	}

}
