package tw.org.iii.java2003;

import java.util.HashSet;

public class Brad72 {

	public static void main(String[] args) {
		HashSet set = new HashSet();	
		set.add(1);
		HashSet set2 = new HashSet();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set.addAll(set2);
		System.out.println(set);
		
		
	}

}
