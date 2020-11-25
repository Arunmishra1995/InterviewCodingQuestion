package java8features;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentConsumer {
	int marks;
	String name;

	StudentConsumer(int marks, String name) {
		this.name = name;
		this.marks = marks;
	}
}

public class ConsumerFunDemo {

	public static void main(String[] args) {
		ArrayList<StudentConsumer> l = new ArrayList<StudentConsumer>();
		l.add(new StudentConsumer(100, "arun"));
		l.add(new StudentConsumer(60, "golu"));
		l.add(new StudentConsumer(50, "anubhav"));
		l.add(new StudentConsumer(40, "vaibhav"));
		l.add(new StudentConsumer(25, "pole"));
		// Function accept two parameter one input type, return type
		Function<StudentConsumer, String> s1 = s -> {
			if (s.marks >= 80) {
				return "Grade A";
			} else if (s.marks >= 60)
				return "Grade B";
			else if (s.marks >= 50)
				return "Grade C";
			else if (s.marks >= 35)
				return "Grade D";
			else
				return "Failed";

		};
		// predicate will take one argument and return type will be boolean always
		Predicate<StudentConsumer> p = s -> s.marks > 60;
		// Consumer will use for printing purpose it will not return anything
		Consumer<StudentConsumer> consumer = s2 -> {
			System.out.println("name " + s2.name);
			System.out.println("marks " + s2.marks);
			System.out.println("Grade " + s1.apply(s2));
			System.out.println();
		};

		for (StudentConsumer s3 : l) {

			if (p.test(s3)) {
				consumer.accept(s3);
			}
			/*
			 * System.out.println("name " + s2.name); System.out.println("marks " +
			 * s2.marks); System.out.println("Grade " + s1.apply(s2)); System.out.println();
			 */

		}

	}

}
