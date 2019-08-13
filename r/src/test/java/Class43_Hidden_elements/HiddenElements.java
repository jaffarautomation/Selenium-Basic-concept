package Class43_Hidden_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	
	
public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		//In below code xpath was matching with 2 node, so in this case selenium will always click on first node. in your case it is hidden element.
		// now if you run this code it will throw an exception , element not visible
		
		// driver.findElement(By.xpath("//input[@id='male']")).click();
		
		/*  // Now we will use x and y co-ordinate to see whether elment is visible on screen. 
		  //if x and y co-ordinate are zero then elment is not visble.
		  
		
		
		WebElement value= driver.findElement(By.xpath("//input[@id='male']"));
			 
		 int x= value.getLocation().getX();
		
		 int y= value.getLocation().getY();
		 
		 System.out.println("X location is " + x);
			
		 System.out.println("Y location is " + y);*/
			
		
		List<WebElement> value1= driver.findElements(By.xpath("//input[@id='male']"));
		
		int no_of_radio_button=value1.size();
		
		for(int i=0; i<no_of_radio_button;i++)
		{
		int xlocation=	value1.get(i).getLocation().getX();
			
		if(xlocation==0)
			{
			
			WebElement value2 =value1.get(i);
			String Name = value2.getText();
			System.out.println("Element with name "+ Name+"is not visible on screen");	
			}
		
		else{
			
			WebElement value2 =value1.get(i);
			String Name = value2.getText();
			value1.get(i).click();
			System.out.println("Element with name "+Name+"is  visible on screen");
			break;
		}
		}
		
}}
