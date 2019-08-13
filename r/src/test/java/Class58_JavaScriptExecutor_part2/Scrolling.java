package Class58_JavaScriptExecutor_part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		
	
		option.addArguments("start-maximized");
		 option.addArguments("--disable-popup-blocking");   // all pops up will be disabled
			option.addArguments("--disable-notification");
				option.addArguments("disable-infobars");
			
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html#3");
		//Scrolling_lib.scroll(driver);
		
		WebElement element = driver.findElement(By.xpath("//*[@id='g-mainbar']/div[1]/div/div/div/div/div/div[2]/p[27]/strong"));
		Scrolling_lib.scrolltillvisible(driver, element);
		
		
		
		// switch to different url
		driver.navigate().to("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		
		// Scroll in horizontal view
		WebElement value1 = driver.findElement(By.xpath("//*[@id='rt-feature']/div/div[1]/div/div/div/div/div[4]/div/div/div/div/div[1]/div/div/h4/a"));
		Scrolling_lib.scrolltillvisible(driver, value1);
		
		
		driver.navigate().back();
		Scrolling_lib.scrollby(driver);
		
	}

}
