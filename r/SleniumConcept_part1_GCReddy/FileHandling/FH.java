package FileHandling;

import java.io.File;
import java.io.IOException;

public class FH {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//Create the folder 
		File fileobject = new File("C:/Users/ADMIN/Desktop/Selenium");
            fileobject.mkdir();
            
            // check the existence of folder
		
		boolean a = fileobject.exists();
				if (a == true)
				{
					System.out.println("Folder exists");
					
				}
				else {System.out.println("Folder not exits");}
				
		// 3 delete the folder  
				
				boolean b =fileobject.delete();
				
				System.out.println(b);
				
	// 4 create a text file   
				File fileobject1 = new File("C:/Users/ADMIN/Desktop/UTF.txt");
				
				boolean c = fileobject1.createNewFile();
				
				System.out.println(c);
				
	}

}
