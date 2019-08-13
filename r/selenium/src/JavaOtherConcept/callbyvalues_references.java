package JavaOtherConcept;

import javax.sound.midi.Soundbank;

public class callbyvalues_references {
	
	
	int y =10;
	int x =20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		callbyvalues_references obj = new callbyvalues_references();
		
		int mum = 25;
		System.out.println("Before calling the display method " + mum);
		display(mum);
		System.out.println("After calling the display method = "+ mum);
		
		
		//In below method we have provide reference of callbyvalues_reference obj in parameter.
		//now address store in obj of class is pass to the refrence created in display1 parameter.
		//And that reference can access all the global variable of the class
		//In other word both the obj and u will point to the same address or same memory allocation.
		
		System.out.println("Values of y and x before calling display1 method : " + "y : " +obj.y +  "x :" + obj.x);
		display1(obj);
		
		
		
		// Here value of int mum is 25, it is global variable and it belong to main method only.
		
	}
	
	
	
	
	
	public static void display(int num)
	{
		
		//here int num is local variable, i.e belongs to only display method
		
		System.out.println("The value of number inside the display method = " + num);
		num =100;
		System.out.println("The value of number inside the display method = " + num);
		
		
	}
	
	
	
	// Here we have created a method in which reference of the class is pass as parameter.
	// The reference name is u . Since we have just create the reference but as now of it doesnt contain any address of class or object of class.
	//while calling this method from main class we will provide the reference of the class in parameter.
	
	// Below method will do the swapping of two global variable
	// Here int temp variable is used for sapping of two variable
	public static void display1(callbyvalues_references u)
	{
		
		
		int temp;
		
		temp=u.y;
		u.y=u.x;
		u.x=temp;
		
		System.out.println("Values of y and x after calling the display1 method : " + "y" +u.y + "x"+ u.x);
	}
	

}
