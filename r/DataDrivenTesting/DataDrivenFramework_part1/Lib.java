package DataDrivenFramework_part1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Lib {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFSheet sheet1;
	 XSSFRow row;
	
 public Lib (String filepath) throws Throwable
 {
	 
	 
	 File filepathvalue = new File(filepath);
	 
	 FileInputStream value1 = new FileInputStream(filepathvalue);
	 
	  workbook = new XSSFWorkbook(value1);
	
 }
 
 public int getrowcount(int sheetindex)
 
 {
	 
	 
	  int rowcount =workbook.getSheetAt(sheetindex).getLastRowNum();
	 
	  return rowcount;
 }
 
 public int getcoulmncount (int sheetindex)
 
 {
	 
	sheet1  =workbook.getSheetAt(sheetindex);
	  row=sheet1.getRow(0);
	  
	  int column = row.getLastCellNum();
	  
	  System.out.println(column);
	  return column;
 }
 
 //This method will fetch the value to cell in excel sheet 
  public String getdata (int sheetnumber, int row, int column)
  {
	  
	  sheet= workbook.getSheetAt(sheetnumber);
	 String row1=  sheet.getRow(row).getCell(column).getStringCellValue();
	row1 =row1+1;
	 return row1;
  }
  
  
	
}
