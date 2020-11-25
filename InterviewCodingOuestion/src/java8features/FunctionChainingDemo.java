package java8features;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> 2 * i;
		Function<Integer, Integer> f1 = i -> i * i * i;
		// First f will execute after that f1 function will execute so the result will
		// 64
		System.out.println(f.andThen(f1).apply(2));
		// first will execute f1 then will execute f function so the result will be 16
		System.out.println(f.compose(f1).apply(2));
	}

}
