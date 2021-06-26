package multiplethread;

public class ConsumerThread extends Thread {
	private MyStack<Character> stack;
	public ConsumerThread(MyStack<Character> stack,String name) {
		super(name);
		this.stack=stack;
	}
 public void run() {
	 while(true) {
		 char c=stack.pull();
		 System.out.println(this.getName()+" pull: "+ c);
		 try {
			 Thread.sleep(100);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
 }
 public char randomChar() {
	 return (char) (Math.random()*('Z'-'A'+1)+'A');
 }
}
