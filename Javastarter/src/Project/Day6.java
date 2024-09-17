package Project;
import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		String [] name ={"Sachin", "Pysy"};
		
		int grade=11;
		int sub=11;
		System.out.println("Student1: "+name[0]);
		System.out.println("Student2: "+name[0]);
		System.out.println(grade);
		
		System.out.println(Math.max(1,2)); // java math function
		System.out.println(Math.sqrt(1)); 
		System.out.println(Math.abs(-1)); 
		System.out.println(Math.random()); 
		
		// booleans expressions
		System.out.println(grade>sub);
		
		try (// java packages and ApI
		Scanner myinput = new Scanner(System.in)) {
			System.out.print("Enter your address: ");
			String address = myinput.nextLine();
			
			System.out.print("Enter your age: ");
			int age = myinput.nextInt();
			
			System.out.println("Enter your salary: ");
			float salary = myinput.nextFloat();
			
			System.out.println("");
			System.out.println("Your address is: " +address);
			System.out.println("Your age is: "+age);
			System.out.println("Your salary is:" +salary);
		}
		
		
	}

}
