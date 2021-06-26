package generic;
import java.util.LinkedList;
import charactor.Hero;

public class HeroStack {
LinkedList<Hero> heros=new LinkedList<Hero>();
public void push(Hero h) {
	heros.addLast(h);
}
public Hero pull() {
	return heros.removeLast();
}
public Hero peek() {
	return heros.getLast();
}
public static void main(String[] args) {
	HeroStack heroStack =new HeroStack();
	for (int i = 0; i < 5; i++) {
		Hero h=new Hero("hero name"+i);
		System.out.println("push Hero:" +h);
		heroStack.push(h);
	}
	for (int i = 0; i <5; i++) {
		Hero h=heroStack.pull();
		System.out.println("Pull hero:");
	}
}
}
