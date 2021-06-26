package multiplethread;

import java.util.LinkedList;

public class ThreadPool {
	int threadPoolSize;
	LinkedList<Runnable> tasks = new LinkedList<Runnable>();

	public ThreadPool() {
		threadPoolSize = 10;
		synchronized (tasks) {
			for (int i = 0; i < threadPoolSize; i++) {
				new TaskConsumeThread("task consume Thread" + i).start();
			}
		}
	}

	public void add(Runnable r) {
		synchronized (tasks) {
			tasks.add(r);
			tasks.notifyAll();
		}
	}

	class TaskConsumeThread extends Thread {
		public TaskConsumeThread(String name) {
			super(name);
		}

		Runnable task;

		public void run() {
			System.out.println("start:" + this.getName());
			while (true) {
				synchronized (tasks) {
					while (tasks.isEmpty()) {
						try {
							tasks.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					task=tasks.removeLast();
					tasks.notifyAll();
				}
				System.out.println(this.getName()+"get tasks,and execute");
				task.run();
			}
		}
	}

}
