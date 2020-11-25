package java8features;
// lets take an example to find emplyee salary who are getting more than 3000 for that we will write predicate fuction

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String empName;
	double salary;

	public Employee(String empName, double salary) {
		this.salary = salary;
		this.empName = empName;
	}
}

public class PredicateFunExample {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Arun", 223000));
		l.add(new Employee("Rajul", 6000));
		l.add(new Employee("venkatesh", 3000));
		l.add(new Employee("anant", 12000));
		// Now we are going to write predicate function
		Predicate<Employee> p1 = e -> e.salary > 3000 && e.empName.equals("Arun");
		for (Employee e1 : l) { 
			if (p1.test(e1)) {
				System.out.println("Emp Name :" + e1.empName + "\n Emp salary :" + e1.salary);
			}

		}

	}

}
