package Class59_DynamicSearch_Google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		

		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
WebElement value =	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
        value.sendKeys("testing");
        Thread.sleep(2000);
			
List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li/div/div/div[@class='sbl1']/span"));
			
//"//ul[@class='erkvQe']//li/div/div/div[@class='sbl1']/span")

//"//ul[@class='erkvQe']//li//div[@class='sbl1']/span



int sizeoflist =list.size();


//this will print the xpath of every webelement
System.out.println(list);

System.out.println("Size of list is  : " +sizeoflist );

for (WebElement webElement : list) 

{
	
String nameofsuggestion =	webElement.getText();

System.out.println(nameofsuggestion);
	
}
	}

}
