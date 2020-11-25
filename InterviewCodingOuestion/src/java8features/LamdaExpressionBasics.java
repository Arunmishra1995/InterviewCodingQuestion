package java8features;

//simple lamda expression , syntax 
@FunctionalInterface
interface interf2 {
	public int squreIt(int a);
}

public class LamdaExpressionBasics {
//wherever common requirement is there happly we can go for lamda expression but it will always with f.i
	public static void main(String[] args) {
		interf2 i = n -> n * n; 
		System.out.println("squre of 4  is: " + i.squreIt(4));
		System.out.println("squre of 4  is: " + i.squreIt(40));

	}

}
