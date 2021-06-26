package generic;
import java.util.ArrayList;
import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;
//Wildcard 通配符 
//ArrayList heroList<? extends Hero> 表示这是一个Hero泛型或者其子类泛型
//ArrayList heroList<? super Hero> 表示这是一个Hero泛型或者其父类泛型
//如果希望只取出，不插入，就使用? extends Hero
//如果希望只插入，不取出，就使用? super Hero
//如果希望，又能插入，又能取出，就不要用通配符(?)
public class TestGeneric1 {
public static void main(String[] args) {
//(? extends className)/////////////////////////////////////////////////////////////////////	
	ArrayList<APHero> apHeroList=new ArrayList<>();
	apHeroList.add(new APHero());
	ArrayList<? extends Hero> heroList=apHeroList;

    //? extends Hero refers to this is a child class / generic type of class Hero(which means that the heroList object must be a type of Hero)
	Hero h=heroList.get(0);
	//heroList.add(new ADHero()); this will throw compile error ,since the generic type of heroList might be APHero;
//(? super className)/////////////////////////////////////////////////////////////////////	
	ArrayList<? super Hero> heroList1 = new ArrayList<Object>();
	 heroList1.add(new Hero());
     // the child class can also be inserted.
     heroList1.add(new APHero());
     heroList1.add(new ADHero());
     // Hero h= heroList.get(0);  this will lead to compile error.
     // since the generic type might be Object, and the process of forcing Object into Hero will cause exception;
     ArrayList<?> generalList = apHeroList;
     Object o=generalList.get(0);
//     generalList.add(new Item());  compile error ? represents generic type,it may not be Item();
     
   
}
}
