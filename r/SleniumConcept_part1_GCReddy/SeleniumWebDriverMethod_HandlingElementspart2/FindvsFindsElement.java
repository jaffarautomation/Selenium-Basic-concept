package SeleniumWebDriverMethod_HandlingElementspart2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindvsFindsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		

		
	//System.out.println(driver.findElements(By.tagName("a")));
	List<WebElement> obj =driver.findElements(By.tagName("a"));
		     int a =obj.size(); // this will return the no of the webelement which have been identified using the tagname a
		System.out.println(a);  // print the size in console
		
		//It check if there are any element in the list, even if one element is present result will be false otherwise true
		boolean a1 = obj.isEmpty();
		System.out.println(a1);
		
		//get the webelement name which is present at 2 index position
		System.out.println(obj.get( 2));
		
		
	
		
		//Using foreach loop to print the text of all the linktext present in object obj
		
		for (WebElement storinglist : obj)
		{
			
			String s = storinglist.getText();
			System.out.println(s);
			
		}
		
		driver.navigate().to("http://www.gcrit.com/build3/create_account.php");
		WebElement r1 =driver.findElement(By.className("country"));
	}

}
