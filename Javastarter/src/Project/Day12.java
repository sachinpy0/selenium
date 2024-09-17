package Project;

public class Day12 {
	// static method block
	static void myStaticMethod() {
		System.out.println("From static method");
		int num1 = 10;
		System.out.println(num1);
	}

	String first = "Sachin";
	String name = "Pandey";
	int age = 16;
	
 	public void myPublicMethod() {
		int num2 = 20;
		System.out.println("From public method block");
		System.out.println(num2);
	}

	public static void main(String[] args) {
		myStaticMethod();
		Day12 accessclass = new Day12();
		System.out.println("Name:" + accessclass.first + "" + accessclass.name);
		System.out.println("Age :" + accessclass);
		
		Day12 newobj = new Day12();
		newobj.myPublicMethod();

		Day12 goods = new Day12();
		goods.myPublicMethod();
		goods.publicMethod("Service", 22);

	}

	private void publicMethod(String string, int publicgood) {
		System.out.println("Publicgood is: " + publicgood);

	}
}
