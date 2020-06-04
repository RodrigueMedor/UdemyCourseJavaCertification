
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

		int sheep = 1;
		int zzz = 1;
		int sleep = sheep >= 10? sheep++ : zzz++;
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(sleep);
		System.out.println(sheep+" "+zzz);
		System.out.println("***************************************************************");
		boolean canine = true, walf = true;
		int teeth = 20;
		canine = (teeth != 10) ^ (walf=false);
		System.out.println(canine+"  "+ teeth+"  "+ walf);

		System.out.println("***************************************************************");
		int ph =7, vis = 2;
		boolean clear = vis > 1 & (vis < 9 || ph < 2);
		boolean safe = (vis > 2) && (ph++ > 1);
		boolean tasty = 7 <= --ph;
		System.out.println(clear+" "+safe+" "+tasty);


	}
//	static long addcandy(double fuit, float vegetable){
//		return (int) fuit + vegetable;
//	}
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
