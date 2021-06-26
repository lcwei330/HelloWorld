package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import charactor.Hero;

@SuppressWarnings("unused")
public class MyStack<T> implements Stack {
	//LinkedList<Hero> heros = new LinkedList<Hero>();
	LinkedList<T> values=new LinkedList<T>();
	public synchronized void push(T t) {
		while(values.size()>=200) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		values.addLast(t);
	}

//	public  MyStack() {
//
//	}
     public synchronized T pull() {
    	 while(values.isEmpty()) {
    		 try {
    		this.wait(); 
    	 }catch(InterruptedException e) {
    		 e.printStackTrace();
    	 }
     }
     this.notifyAll();
     return values.removeLast();
     }
//把LinkedList通过 Collections.synchronizedList转换成了一个线程安全的List
	List<Hero> heros1 = (List<Hero>) Collections.synchronizedList(new LinkedList<Hero>());

//	@Override
//	public Hero pull() {
//		// TODO Auto-generated method stub
//		return heros.removeLast();
//	}

//	@Override
//	public Hero peek() {
//		// TODO Auto-generated method stub
//		return heros.getLast();
//	}
//插入的时候，加上synchronized，同步对象是当前实例
//public synchronized void push(Hero h) {
//    heros.addLast(h);
//}
//
////取出的时候，加上synchronized，同步对象是当前实例
//public synchronized Hero pull() {
//    return heros.removeLast();
//}>
//
////查看没必要加上synchronized，因为不修改数据
//public Hero peek() {
//    return heros.getLast();
//}

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		for (int i = 0; i < 5; i++) {
			Hero h = new Hero("hero name " + i);
			System.out.println("压入 hero:" + h);
			ms.push(h);
		}
		for (int i = 0; i < 5; i++) {
			Hero h = ms.pull();
			System.out.println("弹出 hero" + h);
		}
	}

}
