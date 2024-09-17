package Project;

public class Day3 {
	public static void main(String[] args) {
		int amount = 10;
		float dbamount = amount;
		double newdouble = 9.2342d;
		int newint = (int) newdouble;

		// simple interest operator
		float p = 12;
		float r = 12;
		float t = 2;
		float si = p * r * t;
		System.out.println(si);

		// char at
		String myStr = "hello";
		char result1 = myStr.charAt(4);
		System.out.println(result1);

		System.out.println(myStr.toUpperCase());

		// cat
		String firstname = "Sachin";
		String surname = "Pandey";
		System.out.println(firstname.concat(surname));

		System.out.println(newint);
		System.out.println(dbamount);
		System.out.println(dbamount);
	}

}
