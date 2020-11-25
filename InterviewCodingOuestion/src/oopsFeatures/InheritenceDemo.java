package oopsFeatures;

class A {
	public void greeting() {
		System.out.println("Welcome  A class !Arun");
	}
}

class B extends A {
	public void greeting() {
		System.out.println("Welcome from B class ");
	}
}

public class InheritenceDemo {
	public static void main(String args[]) {
     A a=new B();
     a.greeting(); // B class greeting method will be called 
     A a1=new A();
     a1.greeting();// greeting method will be called from A class 
     B b=new B();
     b.greeting();// B class greeting method will be call 
    // B b=new A(); invalid 
	}
}
