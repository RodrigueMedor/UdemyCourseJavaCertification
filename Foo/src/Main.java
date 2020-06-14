import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		// Get the Arrays 
        int intArr[] = { 10, 20, 15, 22, 35 }; 
  
        // Get the second Arrays 
        int intArr1[] = { 7, 40, 78, 89 }; 
        
        System.out.println("The element mismatched at index: "+ Arrays.mismatch(intArr1, intArr));
	}

}
