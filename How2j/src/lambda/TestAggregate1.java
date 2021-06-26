package lambda;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
 
import charactor.Hero;
 
public class TestAggregate1 {
 
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        List<Hero> heros2=new ArrayList<>();
        for(char c='a';c<='z';c++)
       	{heros2.add(new Hero("hero"+ c,r.nextInt(10000),r.nextInt(100)));
        	
        	}
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
 
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("查询条件：hp>100 && damage<50");
        System.out.println("通过传统操作方式找出满足条件的数据：");
 
        for (Hero h : heros) {
            if (h.hp > 100 && h.damage < 50)
                System.out.println(h.name);
        }
 
        System.out.println("通过聚合操作方式找出满足条件的数据：");
        
        heros
            .stream()
            .filter(h -> h.hp > 100 && h.damage < 50)
            .forEach(h -> System.out.println(h.name));
       
        
        System.out.println("去除重复的数据，去除标准是看equals");
        heros
        .stream()
        .distinct()
       .forEach(h->System.out.println(h));
        heros
            .stream()
            .distinct()
            .forEach(h->System.out.print(h));
        
        System.out.println("按照血量排序");
        heros
            .stream()
            .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
            .forEach(h->System.out.print(h));
          
        System.out.println("保留3个");
        heros
            .stream()
            .limit(3)
            .forEach(h->System.out.print(h));
          
        System.out.println("忽略前3个");
        heros
            .stream()
            .skip(3)
            .forEach(h->System.out.print(h));
          
        System.out.println("转换为double的Stream");
        heros
            .stream()
        //    .mapToDouble(Hero::getHp)
            .forEach(h->System.out.println(h));
          
        System.out.println("转换任意类型的Stream");
        heros
            .stream()
            .map((h)-> h.name + " - " + h.hp + " - " + h.damage)
            .forEach(h->System.out.println(h));
        
      //pipeline source is array
        Hero hs[] = heros.toArray(new Hero[heros.size()]);
         Arrays.stream(hs)
          // Stream.of(hs)
        .forEach(h->System.out.println(h.name));
    }   
}
