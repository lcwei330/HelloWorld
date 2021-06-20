package collection;
   
import java.util.HashSet;
    
public class TestCollection1 {
    public static void main(String[] args) {
    HashSet<Integer> number=new HashSet<>();
    while(number.size()<=50) {
    	int a=(int) Math.random()*10000;
    	number.add(a);
    }
    System.out.println(number);

       }
}
