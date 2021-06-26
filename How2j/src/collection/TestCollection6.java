package collection;
  
import java.util.HashMap;
import charactor.Hero;
  
public class TestCollection6 {
    public static void main(String[] args) {
          
        HashMap<String,Hero> heroMap = new HashMap<String,Hero>();
        for (int j = 0; j < 2000000; j++) {
            Hero h = new Hero("Hero " + j);
            heroMap.put(h.name, h);
        }
        System.out.println("data prepare done");
  
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
              
            Hero target = heroMap.get("Hero 1000000");
            System.out.println("find hero!" + target.name);
              
            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("cost " + elapsed + " minisecond");
        }
  
    }
}