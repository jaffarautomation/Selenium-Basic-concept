package JavaOtherConcept;

@CustomAnnoation(stuAddress = "f", stuStream="gh",studentName = "dd", Book = { "ABC","DFR","RTY" })// we have created a Annoation in this project and use in this class
public class Annotation1 {

	
	public void student()
	{
		
		System.out.println("In student method");
	}
	
	public void student2()
	{
		System.out.println("In student method 1");
		
	}
	
	
	
	//@Deprecated annotation indicates that the marked element (class, method or field) is deprecated and should no longer be used. 
	//The compiler generates a warning whenever a program uses a method, class, or field that has already been marked with the @Deprecated annotation. 
	
	@Deprecated
	public  void student3()
	{
		System.out.println("This method is deprecated");
		
	}
	
	

}
