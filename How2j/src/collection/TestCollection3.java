package collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Set;

public class TestCollection3 {
public static void main(String[] args) {
	HashMap<String,String> ht=new HashMap<>();
	ht.put("adc","physical hero");
	ht.put("apc","magic hero");
	ht.put("t","tank");
	System.out.println(ht);
	HashMap<String,String> temp=new HashMap<>();
	  Set<String> keys = ht.keySet();
	for(String key:keys) {
		String value=ht.get(key);
		temp.put(value, key);
	}
	ht.clear();
	ht.putAll(temp);
	System.out.println(ht);
	
}
}
