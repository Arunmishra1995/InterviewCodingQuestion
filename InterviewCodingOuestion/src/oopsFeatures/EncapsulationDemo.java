package oopsFeatures;

// Below is the example of the encapsulation state and behaviour
//biding in single unit called encapsulation . Example of the Encapsulation is class 
class Home {
	// state of the home
	String address;
	int houseNumber;

	public Home(String address, int houseNumber) {
		System.out.println("Constructor called ....");
		this.houseNumber = houseNumber;
		this.address = address;
	}

	public void stayAtHome() {
		System.out.println("Please stay safe at home !\n Adress is  :" + this.address + "\n House Number is  : "
				+ this.houseNumber);
	}

}

public class EncapsulationDemo {
	public static void main(String args[]) {
		Home home = new Home("patna", 304);
		home.stayAtHome();

	}

}
