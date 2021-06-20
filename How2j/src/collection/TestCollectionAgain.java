package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.HashMap;

import charactor.Hero;

@SuppressWarnings("unused")
public class TestCollectionAgain {
	public static void main(String[] args) {

		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("adc", "physic hero");
		dictionary.put("apc", "magic hero");
		dictionary.put("t", "tank");
		List<Hero> heros = new ArrayList<Hero>();
		HashMap<String, Hero> heroMap = new HashMap<>();
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
		heroMap.clear();
		Hero gareen = new Hero("gareen");
		heroMap.put("hero1",gareen);
		 heroMap.put("hero2", gareen);
         
	     

		Queue<Hero> q = new LinkedList<Hero>();

		System.out.print("initialize queue:\t");
		q.offer(new Hero("Hero1"));
		q.offer(new Hero("Hero2"));

		System.out.println(q);
		System.out.print("poll the first element poll():\t");
		Hero hh = q.poll();
		System.out.println(hh);
		System.out.print("the queue after removing the first element:\t");
		System.out.println(q);

		hh = q.peek();
		System.out.print("查看peek()第一个元素:\t");
		System.out.println(hh);
		System.out.print("查看并不会导致第一个元素被取出来:\t");
		System.out.println(q);

		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero name " + i));
		}

		System.out.println("--------for 循环-------");
		for (int i = 0; i < heros.size(); i++) {
			Hero h = heros.get(i);
			System.out.println(h);
		}
		System.out.println("--------增强型for循环-------");
		for (Hero h : heros) {
			System.out.println(h);
		}
		Iterator<Hero> it = heros.iterator();

		while (it.hasNext()) {
			Hero h = it.next();
			System.out.println(h);
		}

		System.out.println("--------使用for的iterator-------");
		for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
			Hero hero = (Hero) iterator.next();
			System.out.println(hero);
		}

		LinkedList<Hero> ll = new LinkedList<Hero>();

		ll.addLast(new Hero("hero1"));
		ll.addLast(new Hero("hero2"));
		ll.addLast(new Hero("hero3"));
		System.out.println(ll);

		ll.addFirst(new Hero("heroX"));
		System.out.println(ll);

		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		System.out.println(ll);
		System.out.println(ll.removeFirst());

		System.out.println(ll.removeLast());

		System.out.println(ll);
		   System.out.println(heroMap);
	}
}
