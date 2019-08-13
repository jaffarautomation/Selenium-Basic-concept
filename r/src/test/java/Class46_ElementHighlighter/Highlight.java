package Class46_ElementHighlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Highlight {
 
 public static void main(String []args){
  
	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("incognito");
		
		option.addArguments("start-maximized");
		
		 option.addArguments("--disable-popup-blocking");   // all pops up will be disabled
	     
			option.addArguments("--disable-notification");
			
			option.addArguments("disable-infobars");
			
		WebDriver driver = new ChromeDriver(option);
 
  
  driver.get("https://www.google.co.in/");
 
 // find element using id attribute
  WebElement username= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));  


  
 

  
  
 
 
 }
  
}