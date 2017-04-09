package tw.org.iii.java2003;

import java.util.HashMap;
import java.util.Set;

public class Brad74 {
	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", "Brad");
		map.put("weight", 80.5);
		map.put("gender", true);
		
		Set<String> keys = map.keySet();
		for (String key : keys){
			System.out.println(key + " => " + map.get(key));
		}
		
		
	}
}
