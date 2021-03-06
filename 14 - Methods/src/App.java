class Person {

	// Instance variables (date or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		for (int i = 0; i < 2; i++) {
			System.out.println("My name is " + name + " and I am " + age);
		}
	}

	void sayHello() {
		System.out.println("Hello there");
	}
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Kamil Karczewski";
		person1.age = 23;
		person1.speak();
		person1.sayHello();
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 43;
		person2.speak();
		person2.sayHello();
		// System.out.println(person1.name);

	}
}
