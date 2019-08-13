package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenandClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//navigate to google.com
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin");
		driver.findElement(By.id("tdb1")).click();
		
		String s1 = driver.getCurrentUrl();
		
		if (s1.equals("www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Login successfully");
			
		
		}
		else {
			
			System.out.println("Error: cannot login ");
		}
		
		
	
	}

}
