package RunningThroughXML_part4_parallelExecution;

import org.testng.annotations.Test;

public class paraleel_methods {
	
	
	
	// Here first 2 thread is been used in XML file, in which only 2 threads run parallel , if there are 4 methods it will only run 2 at a time in 2 threads.
	
	@Test
	public void method1()
	{
		
		long r = Thread.currentThread().getId();
		System.out.println("Current thread id "  + r);
		
	}

	@Test
	public void method2()
	{
		long r = Thread.currentThread().getId();
		System.out.println("Current thread id "  + r);
		
		
	}
	
	@Test
	public void method3()
	{
		long r = Thread.currentThread().getId();
		System.out.println("Current thread id "  + r);
		
		
	}
	
	@Test
	public void method4()
	{
		long r = Thread.currentThread().getId();
		System.out.println("Current thread id "  + r);
		
		
	}
}

