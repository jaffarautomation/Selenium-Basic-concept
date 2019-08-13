package SeleniumWebDriver_HandlingElementPart_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchto_frame_and_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Handling of Frame 
		
		
		/*driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//For below code we will receive an error message, because this element in present in frame, so we need to navigate to the respective frame in which this webelement is prsent
	//	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		// Switch to frame 
		// method 1 : by index
	//	driver.switchTo().frame(2);
	//	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		
		// method 2 : by frame name (Find the nearest frame name)
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		Thread.sleep(5000);
		
		//can use back method or defaultContent method
		//driver.navigate().back();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AbstractAnnotations")).click();
*/
		//***********************************************************************************
		
		//Handling of mouse hover 
		
		Actions r = new Actions(driver);
		driver.get("https://www.carmax.com/");
		WebElement t=driver.findElement(By.className("header-helpful-links-title"));
		r.moveToElement(t).build().perform();
		driver.findElement(By.linkText("Help Center")).click();
		
		//******************************************************
	}

}
