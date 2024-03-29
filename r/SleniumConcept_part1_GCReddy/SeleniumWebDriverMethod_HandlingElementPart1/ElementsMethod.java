package SeleniumWebDriverMethod_HandlingElementPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		//isEnabled() method 
		// it check element is in enabled or disabled state
		/*driver.get("https://www.facebook.com/");
		String s5 =driver.getCurrentUrl();
		System.out.println(s5);
		
		boolean check = driver.findElement(By.id("u_0_2")).isEnabled(); 
		System.out.println(check);  //return true
*/		
		//isDisplayed() method
		// it check the element is displayed on current web page or not. 
		
		driver.get("https://www.facebook.com/");
		String s6 =driver.getCurrentUrl();
		System.out.println(s6);
		
		driver.manage().window().maximize();
	
		
		boolean check = driver.findElement(By.id("u_0_2")).isDisplayed(); 
		System.out.println(check);  //return true
		
		

	}

}
