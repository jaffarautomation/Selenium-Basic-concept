package SeleniumClass22_CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Openallineone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.ie.driver","F:\\Selenium\\IEDriverServer.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		
		if (title.equals("Google"))
		{
			System.out.println("Verified");
		}
		else {System.out.println("Not verified");
		}
		
		
		
		driver =new InternetExplorerDriver();
		
		driver.get("https://www.google.co.in/");
		String title1 = driver.getTitle();
		
		if (title1.equals("Google"))
		{
			System.out.println("Verified");
		}
		else {System.out.println("Not verified");
		}

	}

}
