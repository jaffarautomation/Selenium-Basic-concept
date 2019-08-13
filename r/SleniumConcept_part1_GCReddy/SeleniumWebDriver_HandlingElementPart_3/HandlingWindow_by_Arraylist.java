package SeleniumWebDriver_HandlingElementPart_3;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow_by_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
			
		WebElement r =driver.findElement(By.cssSelector("#post-body-6170641642826198246 > a:nth-child(2)"));
		//Storing the window id in parent (note getwindow can store only one window value i.e parent class window)
		String parent = driver.getWindowHandle();
 			System.out.println(parent);
 			
 			
 		//	driver.findElement(By.cssSelector("#post-body-6170641642826198246 > a:nth-child(2)")).click(); // google
 			
 		//	driver.findElement(By.cssSelector("#post-body-6170641642826198246 > a:nth-child(4)")).click(); // facebook
 			
 			driver.findElement(By.cssSelector("#post-body-6170641642826198246 > a:nth-child(6)")).click();  // yahoo
 			
 			driver.findElement(By.cssSelector("#post-body-6170641642826198246 > a:nth-child(2)")).click(); // google
 			
 	 			driver.findElement(By.cssSelector("#post-body-6170641642826198246 > a:nth-child(4)")).click(); // facebook
 	 			
 			Set<String> alltabs = driver.getWindowHandles();
 		
 			ArrayList<String> alltabs1 = new ArrayList<>(alltabs);
 			
 		
 			
 			// print selenium
 		 driver.switchTo().window( alltabs1.get(0));
 		 System.out.println(driver.getTitle());
 		 
 		// print yahoo 
 		 driver.switchTo().window( alltabs1.get(1));
 		 System.out.println(driver.getTitle());
 		 
 		//print facebook
 		 driver.switchTo().window( alltabs1.get(2));
 		 System.out.println(driver.getTitle());
 		 
 		// print google
 		 driver.switchTo().window( alltabs1.get(3));
 		 System.out.println(driver.getTitle());
 		 
 		 
		
	}

}
