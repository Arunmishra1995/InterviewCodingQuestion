package java8features;
// the main purpose of the static method inside interface is, If everything static then no way
//releted to class its better to go for interface concept . because class is costly
// compare to interface .
interface Interf{
	public static void m1() {
		System.out.println("static method inside interface practice ");
	}
}

/* below also valid 
 * public class DefaultMethodDemo implements Interf {
 * 
 * public static void main(String[] args) { // how we can call interface static
 * method Interf.m1();
 * 
 * }
 * 
 * }
 */
//Not Required to write implements Interface 
public class DefaultMethodDemo  {

	public static void main(String[] args) {
		// how we can call interface static method  , there is only one way to call interface static 
		// method . Interfacename.methodname
		Interf.m1();

	}

}
