package SeleniumWebDriverMethod_HandlingElementPart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsernavigationmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//navigate().to() method
	    // it load a new web page in current browser window
		
	/*driver.get("https://www.google.co.in/");
	String s1 =driver.getCurrentUrl();
	System.out.println(s1);
	driver.navigate().to("https://www.facebook.com/");
	 s1 =driver.getCurrentUrl();
	System.out.println(s1);*/
	
	//navigate().back() method
	// it moves a single item back in browser history
	/*
		driver.get("https://www.google.co.in/");
		String s4 =driver.getCurrentUrl();
		System.out.println(s4);
		driver.navigate().to("https://www.facebook.com/");
		 s4 =driver.getCurrentUrl();
		System.out.println(s4);
		driver.navigate().back();  // it move to google website
		s4=driver.getCurrentUrl();
		System.out.println(s4);
	*/
		//navigate().forward() method
		 /**
	     * Move a single "item" forward in the browser's history. Does nothing if we are on the latest
	     * page viewed.
	     */
		driver.get("https://www.google.co.in/");
		String s5 =driver.getCurrentUrl();
		System.out.println(s5);
		driver.navigate().to("https://www.facebook.com/");  // this navigate to facebook website
		 s5 =driver.getCurrentUrl();
		System.out.println(s5);
		
		driver.navigate().back();  // it move to google website
		s5=driver.getCurrentUrl();
		System.out.println(s5);
		
		driver.navigate().forward();  // this navigate to facebook website
		s5=driver.getCurrentUrl();
		System.out.println(s5);
		
		driver.navigate().refresh();  //it refresh the current page
		
		driver.close(); // it close the current browser
	
	}

}
