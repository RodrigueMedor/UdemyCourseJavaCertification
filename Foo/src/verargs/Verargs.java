package verargs;


public class Verargs {
	
//	public void walk1(int... nums) {}
//	
//	public void walk2(int start, int... nums){}
//	
//	public void walk3(int... nums, int start) {}
//	
//	public void walk4(int... start, int... nums) {}
	
	public static void main(String[] args) {
		walk(1);
		walk(1, 2);
		walk(1,2,3);
		walk(1, new int[] {4,5,6,7,8,9});
		walk(1, null);
	}
	
	public static void walk(int sart, int... nums) {
		
		System.out.print(nums.length+" ");
	}

}
