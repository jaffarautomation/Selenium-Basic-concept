package Class42_logGenerator;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class log {

	
//	The log file is a just simple file, which keeps track of the record or event or info when any event happens or any software run. This whole process is known as logging. We can create a log file as simple log file as well as HTML format.
	
	
	
	/*We can create a log file for our simple script also so we can track or debug our script easily if anything goes wrong in the script. For example, if our script is failing at some point then we can track back what went wrong.

	 

	What is log4J- Log4j is free open source tool given by Apache foundation for creating log files It helps us to generate a log file in various output target.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  // Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case ;Google is classname
	         Logger logger=Logger.getLogger("log");
		

	      // configure log4j properties file
	         PropertyConfigurator.configure("Log4j.properties");
	   
	         

	     	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	     	// Start browser
	     	WebDriver driver = new ChromeDriver();
	     	logger.info("Chrome browser");
	     	



	     driver.get("https://www.google.co.in/");
        logger.info("Entered google page");
	     
	     
	     driver.manage().window().maximize();

	     WebElement elment = driver.findElement(By.xpath("//a[text()='Gmail']"));
             

	     Actions act=new Actions(driver);


	     //Below code use enter button
	     act.contextClick(elment).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
   logger.info("Right click on gmail link");
	     
	     
	     
	     // below code use click option
	     /*act.contextClick(elment).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();
*/

	   
	}

}
