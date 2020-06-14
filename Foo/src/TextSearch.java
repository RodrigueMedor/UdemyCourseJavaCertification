
public class TextSearch {
	
	public static void main(String[] args) {
		
		String fullText = "testwordtestwordtestword";
		 //String below is so just there to help see the index easier
        String showIndx = "012345678901234567890123";
        
	    String searchString  = "word";
	    
	    int lastIndex = fullText.lastIndexOf(searchString);
	    System.out.println("lastindex: "+lastIndex);
	    
	    lastIndex = fullText.lastIndexOf(searchString, 19);
	    System.out.println("And now the lastIndex = " + lastIndex);
	    
	    lastIndex = fullText.lastIndexOf(searchString, 15);
        System.out.println("And now the lastIndex = " + lastIndex);
        
        // Matches uses regexp Pattern matching, so will NOT match a
     // substring directly, unless it is the whole string...
             String mississippi = "mississippi";
             boolean matches = mississippi.matches("miss");
             boolean indexMatch = (mississippi.indexOf("miss") > -1);
             System.out.println("matches method returns " + matches +
                     " on 'miss' BUT indexOf>-1 on 'miss' = " + indexMatch);
             System.out.println("a b c".strip().length());
             System.out.println("\t  a b c\n".strip());
             String text = " abc\t ";
             System.out.println(text.trim().length());
             System.out.println(text.strip());
             System.out.println(text.stripLeading().length());
             System.out.println(text.stripTrailing().length());
             
            
	}

}
