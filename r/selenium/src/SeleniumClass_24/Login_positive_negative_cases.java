package SeleniumClass_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_positive_negative_cases {

	
	
	//incomplete
	
	static String  username;
	static String password;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://www.gcrit.com/build3/login.php");
		
		for(int i =0; i<=2;i++)
		{
			if (i==1)
			{
				 username = "johnnybaba@gmail.com";
				 password = "admin123";
				
			}
			else if (i==2)
			{
				
				 username ="Johny";
				 password	= "John";	
			}
			
			driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(1) > td.fieldValue > input[type=text]")).sendKeys(username);
			driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(2) > td.fieldValue > input[type=password]")).sendKeys(password);
			
			driver.findElement(By.cssSelector("#tdb5 > span.ui-button-text")).click();
			
			String LoginURL = driver.getCurrentUrl();
			if (LoginURL.contains("index.php"))
			{
				
				System.out.println("login successfull");
			}
			else
			{
				System.out.println("Login unsuccessfull");
			}
	
					
		}
		
		
		
		
		
		
		
		
		
		
	}

}