package Match;

public class Match1 {

	public static void main(String[] args) {
		
		String str = new String("Welcome to geeksforgeeks");
		
		/* Test is regex is present */
		System.out.print("Does string contains regex (.*)geeks(.*) ? : ");
		System.out.println(str.matches("(.*)geeks(.*)"));
		 // Testing if regex is present 
	      System.out.print("Does String contains regex geeks ? : " ); 
	      System.out.println(str.matches("geeks")); 
	      // Initializing String  
	      String str1 = new String("Welcome to geeksforgeeks"); 
	      // Initializing test String 
	      String str2 = new String("GEEKS"); 
	   // Tests whether GEEKS starts in geeksforgeeks starting from pos 11 
	   // and from 0 ( i.e starting in GEEKS) and ignores case 
	   // and compares 5 characters of GEEKS
	    System.out.println("Checking if GEEKS is in geeksforgeeks( case insensitive ) : ");  
	    System.out.println(str1.regionMatches(true, 11, str2, 0, 5));
	}

}
