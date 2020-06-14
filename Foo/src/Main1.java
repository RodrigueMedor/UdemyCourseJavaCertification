import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 implements Comparator<student> {

	@Override
	public int compare(student o1, student o2) {

		return o1.rollno - o2.rollno;
	}

	public static void main(String[] args) {
		student[] arr = { 
				new student(111, "bbbb", "london"), 
				new student(131, "aaaa", "nyc"),
				new student(121, "cccc", "jaipur") 
				};

		System.out.println("Unsorted");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		//Arrays.sort(arr, 1, 2, new Main1());
		 Arrays.sort(arr, new Main1()); 

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		int numFish = 4;
		String fishType = "Tuna";
//		String anotherfish = numFish + 1;
		System.out.println(numFish +" "+ 1);
		
//		List gose = new ArrayList<>();
//		var gros  = new ArrayList<>();
//		for(var t: gros) 
//			System.out.println();
		
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "cccc");
		System.out.println(sb);
		/*
		 * int count =0; String s1 = "java"; String s2 = "java"; StringBuilder s3 = new
		 * StringBuilder("java"); if(s1 == s2) count++; if(s1.equals(s2)) count++; if(s1
		 * == s3) count++;
		 */
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		String roar1 = "roarM";
		StringBuilder s = new StringBuilder("roar");
		new Main1().roar(roar1, s);
		
		System.out.println(roar1+" "+s);
		
	}
	public void roar(String roar1, StringBuilder roar2) {
		roar1.concat("!!!!!!!!!!");
		roar2.append("@@@@@@@@@@@@@@");
		System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
		String numbers = "012345678";
		System.out.println(numbers.substring(3));
		
	}

}
