package collection;
import java.util.LinkedList;
import charactor.Hero;

@SuppressWarnings("unused")
public class MyStack implements Stack{
LinkedList<Hero> heros=new LinkedList<Hero>();

public MyStack() {
	
}

@Override
public void push(Hero h) {
	heros.addLast(h);	
}

@Override
public Hero pull() {
	// TODO Auto-generated method stub
	return heros.removeLast();
}

@Override
public Hero peek() {
	// TODO Auto-generated method stub
	return heros.getLast();
}
public static void main(String[] args) {
	MyStack ms = new MyStack();
	for (int i = 0; i < 5; i++) {
        Hero h = new Hero("hero name " + i);
        System.out.println("压入 hero:" + h);
        ms.push(h);
    }
	for (int i = 0; i < 5; i++) {
        Hero h =ms.pull();
        System.out.println("弹出 hero" + h);
    }
}

}
