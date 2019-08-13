package TestNG_Basic_Concept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class UsingBoth_BeforeandAfter_testmethods {

	
	
//	The flow of our test would be:
	
//In Mercury Tours, suppose we like to verify the titles of the target pages of the two links below.
//Go to the homepage and verify its title.
//Click REGISTER and verify the title of its target page.
//Go back to the homepage and verify if it still has the correct title.
//Click SUPPORT and verify the title of its target page.
//Go back to the homepage and verify if it still has the correct title.
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
  
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
    
        @BeforeTest
      public void launchBrowser() {
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        System.out.println("In Before test method");
          driver= new ChromeDriver();
          driver.get(baseUrl);
      }
      
      @BeforeMethod  // this method will execute 2 times as we have 2 test case.
      public void verifyHomepageTitle() {
    	  
    	  System.out.println("In before method");
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
      }
      
          @Test(priority = 0)
      public void register(){
          driver.findElement(By.linkText("REGISTER")).click() ;
          expected = "Register: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
      }
          @Test(priority = 1)
      public void support() {
            driver.findElement(By.linkText("SUPPORT")).click() ;
            expected = "Under Construction: Mercury Tours";
            actual = driver.getTitle();
            Assert.assertEquals(actual, expected);
      }
          
      @AfterMethod  // This method will execute 2 times , as we have 2 test cases
      public void goBackToHomepage ( ) {
    	  
    	  System.out.println("In after method");
            driver.findElement(By.linkText("Home")).click() ;
      }
       
      @AfterTest
      public void terminateBrowser(){
    	  
    	  System.out.println("In after testmethod");
          driver.close();
      } 
	
	
}
