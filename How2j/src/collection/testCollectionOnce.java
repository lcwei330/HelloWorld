package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import charactor.Hero;

public class testCollectionOnce {
	public static int random() {
		return ((int) (Math.random() * 9000) + 1000);
	}
	  private static String randomString(int length) {
	        String pool = "";
	        for (short i = '0'; i <= '9'; i++) {
	            pool += (char) i;
	        }
	        for (short i = 'a'; i <= 'z'; i++) {
	            pool += (char) i;
	        }
	        for (short i = 'A'; i <= 'Z'; i++) {
	            pool += (char) i;
	        }
	        char cs[] = new char[length];
	        for (int i = 0; i < cs.length; i++) {
	            int index = (int) (Math.random() * pool.length());
	            cs[i] = pool.charAt(index);
	        }
	        String result = new String(cs);
	        return result;
	    }
	public static void main(String[] args) {
		String[] ss=new String[100];
		for (int i = 0; i < ss.length; i++) {
			ss[i]=randomString(2);
		}
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i] + " ");
			if (19 == i % 20)
				System.out.println();
		}
	HashSet<String> result=new HashSet<>();
	for(String s:ss) {
		int repeat=0;
		for(String s2:ss) {
			if(s.equalsIgnoreCase(s2)) {
				repeat++;
				if(2==repeat) {
					result.add(s);
					break;
				}
			}
		}
	}
	System.out.println(result);
	}
	
}
