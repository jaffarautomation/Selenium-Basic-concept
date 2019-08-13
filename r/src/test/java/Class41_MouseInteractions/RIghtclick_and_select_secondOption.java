package Class41_MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RIghtclick_and_select_secondOption {

public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	// Start browser
	WebDriver driver = new ChromeDriver();
	



driver.get("https://www.google.co.in/");

driver.manage().window().maximize();

WebElement elment = driver.findElement(By.xpath("//a[text()='Gmail']"));


Actions act=new Actions(driver);


//Below code use enter button
act.contextClick(elment).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

// below code use click option
act.contextClick(elment).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();


}

}