package SeleniumClass_25;

import org.openqa.selenium.By;

public class Testcase1 extends Methods{

	
	public void navigateaccount()
	{
		driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text"));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		Testcase1 obj = new Testcase1();
		
		
		
		
		obj.launchbrowser();  // launch browser
		obj.sessionid();      // Print the session id
		obj.AdminLogin();         // Login functionality
		obj.navigateaccount();    // click on my account link
		obj.close();                  // close browser
		
		
	}

}
