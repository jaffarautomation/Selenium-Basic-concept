package SeleniumWebDriver_HandlingElementPart_3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindow_or_tab_of_brower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
			
		WebElement r =driver.findElement(By.cssSelector("#post-body-6170641642826198246 > a:nth-child(2)"));
		//Storing the window id in parent (note getwindow can store only one window value i.e parent class window)
		String parent = driver.getWindowHandle();
 			System.out.println(parent);
 			
			r.click();
 		// storing the multiple value of window id in array name called Set with data type String.	
 			Set<String> allclass = 	driver.getWindowHandles();
 			System.out.println(allclass);
 			
 		// Printing the no of window id present in Set in integer form	
 			int noofelement = allclass.size();
 			System.out.println(noofelement);
 		
 		//below code proof us that still a new tab is open but the control is still in parent class i.e first class
 			
 			System.out.println(driver.getCurrentUrl());
 		//	driver.findElement(By.className("gb_d")).click();  // error noelementfound
 			
 			for (String child : allclass) {
				
 				if(! child.equals(parent)){
 					
 					driver.switchTo().window(child);
 				// now control is over the child class or new tab
 		 			System.out.println(driver.getCurrentUrl());  // print google website
 				}
			}
 			
 			
 		//	driver.switchTo().window(parent);
 			System.out.println(driver.getCurrentUrl()); // print selenium practise website
 			
 			
 			
 			
 
	}

}
