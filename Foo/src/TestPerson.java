/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Identify the Scope of a variable
*/

public class TestPerson {

	public static void main(String[] args) {
		// First we'll create a person, JOE using 2 args constructor.
		Person joe = new Person("JOE", "55");
		// Next we'll create a person, using 1 arguments
		Person deb = new Person("DEB", "85");
		// And now the noargs constructor, and using setters
		Person ann = new Person();
		ann.setAge("21");
		ann.setInstanceName("ANN");
		System.out.println(joe);
		System.out.println(deb);
		System.out.println(ann);
	}

	public String getDecade(int age) {
		String decadeString = "";

		// This variable holds the maximum decade
		int decadeNumber = age / 10;
		// add variable j
		int j = 0;
		for (int i = j = 0; i < (decadeNumber + 1); i++, j++) {
			// local loop block variable named decade, scope is loop
			String decade = "Decade " + (age / 10);
			if (i == (decadeNumber)) {
				decadeString = decade;
			}
		}
		int modyear = age % 10;
		decadeString += ", Year" + modyear;
		return decadeString;
	}
}