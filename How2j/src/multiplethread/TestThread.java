package multiplethread;
import digit.Hero;

public class TestThread {
	public static void main(String[] args) {
		Hero gareen=new Hero();
		gareen.name="Gailun";
		gareen.hp=616;
		gareen.damage=50;
		
		Hero teemo=new Hero();
		teemo.name="Timo";
		teemo.hp=300;
		teemo.damage=30;
		
		Hero bh = new Hero();
        bh.name = "lieren";
        bh.hp = 500;
        bh.damage = 65;
         
        Hero leesin = new Hero();
        leesin.name = "monk";
        leesin.hp = 455;
        leesin.damage = 80;
        
		KillThread kt1=new KillThread(gareen, teemo);
		kt1.start();
		KillThread kt2=new KillThread(bh, leesin);
		kt2.start();
		
		Battle battle1=new Battle(gareen,teemo);
		  new Thread(battle1).start();
		  Battle battle2=new Battle(bh,leesin);
		  new Thread(battle2).start();
		
		Thread t1=new Thread() {
			public void run() {
				while(!teemo.isDead()) {
					gareen.attackHero(teemo);
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				while(!bh.isDead()) {
					 //临时暂停，使得t1可以占用CPU资源
                    Thread.yield();
					bh.attackHero(leesin
							
							
							);
				}
			}
		};
		    t1.setPriority(5);
	        t2.setPriority(5);
			t1.start();
			t2.start();
		
	}
    
}
