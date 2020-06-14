
public class StringSection {
	
	public static void main(String[] args) {
		 String start = "      AniMal    ";
         String trimmed = start.trim();
         System.out.println(trimmed);
         String lowercase = trimmed.toLowerCase();
         System.out.println(lowercase);
         String result = lowercase.replace('a', 'A');
         System.out.println(result);
         String alpha = "";
         for(char current = 'a'; current <= 'z'; current++)
        	 alpha += current;
         System.out.println(alpha);
         
         StringBuilder alpha1 = new StringBuilder();
         for(char current = 'a'; current <= 'z'; current++)
        	 alpha1.append(current);
         
         System.out.println(alpha);
         
         StringBuilder a = new StringBuilder("abc");
         StringBuilder b = a.append("de");
         b = b.append("f").append("g");
         System.out.println("a="+a);
         System.out.println("b="+b);
         
         StringBuilder sb = new StringBuilder("animals");
         String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
         int len = sb.length();
         char ch = sb.charAt(6);
         System.out.println(sub+" "+len+" "+ch);
         
         String singleString = "hello world";
         String online = "hello "+ "world";
         String concat = " hello";
         concat += "world";
         System.out.println(singleString == online);
         System.out.println(singleString == concat);
         System.out.println("***********************************************");
         String pool = "hello world";
         String ob = new String("hello world").intern();
         System.out.println(pool == ob);
         String pool1 = "hello world".intern();
         String ob1 = new String("hello world");
         System.out.println(pool1 == ob1);
         System.out.println("******************************************************");
         String first = "rat" + 1;
         String second = "r" + "a" + "t" + "1";
         String third = "r" + "a" + "t" + new String("1");
         System.out.println(first == second);
         System.out.println(first == second.intern());
         System.out.println(first == third);
         System.out.println(first == third.intern());
        
	}

}
