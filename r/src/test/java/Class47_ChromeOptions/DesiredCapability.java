package Class47_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapability {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// We cannot use DC directly we need to merge with the chromoption method
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setAcceptInsecureCerts(true);
		
	
		
		ChromeOptions options = new ChromeOptions();
		
		
		// Provide the path of extension on hardrive and chrome will open with that extension
		//options.addExtensions(new File(""));
		
		
		options.addArguments("--start-maximized"); // after this chrome will open in maximzed mode 
	
		options.addArguments("disable-infobars");
	
		options.merge(cap);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.co.in/");
		
		
	}
}
