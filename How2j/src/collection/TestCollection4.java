package collection;
import java.util.LinkedHashSet;
import java.util.Set;
public class TestCollection4 {
public static void main(String[] args) {
	Set<Integer> result=new LinkedHashSet<>();
	String str=String.valueOf(Math.PI);
	str = str.replace(".", "");
	char[] a =str.toCharArray();
	for(char c:a) {
		int num=Integer.parseInt(String.valueOf(c));
		result.add(num);
	}
	System.out.println(result);
}
}
