package Class35_Types_of_wait;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		WebDriver driver = new ChromeDriver();
		
		
		// Start application
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// Click on timer button to start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		
		
	WebElement element =    driver.findElement(By.cssSelector("#demo"));
		boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}

	}

}