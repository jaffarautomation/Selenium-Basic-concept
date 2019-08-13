package RunningThroughXML_part3_Somemethods_only;

import org.testng.annotations.Test;

public class Running_only_few_method_part2 {

	//through test annotation method
	
	@Test(enabled = false)   //As we have disabled this method it will not run 
	public void login()
	{
		System.out.println("Login successfull");
	}
	
	@Test 
	public void Search0()
	{
		System.out.println("Search successfull");
	}
	
	@Test 
	public void Search1()
	{
		System.out.println("Search1 successfull");
	}
	
}
