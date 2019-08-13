package TestNG_Basic_Concept;

import org.testng.Assert;

import org.testng.annotations.Test;

public class Multiple_cases {

	
	//Here test case will execute in Alpha order mean according to test methods names
	//If you want the methods to be executed in a different order, use the parameter "priority".
	//Parameters are keywords that modify the annotation's function.
	
	
	// A) Parameter : Priority
	
	//TestNG will execute the @Test annotation with the lowest priority value up to the largest. 
	//There is no need for your priority values to be consecutive.
	
	/*
	@Test(priority =3)   // third one
	public void testA()
	{
		Assert.assertEquals("gmail", "gmail");
		
	}
	
	@Test(priority =2, enabled = false)   // second one
	public void testC()
	{
		
		Assert.assertEquals("gmail", "gmail");
	}
	
	
	
	@Test (priority =1)  // First one to execute
	public void testB()
	{
		Assert.assertEquals("gmail", "gmail");
		
	}
	
	*/
	
	
	//***********************************************************************
	
	
	//Aside from "priority," @Test has another parameter called "alwaysRun" which can only be set to either "true" or "false." To use two or more parameters in a single annotation, 
	//separate them with a comma such as the one shown below.
	
	// B) Parameter : Alwaysrun and DependsOnMethod : 
	
	// If priority is not added then it will execute method in alpa order
	
	//Now after adding depend method it will execute in that order
	//Depend on method actually depend on the test case of first method
	
	@Test
	public void login()
	{
		System.out.println("Login successfull");
	}
	
	@Test (dependsOnMethods = {"login"})
	public void Search()
	{
		System.out.println("Search successfull");
	}
	
	@Test (dependsOnMethods = {"Search"})
	public void AdvanceSearch()
	{
		System.out.println("Advance search successfull");
	}
	
	@Test (dependsOnMethods = {"AdvanceSearch"})
	public void AdvanceSearch1()
	{
		System.out.println("Advance search successfull");
		Assert.assertEquals("abc", "gmail");
	}
	
	
	// here logout method will not execute as AdvanceSearch1 is getting failed i.e it will skip
	
	// If you provide alwaysRun then it will run whether depend on method passed or failed
	@Test (dependsOnMethods = {"AdvanceSearch1"} , alwaysRun  =true )
	public void Logout() 
	{
		System.out.println("Logout successfull");
	}
	
	
	
	
	
}
