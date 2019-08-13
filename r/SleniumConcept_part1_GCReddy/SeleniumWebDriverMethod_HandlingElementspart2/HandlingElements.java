package SeleniumWebDriverMethod_HandlingElementspart2;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingElements 	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Handling of images : Create end to end flow:
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	//	WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://www.google.co.in/");
		
		WebElement G1= driver.findElement(By.id("hplogo"));       //this is general image
		
		System.out.println(G1.getAttribute("title"));
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();           //this is image button
		
		driver.navigate().to("https://www.seleniumhq.org/");
	    driver.findElement(By.className("icon")).click();      // this is image with link 
*/

		
//*************************************************************************************************		
	    // handling of Link 
	    
	 /*   WebDriver driver1 = new ChromeDriver();
	    driver1.get("https://www.google.co.in/");
	   WebElement G2 =  driver1.findElement(By.className("gb_d"));
	   System.out.println(G2.isDisplayed());
	   System.out.println(G2.isEnabled());
	   System.out.println(G2.getText());
	   
	   System.out.println(G2.getAttribute("href"));  // it return the link value or hyper text
	   G2.click();*/
	//******************************************************************************************   
	   // Handling of Radio Button 
	  /* 
	   WebDriver driver2 = new ChromeDriver();
	   driver2.get("http://www.gcrit.com/build3/create_account.php");
	   
	   WebElement G4 = driver2.findElement(By.cssSelector("//*[@id='bodyContent']/form#bodyContent > form > div > div:nth-child(2) > table > tbody > tr:nth-child(1) > td.fieldValue > input[type=radio]:nth-child(2)/div/div[2]/table/tbody/tr[1]/td[2]/input[2]"));
	   
	   System.out.println(G4.isDisplayed());  //true
	   System.out.println(G4.isEnabled());    //true
	   System.out.println(G4.isSelected());	    //false
	   G4.click();
	   System.out.println(G4.isSelected());	// true
	   */
		
//********************************************************************************		
	   
	   /*//handling of drop down button
		WebDriver driver3 = new ChromeDriver();
		   driver3.get("http://www.gcrit.com/build3/create_account.php");
		
		//  Creating the object of Class select and passing the reference of web element in constructor of Select class

		   
	    Select select = new Select(driver3.findElement(By.name("country")));
	    
	   select.selectByVisibleText("Bahamas");   // select Bahamas
	   select.selectByIndex(3);  
	   
	  
	   //select algeria
	   
	   // here getoption method return type is List<WebElement>
	   List<WebElement> e = select.getOptions();
	   	   int size = e.size();       //Size return type is int
	   System.out.println(size);    // 240
*/	//**************************************************************************   
	 
		//Handling of inline Elements
		
		WebDriver driver4 =new ChromeDriver();
	   driver4.get("https://www.google.co.in/");
	   driver4.findElement(By.cssSelector("#gbwa > div.gb_jf > a")).click();
	   
		driver4.findElement(By.className("gb_k")).click();
		
		//*******************************************************************
		
		 
		ChromeDriver y = new ChromeDriver();
		
		
		
		
	}
	
	
	
  
}
