package java8features;

interface MyInterface{
	
	public void m21();
	public void m22();
	default void m33() {
		System.out.println("dummy implementation m33");
	}
}


//The purpose of default method  is , if you want to add method to the interface then we should 
// we should go for default method , please take a note while overriding default method compulsory 
// we shoud use public instead of default . because default has different meaning inside main method so
// we can not use default inside main method 
public class DefaultAndStaticMethod  implements MyInterface{
	
	
// obeserb here i am going to override m33default method 
	@Override
	public void m33() {
		System.out.println("m33 overridden method ");
	}
	
	
	@Override
	public void m21() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m22() {
		// TODO Auto-generated method stub
		System.out.println("m2method called");
		
	}

	public static void main(String[] args) {
	
		DefaultAndStaticMethod oc=new DefaultAndStaticMethod();
		oc.m21();
		oc.m22();
		oc.m33();
		
		
		
	}

	
	

}
