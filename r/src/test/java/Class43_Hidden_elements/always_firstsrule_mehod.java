package Class43_Hidden_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class always_firstsrule_mehod {

	
	// Here name tag is same and 6 node are matched and if we find through xpath using name tag then it will choose first node alaways
	
public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	
		
	WebElement value =	driver.findElement(By.xpath("//input[@name='lang']"));
		
	value.click();
	
	String nameofelement =value.getAttribute("value");
	
	System.out.println("Name of first element is" +nameofelement);
}}
