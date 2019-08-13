package DataDrivenFramework_TestNG_Part2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class data {

	
	@Test
	public void method ()
	{
		
		
	}
	
	
	@DataProvider(name = "Database")
	@SuppressWarnings({ "resource", "unused" })
	public Object[][] database() throws Throwable
	{
		
		File Excelfile = new File ("F:\\Selenium\\Excel file\\Data.xlsx");
		
		FileInputStream Object = new FileInputStream(Excelfile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(Object);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totalrows =sheet.getLastRowNum();
		
		System.out.println(totalrows);
		
		
		String[][] value = new String[totalrows][2];
		
		for(int i =0; int<totalrows; i++)
		{
			
			for(int j =0; j<2;j++)
				
			{
				
			}
			
		}
		
		
		
		
		
		
		return null;
}}
