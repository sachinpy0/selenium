package Project;

public class Day11 {
	public static final String last = null;
	int x = 10;
	int y = 30;
	float total = x + y;
	float average = total / 2;
	public String first;
	public String name;

	public static void main(String[] args) {
		Day11 newob = new Day11();
		Day11 sachin = new Day11();
		sachin.total=500;
		System.out.println("Average is: " + newob.x);
		System.out.println("Total : " + sachin.total);
		findGrade();

	}

	public static void findGrade() {
		int StudentID = 001;
		int score = 90;
		String grade;

		if (score >= 90 && score <= 100) {
			grade = "A";

		} else if (score >= 70 && score < 90) {
			grade = "B";
		} else if (score >= 32 && score < 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("StudentID: " + StudentID + " | Grade" + grade);
	}

}
