package tw.org.iii.java2003;

import java.util.HashSet;
import java.util.Iterator;

public class Brad71 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		Object obj2 = new Object();
		//System.out.println((boolean)obj2);
		
		int i1 = 12;
		Integer i2 = new Integer(34);
		set.add(i2);
		set.add(i1); // i1 => auto-boxing => new Integer(i1)
		System.out.println(set);
		System.out.println("===");
		// is-a Collection => for-each
		for (Object obj : set){
			System.out.println((float)obj);	// obj => Float => 卡關
		}
	}
}
class Brad711 {
	void m1(){System.out.println("Brad711:m1()");}
}
class Brad712 extends Brad711 {
	void m1(){System.out.println("Brad712:m1()");}
	void m2(){System.out.println("Brad712:m2()");}
}