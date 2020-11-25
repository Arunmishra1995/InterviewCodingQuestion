package java8features;

import java.util.function.Function;

//  when we should gor function predefined f.i if there is need , read input and perform some 
// operation and then return result then we should go for function concept 
// function has apply , applyThen, compose method . we will use of these method and how to write 
// function by using lamda expression
public class FunctionPredifinedFIDemo {
// Write a program to return length the string by using function
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		Function<String, String> f1 = s -> s.toUpperCase();
		System.out.println("Squre of the number is : " + f.apply("arunmishra"));
		System.out.println("Squre of the number is : " + f1.apply("arun mishra"));
	}

}
