package java8features;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	int marks;
	String name;

	Student(int marks, String name) {
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionDemoWithStudentObject {

	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student(100, "arun"));
		l.add(new Student(60, "golu"));
		l.add(new Student(50, "anubhav"));
		l.add(new Student(40, "vaibhav"));
		l.add(new Student(25, "pole"));
		Function<Student, String> s1 = s -> {
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
		Predicate<Student> p = s -> s.marks > 60;

		for (Student s2 : l) {

			if (p.test(s2)) {
				System.out.println("name " + s2.name);
				System.out.println("marks " + s2.marks);
				System.out.println("Grade " + s1.apply(s2));
				System.out.println();
			}
			/*
			 * System.out.println("name " + s2.name); System.out.println("marks " +
			 * s2.marks); System.out.println("Grade " + s1.apply(s2)); System.out.println();
			 */

		}

	}

}
