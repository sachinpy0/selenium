package Project;

public class Day4 {
	public static void main(String[] args) {
		String first = "sachin";
		String last = "pandey";
		String firstname = "pscy is a good";
		String firstname1 = "";
		String first0 = "Hello";
		char[] myArray1 = first0.toCharArray();

		System.out.println(first + " " + last);
		System.out.println(first.concat(last));

		String fruits = String.join("Apple", "Grape");
		String address = String.join("fruit", "food");

		System.out.println(first.endsWith("hin"));
		System.out.println(first.startsWith("sa"));
		System.out.println("Both are same" + firstname.equals("first"));
		System.out.println(firstname1.isEmpty());

		System.out.println(fruits);
		System.out.println(address);

		System.out.println(first.replace("s", "p"));
		System.out.println(firstname.substring(3, 1));
		System.out.println(myArray1[1]);
		System.out.println(firstname.trim());

	}

}
