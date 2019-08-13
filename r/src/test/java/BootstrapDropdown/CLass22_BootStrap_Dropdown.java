package BootstrapDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Bootstrap dropdown concept

public class CLass22_BootStrap_Dropdown {

	
	
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

	driver.manage().window().maximize();
	
	WebElement dd = driver.findElement(By.xpath("//*[@id='menu1']"));
	dd.click();
	
	//Here if we use select class we will get an error because the select class constructor accept only <select> tag, 
	//here the dropdown is not under select tag , but instead of button tag. so we cant use select class.
	
 	/*Select ddr =new Select(dd);
	
	ddr.selectByVisibleText("HTML");*/
	
	List<WebElement> dr = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	
	for (WebElement webElement : dr) {
		
		
	String value=	webElement.getAttribute("innerHTML");
	
	
	if(value.contentEquals("JavaScript"))
	{
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		webElement.click();
		break;
	}
	
	System.out.println(value);
	
	
	}
	
	
	
	
	
	
	}
}
