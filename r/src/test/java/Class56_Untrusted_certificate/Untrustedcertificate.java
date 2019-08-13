package Class56_Untrusted_certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Untrustedcertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		
		DesiredCapabilities cap = new DesiredCapabilities();
		 
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS , true);
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		options.merge(cap);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.cacert.org");
		
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		
		
	}

}
