package java8features;

//class MyRunnable implements Runnable {
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("child thread-1");
//		}
//
//	}
//
//}

public class LamdaExWithMultithreading {

	public static void main(String[] args) {
// this is the way of calling run method implementation by using lambda expression so basically
		// above implementation class is not required now .concise the code 
		Runnable r =()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread-1");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread-1");
		}

	}

}
