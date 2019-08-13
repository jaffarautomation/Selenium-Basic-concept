package Class60_ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;


/*What Is GeckoDriver?
GeckoDriver is a connecting link to the Firefox browser for your scripts in Selenium. GeckoDriver is a proxy which helps to communicate with the Gecko-based browsers (e.g. Firefox), for which it provides HTTP API.
*/

//what is web driver engine

/*Web Browser Engine is nothing but a software program. The main function of this program is collecting the content (like HTML, XML, images) & formatting the information (like CSS) and display this formatted content on the screen. Web Browser Engine is also called as Layout Engine or Rendering Engine.

Applications like Web browsers, email clients, e-book readers, on-line help systems etc. need displaying of web content. And to display the web content, the web browser engine is required and it is a part of all these applications. There are different web browser engines for each web browsers.
*/

public class ReadPropertyFile {

	
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		//first step to create the object of the property class
		Properties  prop =new Properties();
		
		//Second step is to read the config file, for that we create the fileinputstream class
		FileInputStream file = new FileInputStream("F:\\all extracted project\\work\\r\\src\\test\\java\\ObjectRepository\\config.properties");
		
		
		//this method will load the file which was read by fileinput stream method
		prop.load(file);
		
		
		//to print the any value in config file we use get method
		System.out.println(prop.getProperty("name"));
		
		
		// To use browser value in test case, and open the browser according to the input
		
		String browsername =prop.getProperty("browser");
		System.out.println(browsername);
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else{ if(browsername.equals("ff"))
			
		{  System.setProperty("webdriver.gecko.driver","F:\\Software\\geckodriver.exe");
				driver =new FirefoxDriver();
		}
		
		else{
			
			if(browsername.equals("IE"))
			{
	    		System.setProperty("webdriver.ie.driver","F:\\Software\\IEDriverServer.exe" );
                driver =new InternetExplorerDriver();
		}
		}
		
		
		
		// this code will open the google.com in desired browser according to user input in config.properties file
	    	driver.get("https://www.google.com");
		
	    	
		 String currentURl = driver.getCurrentUrl();
		
		
		 String userinputURL = prop.getProperty("URL");
		
		 // using Assert to verify the value
		Assert.assertEquals(userinputURL, currentURl, "verification failed 1");
		
		WebElement value =	driver.findElement(By.xpath(prop.getProperty("googleinputtext")));
		
        value.sendKeys(prop.getProperty("googletext"));
			
			
			
		}
				
		
		
	}

}
