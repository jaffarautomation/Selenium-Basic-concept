package TestNG_Basic_Concept;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiple_cases2 {

	
	@BeforeClass  // This method will run first
	public void login()
	{
		System.out.println("Login successfull");
	}
	
	@BeforeTest   // this method will run second
	public void login1()
	{
		System.out.println("Login successfull1");
	}
	
	@BeforeMethod   // This method will run third
	public void Beforemethod()
	{
		System.out.println("This is before method");
	}
	
	@org.testng.annotations.AfterMethod  // this method willrun after the first test method is executed
	public void AfterMethod()
	{
		System.out.println("This is After method");
	}
	
	
	@Test (priority =1)
	public void Search()
	{
		System.out.println("Search successfull");
	}
	
	/*@Test(priority =2)
	public void Search1()
	{
		System.out.println(" search1 successfull");
	}
	
	@Test (priority =3)
	public void AdvanceSearch1()
	{
		System.out.println("Advance search successfull");
		
	}*/
	
	
	@AfterTest   // this will run last
	public void Logou2t() 
	{
		System.out.println("Logout successfull1");
	}
	
	@AfterClass   // This method will run after the @Aftermethod.
	public void Logout() 
	{
		System.out.println("Logout successfull");
	}
}
