package Class58_JavaScriptExecutor_part1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	
		

		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		
	
		option.addArguments("start-maximized");
		 option.addArguments("--disable-popup-blocking");   // all pops up will be disabled
			option.addArguments("--disable-notification");
				option.addArguments("disable-infobars");
			
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
		
		// Below method will fetch the URL of current window by JavaScript concept
		System.out.println(JavaScriptE.URL(driver));
		
		
		//below method will fetch the title of current window of browser by javascript concept
		String Title = JavaScriptE.title(driver);
		System.out.println("Title of current window is : " + Title );
		
		
		//Return the domain of the current window 
	String Domain	=JavaScriptE.domain(driver);
		System.out.println("Domain is : " + Domain );
	
		
		
		//Refresh the current page 
		JavaScriptE.refresh(driver);
		
		
		// belowmethod will highlight the webelement on webpage
		
	 WebElement	 googletextbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	 JavaScriptE.highlight(driver,googletextbox);
	 
	 
	
	 WebElement	 google = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	 JavaScriptE.border(driver, google);
	 
	 
	 //This code pop up the alert 
	 JavaScriptE.alert(driver, "this is javascript alert");
	 
	 
	Alert s = driver.switchTo().alert();
	 s.accept();
	 
	 
	 // this method click on webelment
	 WebElement click = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[2]"));
	 JavaScriptE.click(driver,click);
	 
	 
	}
	
	

}
