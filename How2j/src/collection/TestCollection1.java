package collection;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class TestCollection1 {
	public static void main(String[] args) {

		List<Integer> l;
		l = new ArrayList<>();
//         insertFirst(l, "ArrayList");
       insertLast(l, "ArrayList");
   //  		modify(l, "ArrayList");

	//	l = new LinkedList<>();
	//	modify(l, "LinkedList");
		insertLast(l, "LinkedList");
	//  insertFirst(l, "LinkedList");
	}

	private static void insertFirst(List<Integer> l, String type) {
		int total = 100 * 1000;
		final int number = 5;

		long start = System.currentTimeMillis();
		for (int j = 0; j < total; j++) {
			l.add(0, number);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	private static void insertLast(List<Integer> l, String type) {
		int total = 100 * 1000;
		final int number = 5;

		long start = System.currentTimeMillis();
		for (int j = 0; j < total; j++) {
			l.add(number);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void modify(List<Integer> l, String type) {
		int total = 100 * 1000;
		final int number = 5;
		int index = total / 2;
		for (int i = 0; i < total; i++) {
			l.add(number);
		}
		long start = System.currentTimeMillis();
		for (int j = 0; j < total; j++) {
			int n = l.get(index);
			n++;
			l.set(index, n);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
