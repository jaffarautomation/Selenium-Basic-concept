package SeleniumClass23_CreateTestCases;



import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTCcheck_Dynamiccheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	WebElement t = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
		t.sendKeys("irctc");
		Thread.sleep(3000);
		List<WebElement> name = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	    int sizeoflist = name.size();
	    System.out.println(sizeoflist);
	    
	    for(int i=0;i<sizeoflist;i++)
	    {
	    	String nameofsuggestion = name.get(i).getText();
	    	if(nameofsuggestion.contains("irctc"))
	    	{
	    		name.get(i).click();
	    		break;
	    	}
	    }
	    
		//driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.FPdoLc.VlcLAe > center > input[type=submit]:nth-child(1)")).click();
		
	List<WebElement> t1=driver.findElements(By.partialLinkText("IRCTC"));
	int a = t1.size();
	System.out.println(a);
	
	// below code will throw following because we have navigate to other page and using t1 variable from different page
		//The most frequent cause of this is that page that the element was part of has been refreshed, or the user has navigated away to another page. 
		// only if break is comment in 
	
	try {
	for(int i =0;i<a;i++)
	{
		
		String y = t1.get(i).getText();
		
		if (y.contains("IRCTC Next Generation eTicketing System"))
		{
			System.out.println(y);
			t1.get(i).click();
	     	break;
		}
	}}
	
	catch (StaleElementReferenceException u)
	{
		System.out.println("Error - You have navigate to different page:");
	}
		
	// Login to IRCTC by using scanner class
	
	driver.findElement(By.cssSelector("body > app-root > app-home > div:nth-child(1) > app-header > div.h_container_sm > div.h_menu_drop_button.hidden-xs > a")).click();
	driver.findElement(By.xpath(" //*[@id='slide-menu']/p-sidebar/div/nav/div/label/button")).click();
	
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.cssSelector("#userId"));
	username.click();
	username.clear();
	username.sendKeys("ajaffar526");
	
	WebElement password = driver.findElement(By.cssSelector("#pwd"));
	password.click();
	password.sendKeys("axq221");
	
	
	//Dynamic submission on text data
	// Creating scanner class to read the captha value which user has entered on screen
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of captcha");
	String Cvalue = scan.nextLine();
	
	//Passing cvalue in captcha box of IRCTC login page
	
	 driver.findElement(By.cssSelector("#nlpAnswer")).sendKeys(Cvalue);
	
	 // Click on sign in button
	 
	 driver.findElement(By.cssSelector("#login_header_disable > div > div.ui-dialog-content.ui-widget-content > div.irmodal > div > div.login-bg.pull-left > div.modal-content > div.modal-body > form > button")).click();
	 
			
			
	
	
	
	
	 	// Now entering station name process
	 
	WebElement Stationfrom =driver.findElement(By.cssSelector("#origin > span > input"));
        Stationfrom.sendKeys("PUNE");
        Thread.sleep(3000);
		WebElement tab = driver.findElement(By.xpath("//*[@id='origin']/span/div/ul/li/span"));
    	Actions r = new Actions(driver);
		r.moveToElement(tab).build().perform();
		tab.click();
		
		WebElement Stationto =driver.findElement(By.cssSelector("#destination > span > input"));
		Stationto.sendKeys("Nagpur");
		Thread.sleep(3000);
		WebElement tabto = driver.findElement(By.xpath("//*[@id='destination']/span/div/ul/li[1]"));
    	r.moveToElement(tabto).build().perform();
    	tabto.click();
    	
    	
    	WebElement Fdate =driver.findElement(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[6]/div[1]/label"));
    	boolean value1 =Fdate.isSelected();
    	System.out.println(value1);
    	
    	Fdate.click();
    	
    	WebElement findbutton =driver.findElement(By.cssSelector("#divMain > div > app-main-page > div:nth-child(2) > div > div.row > div > div > div.col-xs-12 > div > app-jp-input > div:nth-child(4) > form > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.text-center.form-group > button"));
    	findbutton.click();
    	
    	
    	
    	
		
	}	
}
