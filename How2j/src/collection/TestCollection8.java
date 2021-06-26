package collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class TestCollection8 {
	  public static void main(String[] args) {
	        insertFirst(ArrayList::new, "ArrayList");
	        insertFirst(LinkedList::new, "LinkedList");
	    }
	   
	    private static void insertFirst(Supplier<List> s, String type) {
	        int total = 1000 * 100;
	        final int number = 5;
	        long start = System.currentTimeMillis();
	        List list = s.get();
	        for (int i = 0; i < total; i++) {
	            list.add(0, number);
	        }
	        long end = System.currentTimeMillis();
	        System.out.printf("insert %d data in the front of %s ， cost  %d  ms in total  %n",  total, type, end - start);
	    }
	   
}
