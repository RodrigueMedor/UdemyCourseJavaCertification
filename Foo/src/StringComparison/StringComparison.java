package StringComparison;

public class StringComparison {

	public static void main(String[] args) {
		
		/*
		 * we'll create some string to test..
		 */	
		String nullString = null;
		String stringHello1 = "Hello"; //string literal, interned
		String stringhEllo = "hEllo"; //String literal, interned 
		
		/* string reference, not intern */
		String stringHello2 = new String(new char[] {'h','e','l','l','o'});
		
		/*
		 * StringBuilder implement subSequence, we'll test string comparison methods
		 * with alternate objects
		 */
		StringBuilder helloStringBuilder = new StringBuilder("Hello");
		
		String firstString = stringhEllo;
		String secondString = stringHello1;
		Object secondObject = secondString;
		 CharSequence secondSequence = secondString; // Line 26
		
		/* operand */
		testEqualsOperand(firstString, secondObject);
		
	//  public boolean equals(Object anObject)
		testEqualsMethod(firstString, secondObject);
		
	// ---- public boolean equalsIgnoreCase?(String anotherString)
        TestEqualsIgnoreCaseMethod(firstString, secondString);
        
        // ---- public boolean contentEquals?(CharSequence cs)
        testContentEqualsMethod(firstString, secondSequence);
        
     // ---- public int compareTo?(String anotherString)
        testCompareToMethod(firstString, secondString);

        // ----- public int compareToIgnoreCase?(String str)
        testCompareToIgnoreCaseMethod(firstString, secondString);
	}
	
	public static void testEqualsOperand(String firstString, Object secondObject) {
		System.out.println(String.format("(%s == %s) = " + (firstString == secondObject), firstString, secondObject));
		
	}
	/*
	 * public boolean equals(Object anObject) returns true if reference are the
	 * same, or if parameter type is string and value is the same
	 */
	public static void testEqualsMethod(String firststring, Object secondObject) {
		try {
			System.out.println(String.format("%s.equals(%s) = "+ (firststring.equals(secondObject)), firststring, secondObject));
		} catch (Exception e) {
			System.out.println(String.format("Error Occured with %s.equals(%s) : %s", firststring, secondObject, e.getClass().getName()));
		}
	}
	
	/*
	 * public boolean contentEquals(CharSequence cs) return true if values in string
	 * and the second passed parameter are the same.
	 */
	public static void testContentEqualsMethod(String firstString, CharSequence charSequence) {
		try {
			System.out.println(String.format("%s.contentEquals(%s) = "+ (firstString.contentEquals(charSequence)), firstString, charSequence));
		} catch (Exception e) {
			System.out.println(String.format("Error occurred with %S.equals(%s) : %s", firstString, charSequence, e.getClass().getName()));
		}
	}
	//  public boolean equalsIgnoreCase(Object anObject)
    //  returns true if two Strings have same value ignoring case
    public static void TestEqualsIgnoreCaseMethod(String firstString, String secondObject) {
        try {
            System.out.println(String.format("%s.equalsIgnoreCase(%s) = " +
                    (firstString.equalsIgnoreCase(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondObject, e.getClass().getName()));

        }
    }
    //  public int compareTo(String anotherString)
    //  Compares the value of Strings lexicographically
    public static void testCompareToMethod(String firstString, String secondString) {
        try {
            System.out.println(String.format("%s.compareTo(%s) = " +
                    (firstString.compareTo(secondString)), firstString, secondString));
        } catch (Exception e) {
            System.out.println(String.format("Error Occurred with %s.equals(%s) : %s",
                    firstString, secondString, e.getClass().getName()));

        }
    }
	/*
	 * public int compareToIgnoreCase(String str) compare the value of strings
	 * lexicographically ignoring case
	 */
	public static void testCompareToIgnoreCaseMethod(String firString, String secondString) {
		try {
			System.out.println(String.format("%s.compareToIgnoreCase(%s) = "+ (firString.compareToIgnoreCase(secondString)),firString, secondString));
		} catch (Exception e) {
			System.out.println(String.format("Error Occurred with %s.equals(%s) : %s", firString, secondString, e.getClass().getName()));
		}
	}
			

}
