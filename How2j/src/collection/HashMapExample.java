package collection;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import charactor.Hero;

public class HashMapExample {

	public static int random() {
		return ((int) (Math.random() * 9000) + 1000);
	}

	private static List<Hero> findByIteration(List<Hero> hs) {
		long start = System.currentTimeMillis();
		List<Hero> result = new ArrayList<>();
		for (Hero h : hs) {
			if (h.name.equals("hero-5555")) {
				result.add(h);
			}
		}
		long end = System.currentTimeMillis();
		System.out.printf("serach using for，find %d heros，take %d milliseconds %n", result.size(), end - start);
		return result;
	}

	private static List<Hero> findByMap(HashMap<String, List<Hero>> m) {
		long start = System.currentTimeMillis();
		List<Hero> result = m.get("hero-5555");
		long end = System.currentTimeMillis();
		System.out.printf("serach using map，find %d heros，take %d milliseconds %n", result.size(), end - start);
		return result;
	}

	public static void main(String[] args) {

		List<Hero> hs = new ArrayList<>();

		for (int i = 0; i < 3000000; i++) {
			Hero h = new Hero("hero-" + random());
			hs.add(h);
		}

		System.out.println("initialization ends");
		System.out.println("start search");
		findByIteration(hs);
//////////////////////////////////////////////////////////////////////////
		HashMap<String, List<Hero>> heroMap = new HashMap<>();
		for (Hero h : hs) {
			List<Hero> list = heroMap.get(h.name);
			if (list == null) {
				list = new ArrayList();
				heroMap.put(h.name, list);
			}
			list.add(h);
		}
		findByMap(heroMap);
	}

}
