package oopsFeatures;

abstract class Animal {

	public abstract void animalSound();
}

class Lion extends Animal {

	@Override
	public void animalSound() {
		System.out.println("Lion is Roaring ......");

	}

}

class Dog extends Animal {

	@Override
	public void animalSound() {
		System.out.println("Dog is Roaring ......");

	}

	// compile time polymorphism or static polymorphism example
	void add(int a, int b) {
		System.out.println("the sum of two number is :" + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("the sum of three number is :" + (a + b + c));
	}

}

public class PolymorphismDemo {
	public static void main(String args[]) {

		Animal a = new Dog();
		a.animalSound();
		Animal a2 = new Lion();
		a2.animalSound();
		// Static polymorphism or compile time polymorphism example
		Dog d = new Dog();
		d.add(12, 123, 1234);
		d.add(10, 20);
		// Dynamic polymorphism example or runtime polymorphism

	}

}
