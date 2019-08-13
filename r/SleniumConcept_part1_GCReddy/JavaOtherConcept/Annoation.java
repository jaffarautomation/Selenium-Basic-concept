package JavaOtherConcept;



public class Annoation extends Annotation1{

	
	//While overriding a method in the child class, we should use this annotation to mark that method. 
	//This makes code readable and avoid maintenance issues, such as: while changing the method signature of parent class, you must change the signature in child classes (where this annotation is being used) otherwise compiler would throw compilation error. 
	//This is difficult to trace when you haven’t used this annotation.
	
	
	
	/*Java has three built-in annotations:

		@Override
		@Deprecated
		@SuppressWarnings
	*/
	
	@Override
	public void student()
{
	
}
	
	public void my()
	{
		
	
	}
	
	@SuppressWarnings(value={"deprecation"})  //This annotation instructs compiler to ignore specific warnings.
	//if you comment out then it will generate warning at  line 41
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Annoation obj = new Annoation();
		
		//If I called this method a warning is displayed. 
		
		obj.student3();
	}

}
