package SeleniumWebDriverMethod_HandlingElementPart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationonBrowserMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//get method :
		//it opens the specified URL in browser window
		driver.get("https://www.google.co.in/");
		
		//getTitle : 
		// it return the title of the browser 
		String S1 = driver.getTitle();
		System.out.println(S1);
		
		//getPageSource () 
		//it return the HTML page source
		
		// String S2 = driver.getPageSource();
		//System.out.println(S2);
		
		//GetCurrentURL ()
		//it return the Current URL of the browser
		String S3 = driver.getCurrentUrl();
		System.out.println(S3);
		
		//navigate().to() method
		// it load a new web page in current browser window
		
		
		
		

	}

}
