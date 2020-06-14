package object;

public class Gliders {
	
	public static String glide(String s) {
		return "1";
	}
	
	public static String glide(String... s) {
		return "2";
	}
	
	public static String glide(Object o) {
		return "3";
	}
	public static String glide(String s, String t) {
		return "4";
	}

	public static void main(String[] args) {
		System.out.println(glide("a"));
		System.out.println(glide("b"));
		System.out.println(glide("a","b"));
		System.out.println(glide("a", "b", "c"));

	}

}
