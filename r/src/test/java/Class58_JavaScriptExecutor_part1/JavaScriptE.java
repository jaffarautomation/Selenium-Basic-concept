package Class58_JavaScriptExecutor_part1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*This class use concept of javascriptExecutor

TO print the title of page
To print the URL of current window 
To print the domain of page
To print the inner text of page
To refresh the page
To highlight element and border with same method
To highlight the border on element

*/


public class JavaScriptE {

	
	// Below method will return the URL of current window 
	public static String URL(WebDriver driver)
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
	String url=	Js.executeScript("return document.URL;").toString();
		return url;
		
	}
	
	//below method will return the  title of window
	public static String title(WebDriver driver)
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
	String title =	Js.executeScript("return document.title;").toString();
		return title ;
		
	}
	
	
	
	// return the domain 
	public static String domain (WebDriver driver)
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
	String domain  =	Js.executeScript("return document.title;").toString();
		return domain ;
		
	}
	
	public static String innertext (WebDriver driver)
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
	String innertext  =	Js.executeScript("return document.documentElement.innertext;").toString();
		return innertext ;
		
	}
	
	
	
	
	//Refresh the current window of browser
	public static void refresh (WebDriver driver)
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
		Js.executeScript("history.go(0)");
		
	}
	
	
	// this method highlight and border around the webelement in page
	public static void highlight (WebDriver driver, WebElement element) throws Exception
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
		Js.executeScript("arguments[0].setAttribute('style', 'background: yellow;');", element);
	
		//this method will highlight both colour and border 
	//	Js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
	
		Thread.sleep(3000);
	}
	
	
	
	//this method will higglight the border only
	public static void border (WebDriver driver, WebElement element) throws Exception
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
		Js.executeScript("arguments[0].style.border='3px solid red'", element);
		Thread.sleep(3000);
	}
	
	
	
	public static void alert (WebDriver driver,String message)
	{
		
		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
		Js.executeScript("alert('"+message+"');");
		
	}
	
	
	public static void click (WebDriver driver,WebElement element)
	{

		//type casting
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
		
		Js.executeScript("argument[0].click();",element);
		
	}
	
	
	
	

}
