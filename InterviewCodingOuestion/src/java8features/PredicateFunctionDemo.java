package java8features;

import java.util.function.Predicate;
// Predicate function will be used if in program wherever you want conditional check happly
//go for predicate function , it will return boolean value .and it is a predefined functional 
// interface and contains abstract method called test inside functional interface .

public class PredicateFunctionDemo {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));
		System.out.println(p.test(13));

	}

}
