package collection;
 
import charactor.Hero;
import java.util.ArrayList;//
 
public class TestCollection {
	  @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
		  ArrayList heros = new ArrayList();
//	        heros.add( new Hero("gailun"));
//	        System.out.println(heros.size());
//	        heros.add( new Hero("timo"));
		  for (int i = 0; i < 5; i++) {
	            heros.add(new Hero("hero " + i));
	        }
	        System.out.println(heros.size());
	        Hero specialHero = new Hero("special hero");
	        heros.add(3, specialHero);
	 
	        System.out.println(heros.toString());
	        System.out.println(heros);
	        // 判断一个对象是否在容器中
	        // 判断标准： 是否是同一个对象，而不是name是否相同
	        System.out.print("althrough the new hero is also called hero 1，but contains return:");
	        System.out.println(heros.contains(new Hero("hero 1")));
	        System.out.print("judge specialHero,contains returns:");
	        System.out.println(heros.contains(specialHero));
	        //get the specified location 
	        System.out.println(heros.get(5));
	        //exceed the range , throw exception
	      //  System.out.println(heros.get(6));
	        System.out.println("specialHero location: "+heros.indexOf(specialHero));
	        System.out.println("new hero1 \"hero 1\" location: "+heros.indexOf(new Hero("hero 1")));
	        heros.remove(2);
	        System.out.println("delete the obj with subscript 2");
	        
	        System.out.println("delete special hero");
	        heros.remove(specialHero);
	        System.out.println(heros);
	    // set is used to replace the obj 
	        System.out.println("replace the obj with subscript 5 with \" hero 5\"");
	        heros.set(3, new Hero("hero 5"));
	        System.out.println(heros.size());
	        
	        //////////////////////////////
	        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
	        System.out.println("array:" +hs);
	        /////////////////////////////////////////
	        ArrayList anotherHeros = new ArrayList();
	        anotherHeros.add(new Hero("hero a"));
	        //anotherHeros.add(new Hero("hero b"));
	        
	        System.out.println("anotherHeros heros:\t" + anotherHeros);
	        heros.addAll(anotherHeros);
	        
	        ////////////////////////////
	        heros.add(specialHero);
	        String name = "hero 1";
	        for (int i = 0; i < heros.size(); i++) {
	            Hero h = (Hero) heros.get(i);
	            if(name.equals(h.name) ){
	                System.out.printf("find obj wiht name :%s",name);
	                break;
	            }
	        }
	        //restrict of array
//        Hero heros[] = new Hero[10];
        //claim array with 10 
        //the unused space is wasted
        //can not hold all value when exceed 10
//        heros[0] = new Hero("gailun");
                //throw exception due to lack of space
//        heros[20] = new Hero("teemo");
         
    }
//    public Hero() {
//    	 
//    }
//    // 增加一个初始化name的构造方法
//    public Hero(String name) {
//        this.name = name;
//    }
//    // 重写toString方法
//    public String toString() {
//        return name;
    }
     
