package Class41_MouseInteractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Class31_takingscreenshot.ScreenshotLib;

public class MouseHover {

public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	
		WebElement elment = driver.findElement(By.xpath("//*[@id='post-body-4229879368008023176']/div[1]/div[2]/button"));
		
		
		//Mouse hovering action
	Actions Action = new Actions(driver);
	
	//Below code will hover the mouse to specified location on web page
	Action.moveToElement(elment).perform();
	
	List<WebElement>  element1=driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
	
	for (WebElement value : element1) {
		
	String link =	value.getAttribute("innerHTML");
	
	if(link.contains("Appium"))
	{
		value.click();
		System.out.println("Navigate to appium site successfully");
		ScreenshotLib.takesreen(driver, "appiumsite");
		break;
	}
		
			
	}
	
}}
