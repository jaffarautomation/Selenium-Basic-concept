package Class57_Webtable_handling;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import okio.Options;


// dynamic xpath to select calender date
public class WebTable {


	@Test
	public void webtable1() throws InterruptedException, Throwable
	{

		ChromeOptions y = new ChromeOptions();

			System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

			ChromeOptions option = new ChromeOptions();
			
			option.addArguments("incognito");
			
			option.addArguments("start-maximized");
			
			 option.addArguments("--disable-popup-blocking");   // all pops up will be disabled
		     
				option.addArguments("--disable-notification");
				
				option.addArguments("disable-infobars");
				
			WebDriver driver = new ChromeDriver(option);
			
			driver.get("https://www.redbus.in/");
			
			
			
			Thread.sleep(5000);
			
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='__ta_notif_frame_0']")));
			
			
			
		/*	
			WebDriverWait wait = new WebDriverWait(driver, 20);

			// Here we will wait until element is not visible, if element is visible then it will return web element
			// or else it will throw exception
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='close']")));
*/
			
			driver.findElement(By.xpath("//div[@class='close']")).click();
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
			
			
			
			
			
	     // clicking on a specific date
			
		List<WebElement> value =	driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td"));
			
		int x =value.size();
		System.out.println(x);

		
		for (WebElement value1 : value) {
			
			
			String y1 =value1.getText();
			System.out.println(y1);
			
			if (y1.equals("31"))
			{
				 
				value1.click();
				break;
			}
		}
}}
