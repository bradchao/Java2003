package tw.org.iii.java2003;

import java.util.HashMap;
import java.util.Set;

public class Brad74 {
	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		Object o1 = map.put("name", "Brad");
		map.put("weight", 80.5);
		map.put("gender", true);
		Object o2 = map.put("name", "Brad1");
		
		System.out.println(o2);
		
//		Set<String> keys = map.keySet();
//		for (String key : keys){
//			System.out.println(key + " => " + map.get(key));
//		}
		
		
	}
}
