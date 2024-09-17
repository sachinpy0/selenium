package Project;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// only if condition
		if (20 > 18) {
			System.out.println("20 is bigger than 18");

		}

		int x = 30;
		int y = 20;
		if (x > y) {
			System.out.println("Bigger number");
		}
		try (Scanner getnum = new Scanner(System.in)) {
			System.out.println("Enter number: ");

			int num1 = getnum.nextInt();

			if (num1 < 12) {
				System.out.println("Have a nice");
			}

			else {
				System.out.println("Good evening");
			}
			int votingage = 18;
			if (num1 >= votingage) {
				System.out.println("You can vote");
			}

			else {
				System.out.println("You can't vote");
			}
			
			
			// multiple iff
			int time = 10;
			if (time < 10) {
				System.out.println("Good morning");
			} else if (time < 18) {
				System.out.println("Good day");
			} else {
				System.out.println("Good night");
			}
			
			
			// switch java
			int day = 1;
			switch (day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Mpnday");
				break;

			default:
				System.out.println("This is default day");
			}

		}
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);

	}
}
