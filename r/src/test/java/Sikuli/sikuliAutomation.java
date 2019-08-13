package Sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


/*Sikuli is an open source GUI based automation tool. It is used to interact with elements of a web page and handling windows based popups. It uses the technique of 'Image Recognition' to interact with elements of the web page and windows popups. Sikuli considers all the elements of a web page as images and recognizes the elements based on their images. Sikuli is preferred when UI elements are stable and are not constantly changing.
*/



public class sikuliAutomation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=xjicXZo6o4Y");
		
		Screen s = new Screen();
		
		Pattern p =new Pattern("pause.png");
		s.wait(p,3000);
		s.click(p);
		
		//Below message will display on the console will click was successfull
		//[log] CLICK on L(144,574)@S(0)[0,0 1366x768]
		
		//click on setting button 
		Pattern p1 =new Pattern("setting.png");
		s.wait(p1,3000);
		s.click(p1);
		
        // click on play button
		Pattern p11 =new Pattern("play.png");
		s.wait(p11,3000);
		s.click(p11);
		
	}

}
