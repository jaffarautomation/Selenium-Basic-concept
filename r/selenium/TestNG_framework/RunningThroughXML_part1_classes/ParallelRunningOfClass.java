package RunningThroughXML_part1_classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelRunningOfClass {
  
	@Test
	public void Regression()
	{
		System.out.println("Regression 1 started");
	}
	
	
}
//Here Using the XML file we can run two class one after the other.
//Class ParallelRunningOfClass will execute first and ParallelRunningOfClass1 execute second

// Concept of creating XML file
//If you have 2 test case within a package then you can right click on pakage , go to test NG , convert to TestNG, it will create a XML file containg both classes within the pakage.

//OR refer to Multiple.xml file for second method.