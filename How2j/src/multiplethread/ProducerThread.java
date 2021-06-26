package multiplethread;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProducerThread extends Thread {
	private MyStack<Character> stack;

	public ProducerThread(MyStack<Character> stack, String name) {
		super(name);
		this.stack = stack;
	}

	public void run() {
		while (true) {
			char c = randomChar();
			System.out.println(this.getName() + " push: " + c);
			stack.push(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public char randomChar() {
		return (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
	}
}
