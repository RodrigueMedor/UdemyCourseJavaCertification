
public class Study1 {
	
	public static void main(String[] args) {
		
		int a = 2, b = 3;
		
//		a = a * b;
		a +=b;
		System.out.println("a: "+a);
		
		long c = 10;
		int d = 10;
		d *= c;
		System.out.println("d: "+ d);
		openZoo(20.00);
		System.out.println(null instanceof Object);
		Object noOject = null;
		System.out.println(noOject instanceof String);
	}
	public Study1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void openZoo(Number time) {
		if(time instanceof Integer)
			System.out.println((Integer)time +"  O'clock");
		else {
			System.out.println(time);
		}
	}
	
	

}
