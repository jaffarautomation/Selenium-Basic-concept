package Class49_UploadFile_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class upload {

	
	@Test
	public void upload() throws Throwable
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/ADMIN/Desktop/fileupload.html");
		
		driver.findElement(By.xpath("//*[@id='1']")).click();
		
		
		Thread.sleep(3000);
		
		
		//Psth of the compile auto it file
		Runtime.getRuntime().exec("F:\\Selenium\\Auto IT\\Files\\upload.exe");
		
				
	}
}
