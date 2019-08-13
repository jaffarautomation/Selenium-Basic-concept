package Class31_takingscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotLib {

	
	
	
	public static void takesreen(WebDriver driver, String Screenshotname) throws Throwable
	{
		
		//type casting file
		   TakesScreenshot  ss = (TakesScreenshot)driver;
		   
		   //In below code Screenshot  is in form of file and storing in o reference
		File o = ss.getScreenshotAs(OutputType.FILE);
		

	    //in below code we are copying that o reference to your desired location.
	   FileHandler.copy(o, new File("./Scrrenshot/"+Screenshotname+".png"));
	}
}
