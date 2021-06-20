package collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
public static void main(String[] args) {
	HashSet<String> name=new HashSet<>();
	name.add("gareen");
	System.out.println(name);
	name.add("gareen");
	System.out.println(name);
	HashSet<Integer> num=new HashSet<Integer>();
for (int i = 0; i < 20; i++) {
	num.add(i);
}
/////////////////////////
for (Iterator<Integer> iterator = num.iterator(); iterator.hasNext();) {
	Integer i=(Integer) iterator.next();
	System.out.println(i);
}
///////////////////////
for (int i : num) {
	System.out.println(i);
}
	}
}
