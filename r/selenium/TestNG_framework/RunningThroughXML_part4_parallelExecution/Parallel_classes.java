package RunningThroughXML_part4_parallelExecution;

import org.testng.annotations.Test;

public class Parallel_classes {

	
	//Uhsing thread for two classes, in testng xml classes run one after another, in second xml file classes run parallely
	
	@Test
	public void method1() throws InterruptedException
	{
		for (int i =0;i<=5;i++)
		
		{
			
			System.out.println( (i));
			Thread.sleep(2000);
			
		}
		
	}

	
	

}
