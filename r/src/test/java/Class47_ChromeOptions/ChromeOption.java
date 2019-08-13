package Class47_ChromeOptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption {
	
	
	
	/*
	start-maximised: Opens Chrome in maximize mode
	
	incognito: Opens Chrome in incognito mode
	
	headless: Opens Chrome in headless mode
	
	disable-extensions: Disables existing extensions on Chrome browser
	
	disable-popup-blocking: Disables pop-ups displayed on Chrome browser
	
	make-default-browser: Makes Chrome default browser
	
	version: Prints chrome browser version
	
	disable-infobars: Prevents Chrome from displaying the notification 'Chrome is being controlled by automated software
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		
		ChromeOptions options = new ChromeOptions();
		
		
		// Provide the path of extension on hardrive and chrome will open with that extension
		//options.addExtensions(new File(""));
		
		
		options.addArguments("--start-maximized"); // after this chrome will open in maximzed mode 
		
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");   // all pops up will be disabled
        options.addArguments("--incognito");   // open in incognito mode
		options.addArguments("--disable-notification");
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.co.in/");
		
		
	}

}
