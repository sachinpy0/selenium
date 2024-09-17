package Project;

import java.util.Arrays;

public class Day5 {
	public static void main(String[] args) {

		// this will define array without size
		String cars[] = { "Sachin", "Pyscy" };
		int[] myClass = { 1, 2, 3, 4 };

		System.out.println(cars[1]);
		System.out.println(myClass[2]);

		// declaring array with size

		int[] array0;
		array0 = new int[2];
		array0[0] = 10;
		array0[1] = 20;

		cars[0] = "Mercedes";

		System.out.println(array0[1]);
		System.out.println(cars[0]);

		System.out.println(array0.length);

		// arrays sorting
		int[] sachin = { 10, 20, 30, 40 };
		
		Arrays.sort(sachin);
		
		System.out.println(sachin[0]);
		System.out.println(sachin[1]);
		System.out.println(sachin[2]);
		System.out.println(sachin[3]);
		
		int sachin0 [] = {0, 2};
		sachin0[0]=111;
		System.out.println(sachin0[0]);
		System.out.println(sachin0[0]);

	}
}


