package Class31_TakingScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.FactoryUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	ScreenshotLib.takesreen(driver, "Facebook2");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john");
	ScreenshotLib.takesreen(driver, "Facebook3");
	
	
	 
	
	driver.close();
	}

}
