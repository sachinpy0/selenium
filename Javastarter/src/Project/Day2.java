package Project;

public class Day2 {
	static String name = "sachin";
	static int age = 15;

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(name);
		System.out.println(age);
		System.out.println(num1 + num2);
		newclass();

		float pi = 3.14f;
		int radius = 20;
		float area = pi * radius * radius;
		System.out.println("The area is " + area);
		
		char myc='A';
		System.out.println(myc);
		

	}

	public static void newclass() {
		System.out.println("my address is at " + age);
		
		int item=100;
		float cost=60.70f;
		float totalcost=item+cost;
		char currency='$';
		System.out.println("Number of items" +item+cost+totalcost+currency+ "Nice");

	}

}

