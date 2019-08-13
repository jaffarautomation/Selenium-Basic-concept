package Myproject;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class downloaf_film {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement t = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
		
		t.sendKeys("yify");
			Thread.sleep(3000);
			
			List<WebElement>r = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
				int y =r.size();
				System.out.println("No of suggestion is " + y);
				
				for (int i=0; i<y; i++)
				{
					String p = r.get(i).getText();
					System.out.println(p);
					if(p.contains("yify"));
					{
					       r.get(i).click();
					       break;
					}
					
				}
		
		
		
		
		List<WebElement> allLinkname = driver.findElements(By.tagName("h3"));
		
	
		//Print the size of no of linkname present in alllinkname
		
		int size = allLinkname.size();
		System.out.println(size);
		
		//Printing there names in console
		for (WebElement Link : allLinkname) {
			
			String value = Link.getText();
			System.out.println(value);
		}
		
		for(int i =0; i<size; i++)
		{
			
			String value2 = allLinkname.get(i).getText();
			if (value2.equals("YTS: The Official Home of YIFY Movies Torrent Download"))
			{
				allLinkname.get(i).click();
				break;
			}
					
		}
		
		//Printing name of yify window
		String yifywindow = driver.getWindowHandle();
		System.out.println(yifywindow);
		
		//Click on browse search box text box
		driver.findElement(By.cssSelector("#quick-search-input")).click();
		
		
		// Storing all tab or window value in allwindow variable
		
		Set<String> allwindow = driver.getWindowHandles();
		// Printing the no of window
		System.out.println(allwindow.size());
		
		//Proof that still first window has power
		System.out.println(driver.getCurrentUrl());
		
		//Printing the exact values of each window
		System.out.println(allwindow);
		
		//Switch to second window
		for (String child : allwindow) {
			if(!child.equals(yifywindow))
			{
				driver.switchTo().window(child);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		
		//Again switch to yify window
		driver.switchTo().window(yifywindow);
		System.out.println(driver.getCurrentUrl());
		
		//closing unwanted popup
		//driver.findElement(By.cssSelector("#id5c2a23c1c4close-cross5c2a23c1c4")).click();
		
		//Click on browse search box text box
		driver.findElement(By.cssSelector("#quick-search-input")).sendKeys("captain marvel");
		
		
		//driver.findElement(By.cssSelector("#quick-search-input")).click();
	// driver.findElement(By.cssSelector("#quick-search-input")).sendKeys(Keys.ENTER);
		
	
		
		
	

}}
