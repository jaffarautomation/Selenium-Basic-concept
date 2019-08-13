package SeleniumClass_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.SessionId;

public class Methods {
	// Creating user defined methods or this class will act as a base class which will contain the basic methods.
	
	
	
	public  static WebDriver driver;
	
	//Basic concept of session id in selenium 
	//Whenever to instaniate the driver class, the session id is got genreated and store in reference of that driver.
	//Therefore the java know, to which browser it need to interact with.
	
	//This method is used because, when you quit or close your browser the sessionID is got deleted.
	//So now if you call the some other method with same driver reference it will give you error, because currently there is no session id in that reference.
	
	public void launchbrowser()
	{
		driver= new ChromeDriver();
		 
	}
	
	
	
	public void AdminLogin ()
	{
         driver.get("http://www.gcrit.com/build3/login.php");
		driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(1) > td.fieldValue > input[type=text]")).sendKeys("johnnybaba@gmail.com");
		driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(2) > td.fieldValue > input[type=password]")).sendKeys("johnnybaba");
		
		driver.findElement(By.cssSelector("#tdb5 > span.ui-button-text")).click();
		}
	
	public void AdminLogin (String username, String password)
	{
		 driver.get("http://www.gcrit.com/build3/login.php");
			driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(1) > td.fieldValue > input[type=text]")).sendKeys(username);
			driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(2) > td.fieldValue > input[type=password]")).sendKeys(password);
			
			driver.findElement(By.cssSelector("#tdb5 > span.ui-button-text")).click();
		
	}
	
	public void sessionid()
	{
		
		
		SessionId session = ((ChromeDriver)driver).getSessionId(); 
		System.out.println("Session id: " + session.toString());
	}
	
	public void close()
	{
		
		driver.close();
		/*if(!driver.toString().contains("null"))
		{
			driver.close();
		}*/
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	// If you comment out below code, it will throw the nullpointerexception error
		//driver = new ChromeDriver();
		
		Methods obj = new Methods();
	
		//To check the login functionality with valid input
		obj.launchbrowser();
		obj.AdminLogin();
		obj.sessionid();  // Current session id will get printed
		obj.close();  // close the current browser and also deleted the session id.
		
		
		//To check the login functionality with invalid input
		obj.launchbrowser(); // here again a new session id will got generated
		obj.AdminLogin("baba", "baba");
		obj.sessionid();
        obj.close();
	}

}
