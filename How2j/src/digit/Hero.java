package digit;

  
public class Hero{
    public String name;
    public float hp;
    public int damage;
    
  //回血
    public synchronized void recover(){
      while(hp>=1000) {
    	  try {
    		  this.wait();
    	  }catch(InterruptedException e) {
    		  e.printStackTrace();
    	  }
      }
      hp=hp+1; 
      System.out.printf("%s get 1 blood.after increasing, %s the present blood is%.0f%n ", name,name,hp);
      this.notify();
    	
    }
     
//    //掉血
//    public void hurt(){
//        hp=hp-1;
//    }
    
    //掉血
    public synchronized void hurt() {
        //把if改为while，被唤醒后，会重复查看hp的值，只有hp大于1，才会往下执行
        //if (hp <= 1) {
        while (hp <= 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
  
        hp = hp - 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
        //掉血之后，唤醒等待的线程
        this.notify();
    }
     
    public void attackHero(Hero h) {
        try {
            //为了表示攻击需要时间，每次攻击暂停1000毫秒
            Thread.sleep(1000);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        h.hp-=damage;
        h.hp-=damage;
        System.out.format("%s  is attacking  %s, the blood of %s reduced %.0f%n",name,h.name,h.name,h.hp);
         
        if(h.isDead())
            System.out.println(h.name +" is dead");
    }
 
    public boolean isDead() {
        return 0>=hp?true:false;
    }
 
}