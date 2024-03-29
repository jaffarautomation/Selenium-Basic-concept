package TestNG_Basic_Concept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Before_and_After_method {
	
	public static WebDriver driver ;
	
	
	//Part A : Only using Priority Parameter
	// Need to supply priority because if not methods will execute in alpha order
	
	//Test flow is like -launch browser ,verify 1, verify 2, close
/*	
@Test (priority = 1)
	public void createinstance()
	{

	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
	}
@Test (priority = 3)
public void verifytitle()
{
	
	driver.get("https://www.google.co.in/");
	System.out.println("Title of the page is " + driver.getTitle());
	Assert.assertEquals("Google", driver.getTitle());
}

@Test (priority = 3)
public void verifytitle2()
{
	
	driver.get("https://in.yahoo.com/?p=us");
	System.out.println("Title of the page is " + driver.getTitle());
	Assert.assertEquals("Yahoo India", driver.getTitle());
}
@Test (priority = 4)
public void close()
{
	driver.close();
	}
*/

	//************************************************************************

// Part B : Using @BeforeMethod and @Aftermethod parameter
	
	//Test flow is like - open browser, verify1 close ____open browser, verify2, close

@BeforeMethod  // @BeforeMethod: The annotated method will be run before each test method. (Pre - condition)
	public void createinstance()
	{

	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
	}
@Test (priority = 1)   //@Test: The annotated method is a part of a test case
public void verifytitle()
{
	
	driver.get("https://www.google.co.in/");
	System.out.println("Title of the page is " + driver.getTitle());
	AssertJUnit.assertEquals("Google", driver.getTitle());
}

@Test (priority = 3)
public void verifytitle2()
{
	
	driver.get("https://in.yahoo.com/?p=us");
	System.out.println("Title of the page is " + driver.getTitle());
	AssertJUnit.assertEquals("Yahoo India", driver.getTitle());
}
@AfterMethod  // @AfterMethod: The annotated method will be run after each test method.(Post condition)
public void close()
{
	driver.close();
	}

//Simply put, @BeforeMethod should contain methods that you need to run before each test case while @AfterMethod should contain methods that you need to run after each test case.


}
