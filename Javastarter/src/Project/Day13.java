package Project;

abstract class Only{
	public String name="Sachin";
	public int age = 16;
	public abstract void study();
}

class Student extends Only{
	public void study() {
		System.out.println("Studing..");
	}
}


class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}

	void sleep() {
		System.out.println("Animal sleeps");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}

	@Override
	void eat() {
		System.out.println("Dog eats biscuits");
	}
}

class Domestic{
	void how() {
		System.out.println("Resilient and Reinforce");
	}

	public void sound() {
		// TODO Auto-generated method stub
		
	}
}

class Bull extends Domestic{
	public void sound() {
		System.out.println("Dog barks");
	}
}

// Main class
public class Day13 {
	public static void main(String[] args) {
		Dog sal = new Dog();
		sal.eat();
		sal.sleep();
		sal.bark();
		
		Domestic Bull = new Domestic();
		Bull.sound();

		new Student();
		System.out.println("name");
		
	}
}
