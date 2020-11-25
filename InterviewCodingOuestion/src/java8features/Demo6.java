package java8features;

public class Demo6 {

	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			public void run() {
				System.out.println("print5");
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("print1");
			}
		};
		thread2.start();
		thread1.start();

	}
}
