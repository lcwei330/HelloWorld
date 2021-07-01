package multiplethread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread9 {
	public static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}

	public static void log(String msg) {
		System.out.printf("%s %s %s %n", now(), Thread.currentThread().getName(), msg);
	}

	public static void main(String[] args) {
		Lock lock =new  ReentrantLock();
		Condition condition =lock.newCondition();
		Thread t1=new Thread() {
			public void run() {
				try {
					log("thread start");
					log(" try to get object:lock");
					lock.lock();
					log("get object: lock");
					log("5 seconds operation:");
					Thread.sleep(5000);
					/*
					 * log("临时释放对象 lock， 并等待"); condition.await(); log("重新占有对象 lock，并进行5秒的业务操作");
					 * Thread.sleep(5000);
					 */
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}finally {
					log("release object:lock");
					lock.unlock();
				}
				log("thread end");
				
	}
};
t1.setName("t1");
t1.start();
try {
	Thread.sleep(2000);
}catch(InterruptedException e1) {
	e1.printStackTrace();
}
	}
}
