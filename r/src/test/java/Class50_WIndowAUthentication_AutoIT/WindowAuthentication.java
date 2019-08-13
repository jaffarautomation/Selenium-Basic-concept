package Class50_WIndowAUthentication_AutoIT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthentication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		WebDriver driver = new ChromeDriver();
		
		Runtime.getRuntime().exec("F:\\Selenium\\Auto IT\\Window authentication\\WindowA1.exe");
		driver.get("https://www.engprod-charter.net");
	}

}
