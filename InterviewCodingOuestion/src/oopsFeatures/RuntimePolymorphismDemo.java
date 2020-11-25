package oopsFeatures;

class Animal2 {
// We can achieve runtime polymorphism by using  method overriding 
	public void animalRuning() {
		System.out.println("Animal is runnig ...");
	}
}

class Fox extends Animal2 {
	// we are overrinding base class method in chile class
	public void animalRuning() {
		System.out.println("Fox is runnig ...");
	}
}

public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		// Animal can hold fox class referece because Animal is base class
		Animal2 a = new Fox();
		a.animalRuning();// FOx is running
		Fox f = new Fox();
		f.animalRuning();// Fox is Running

	}

}
