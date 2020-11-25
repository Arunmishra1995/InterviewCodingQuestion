package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		 * if (o1 < o2) { return -1; }
		 * 
		 * else if (o1 > o2) { return +1; }
		 * 
		 * else { return 0; }
		 
		return (o1<02)?-1:(o1>o2)?1:0;

	}
}
*/
public class LamdaExWithColection {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(15);
		l.add(6);
		l.add(4);
		System.out.println(l);
		Comparator<Integer> c= (o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(l,c);
		System.out.println("Sorting order :" + l);

	}

}
