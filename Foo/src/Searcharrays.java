import java.util.Arrays;

public class Searcharrays {
	
	public static void main(String[] args) {
		int[] numbers = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 11));
		System.out.println(Arrays.binarySearch(numbers, 10));
		System.out.println(Arrays.binarySearch(numbers, 20));
		System.out.println(Arrays.binarySearch(numbers, 7));
		System.out.println(Arrays.binarySearch(numbers, 5));
		System.out.println("*******************************************");
		System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));
		System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"}));
		System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));
		
	}

}
