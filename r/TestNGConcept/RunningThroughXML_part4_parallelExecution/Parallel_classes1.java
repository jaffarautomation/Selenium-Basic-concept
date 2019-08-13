package RunningThroughXML_part4_parallelExecution;

import org.testng.annotations.Test;

public class Parallel_classes1 {

	
	
	@Test
	public void method1() throws InterruptedException
	{
		for (int i =10;i<=15;i++)
		
		{
			
			System.out.println( (i));
			Thread.sleep(2000);
			
		}
		
	}
}
