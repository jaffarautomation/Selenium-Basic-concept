package JavaOtherConcept1;


import java.util.*;

public class ArraytoArraylist {
	
	
	

	public static void main(String[] args) {

	    /* Array Declaration and initialization*/
	    String array[]={"Hi", "Hello", "Howdy", "Bye"};
	    
	
	    
	    System.out.println(Arrays.toString(array));

	    /*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    /*Conversion*/
	    Collections.addAll(arraylist, array);
	    
	    
	    System.out.println(arraylist);

	    /*Adding new elements to the converted List*/
	    arraylist.add("String1");
	    arraylist.add("String2");
	    
	 String name[]=   arraylist.toArray(array);
     System.out.println(name);
	    
	    
	    /*Display array list*/
	    for (String str: arraylist)
	    {
	 	System.out.println(str);
	    }
	}
}