package Project;

//import java.util.ArrayList;
//import java.util.Collections;

public class Day15 {

	// error and exception 
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied Pysy - You must be 18 year");
		
		}else {
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args) {
//		ArrayList<String> car = new ArrayList<String>();
//		car.add("Hero");
//		car.add("Honda");
//		Collections.sort(car);
//		Collections.sort(car,Collections.reverseOrder());
//		System.out.println(car);
//		for (String i : car) {
//			System.out.println(i);

		// try catch error
//		try {
//			int []myNumber = { 10, 20, 30 };
//			System.out.println(myNumber[2]);
//		} catch (Exception e) {
//			System.out.println("This array is out of bound. Please fix again");
//		} finally {
//			System.out.println("Try catch is executed");
//		}

		checkAge(16); 

	}

}
