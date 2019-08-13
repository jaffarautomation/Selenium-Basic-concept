package RunningThroughXML_part2_Grouping;

import org.testng.annotations.Test;

//In this case we have some method which comes under grouping method sanity, so we also define this class in xml file.


public class grouping2 {

	@Test (groups = {"Sanity"}, priority = 0)
	public void method1()
	{
		
		System.out.println("In grouping 2 class, sanity group method 1");
	}
	
	
	@Test (groups = {"Sanity"})
	public void method2()
	{
		
		System.out.println("In grouping 2 class, sanity group method 2");
	}
	
	@Test (groups ={"Regression"})
	public void method3()
	{
		
		System.out.println("In grouping 2 class, sanity group");
	}
}
