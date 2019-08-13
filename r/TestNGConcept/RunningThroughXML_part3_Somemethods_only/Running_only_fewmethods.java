package RunningThroughXML_part3_Somemethods_only;

import org.testng.Assert;
import org.testng.annotations.Test;


//In some case we need to enabled or disabled the method. That can be achieved by two ways through XML or through test annotation parameter. 

//in this class we are using through XML i,e testng .xml file.
public class Running_only_fewmethods {

	@Test  // We are excluding this method in XML file. 
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
