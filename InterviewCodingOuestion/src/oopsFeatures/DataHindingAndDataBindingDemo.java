package oopsFeatures;

import java.util.Scanner;

//Whaat is data hiding and data binding and 

//how we can achive in java please explain by example 

//Data Hiding : Out side person can not access our internal data darectly , after validation
// and authentication outside person can accesse our internal data . for example Gmail login 
//how we can achieve : By declaring data member as private we can achive data hiding .
class Account {

	private int accountBalance;

	public void getBalance(int password) {
		if (password == 200) {
			System.out.println("Account balance is : " + this.accountBalance);
		} else {
			System.out.println("Invalid Password !Please Try again ");
		}

	}

	public void setbalance(int balance, int password) {
		if (password == 200) {
			this.accountBalance = balance;
			System.out.println("The amount of " + balance + " has been credited into account ..");
		} else {
			System.out.println("Invalid Password !Please Try again ");
		}

	}

}

public class DataHindingAndDataBindingDemo {
	public static void main(String args[]) {
		int password = 200;
		System.out.println("Please Enter the amount to deposite in account !");
		Scanner scan = new Scanner(System.in);
		int amunt = scan.nextInt();

		Account account = new Account();
		account.setbalance(amunt, password);
		account.getBalance(password);
	}

}
