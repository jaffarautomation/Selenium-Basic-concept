package Class32_AssertClass_in_TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Soft_Assert {

	
@Test	
	public void soft()
	{
		
		System.out.println("Started");
		
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(12,14,"Doest match the count");
		System.out.println("Assertion complete");
		ast.assertAll();
		
	}

@Test
public void hard()
{
	

   System.out.println("Started");
  Assert.assertEquals(12, 23, "Asssertion failed");
  System.out.println("Completed");
  
   
}}
