package java8features;

import java.util.function.Predicate;

public class PredicateToCheckStringLegthDemo {

	public static void main(String[] args) {
		String str[]= {"Arunmishra","Bhoopendra","golu","vinay"};
		Predicate<String>s2=s->s.length()>5;
		
		for(String s:str) {
			if(s2.test(s)) {
				System.out.println("string length grater then 5  "+s);
			}
			
		}
		

	}

}
