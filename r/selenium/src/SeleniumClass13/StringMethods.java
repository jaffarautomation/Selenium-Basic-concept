package SeleniumClass13;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t1 = "selenium";
		String t2 = "SELENIUM";
		String t3 = "seleniuma";
		String t4 = "selenium ";
		String t5 = "       selenium"; 
		String t6 = "selenium test result";
		
		// 3 way comparision compare to method is used
		System.out.println(t1.compareTo(t2));  // positive
		System.out.println(t1.compareTo(t4));  // 0
		System.out.println(t1.compareTo(t4));  // negative
		
		//2 way comparion only true or false is return
		System.out.println(t1==t2);
		System.out.println(t1==t4);
		// equal method
		System.out.println(t1.equals(t2));
		
		//concat method
		System.out.println(t1+t2);
		
		System.out.println(t1+1+1);
		
		// in this first priority is given to bracket first addition and then concat happens
		System.out.println(t1+(1+1));
		
		//Charat() method - it return the character at specific index of string
		System.out.println(t1.charAt(4));
		
		//equal ignore case method - it just compare the length of string 
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1.equalsIgnoreCase(t3));
		
		//touppercase () method
		System.out.println(t1.toUpperCase());
		
		//to lowercase method () 
		System.out.println(t2.toLowerCase());
		
		//Trim () methods -> it remove the space from both side
		System.out.println(t5.trim());
		
		//sub string method () with parameter
		System.out.println(t2.substring(2));
		
		//Sub string with parameter of start and end string
		System.out.println(t2.substring(1,5));
		
		//endwith () method - > it end with specified suffix
		System.out.println(t6.endsWith("result"));
		
		//lenght method -> return the lenght of string return numeric value (including the spaces)
		System.out.println(t4.length());
		
	
	}

}
