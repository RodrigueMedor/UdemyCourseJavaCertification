
public class simpleSwitch {
	public static void main(String[] args) {
		int dayOfweek = 5;
		switch (dayOfweek) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wensday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
		default:
			System.out.println("Saturday");
			break;
		}

		switch (dayOfweek) {
		default:
			System.out.println("Saturday");
		case 0:
			System.out.println("Sunday");
		case 1:
			System.out.println("weekday");
		case 7:
			System.out.println("saturday");
		case 6:
			System.out.println("Friday");
			break;

		}
		
		int count = 0;
		while (count <= 10) {
			int prices = count * 10;
			System.out.println(prices);
			count++;
			
		}
	}
	
//	private int getSortOrder(String firstName, final String lastName) {
//		String middleName = "Patricia";
//		final String suffix = "JR";
//		int id = 0;
//		switch (firstName) {
//		case "test":
//			return 52;
//		case middleName: 
//			id = 5;
//			break
//		default:
//			break;
//		}
//	}

}
