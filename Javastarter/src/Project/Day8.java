package Project;

public class Day8 {

	// num1++ = num1=num1+1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int num1=0; num1<5; num1++) {
//			System.out.println(num1);
//		}

		// arrays

		String[] cars = { "Maruti", "Tesla", "Mercedes" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// for loop

		int[][] mynum = { { 1, 2, 3, 4 }, { 4, 5, 6 } };
		for (int i = 0; i < mynum.length; i++) {
			for (int j = 0; j < mynum.length; j++) {
				System.out.println(mynum[j][i]);
			}
		}

		// nested loop

		for (int i = 1; i <= 2; i++) {
			System.out.println("Outer loop:" + i);
			for (int j = 1; j <= 2; j++) {
				System.out.println("Inner loop:" + j);
			}
		}

			// breaks
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);

		}

	}
}
