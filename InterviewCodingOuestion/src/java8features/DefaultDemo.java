package java8features;

@FunctionalInterface
interface Left {
	public void m2();

	default void m1() {
		System.out.println("Left interface m1");
	}
}

@FunctionalInterface
interface Right {
	public void m3();

	default void m1() {
		System.out.println("Right interface m1");
	}
}

public class DefaultDemo implements Right, Left {

	public static void main(String[] args) {
		DefaultDemo d = new DefaultDemo();
		Left l = () -> System.out.println("fiff");
		l.m2();
		d.m1();

	}

	@Override
	public void m1() {
		Left.super.m1();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}

}
