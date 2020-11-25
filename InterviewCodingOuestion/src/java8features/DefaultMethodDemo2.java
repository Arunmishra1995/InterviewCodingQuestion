package java8features;

interface DefaultMethodDemo2 {
	static void m3() {
		System.out.println("static method of the interface ");
	}

	public static void main(String args[]) {
		System.out.println("Hello perfectly valid ");
		DefaultMethodDemo2.m3();
	}
}
