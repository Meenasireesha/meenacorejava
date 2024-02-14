package project1_meena;

public class project3_legthcheck {

	public static void main(String[] args) {
		//String a = "Hi all";
		//String b = "sgsgsdgdssd";
		//i.find the length of both the Strings
		//ii. find the 5th charecter based on index from b string
		//iii. check both hte Strings are equals or not?
		//iv. convert a string to uppercase and b String to lowercase
		
		// i find the length of both the Strings?
		
		String a = "Hi all";
		String b = "sgsgsdgdssd";

		System.out.println(a.length());
		System.out.println(b.length());
		//convert a to uppercase and b to lower case
		
	System.out.println(b.toLowerCase());
	System.out.println(a.toUpperCase());
	
	//check the char based on index in the string b
	
	System.out.println(b.charAt(5));
		
		
		//check both the strings are equal or not?
		
		if(a.equals(b)) {
	System.out.println("if block executed,...both are equal");
	}
		else{
			System.out.println("else block executed,...both are not equal");
	
			
		}
	}
}


