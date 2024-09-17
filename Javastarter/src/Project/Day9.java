package Project;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student();
		findGrade("Sachin", 90);
		System.out.println(sumnum());

	}

	public static void student() {
		String Name = "Sachin";
		int Grade = 11;
		System.out.println("Name: " + Name + " | Grade: " + Grade);
	}

	public static void findGrade(String StudentName, int score) {
		if (score >= 90 && score <= 80) {

		} else if (score >= 70 && score <= 90) {

		} else if (score >= 50 && score <= 70) {
		} else if (score >= 32 && score <= 50) {
		} else {

		}
		System.out.println("StudentName" + StudentName);
		System.out.println("Score");

	}

	public static int sumnum() {
		int x = 150;
		int y = 150;
		return x + y;
	}
}
