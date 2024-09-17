package Project;

public class Day10 {
	// hard value code
	
	public void checkspeed() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		String grade;
		String studentName;
		studentName = "Sachin";
		grade = findGrade(90);
		displayGrades(studentName, grade);
		
		Day10 bmw = new Day10 ();
		bmw.checkspeed();
		
	}

	public static String findGrade(int score) {
		String grade;
		if (score >= 90 && score <= 100) {
			grade = " A";
		} else if (score >= 60 && score <= 80) {
			grade = " B";
		} else if (score >= 32 && score <= 60) {
			grade = " C";
		} else {
			grade = " Fail";
		}
		return grade;
	}

	public static void displayGrades(String studentName, String grade) {
		System.out.println("Grade of " + studentName + " is" + grade);
	}
}