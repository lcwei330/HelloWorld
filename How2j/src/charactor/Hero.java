package charactor;

import property.Weapon;
import property.Item;
import property.LifePotion;
import property.MagicPotion;
import java.io.Serializable;

@SuppressWarnings("unused")
public class Hero {
    public String name; 
        
    protected float hp; //blood value
        
    float armor; 
        
    int moveSpeed;
    static String copyright; 
  //** static represents class attribute , the others are obj attributes.
    public static int itemCapacity=8; //initialize when claim
    
    
    // non-static inner class 
    //it is only meaningful when there is an object outside the class
    // BattleScore score = garen.new BattleScore();    new outclass().new innerclass();
    class BattleScore {
        int kill;
        int die;
        int assit;
 
        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "legendary");
            else
                System.out.println(name + "not legendary yet");
        }
    }
 // static inner class : new outclass.innerclass();
    static class EnemyCrystal{
        int hp=5000;
         
        public void checkIfVictory(){
            if(hp==0){
                Hero.battleWin();
               
            }
        }
    }
     
    
    public void useItem(Item i){
        i.effect();
    }
    
    public static void battleWin() {
		// TODO Auto-generated method stub
		
	}

	public void kill(Mortal m){
        m.die();
    }
    
    
 //   import property.Weapon;
    public void equip(Weapon w){
        
    }
  //this 
  //print the virtual address in memory
    public void showAddressInMemory(){
        System.out.println("print the address in memory"+this);
    }
    public void setName3(String name){
        //name refers to parameter name
        //this.name represents  attribute name
    	// in the case where attribute name equals parameter name
        this.name = name;
    }
    //call another method in this method ,use "this"
    public Hero(String name,float hp){
        this(name);
        System.out.println("construct method with 2 attributes:");
        this.hp = hp;
    }
    //construct method with 4 attributes
    public Hero(String name, float hp, float armor, int moveSpeed) {
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
    //////////////////////////////////////
    //pass parameters 
    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }
 
     
    // method has the same name as class
    //if the method has no attribute, it can be neglected ,the following has no need to appear
    public Hero() {
        System.out.println("initial an object , have to call construction method");
    }//this method can be neglected
    // the method has attribute ,can not be neglected//overload
    public Hero(String heroname){ 
        name = heroname;
    }
 // the method has two attribute ,can not be neglected//overload
//    public Hero(String heroname,float herohp){ 
//        name = heroname;
//        hp = herohp;
//    }
    
  //////////////////////////////////////////////////
    
    void keng(){
        System.out.println("keng duiyou");
    }
   
    float getArmor(){
        return armor;
    }
       
    //increase moveSpeed
    void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }
      
    void legendary(){
        System.out.println("legendary");
    }
      
    float getHp(){
        return hp;
    }
      
    void recovery(float blood){
        hp = hp+blood;
    }
     
    public void finalize(){
        System.out.println("This hero is recycled");
    }
    
    /////////////////////
    public void revive(Hero h){
        h = new Hero("teemo",383);
    }
   // the Object class is parent class of all classes; 
    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }
    
    public static void main(String[] args) {
    	 Hero h = new Hero();
    	 ADHero ad = new ADHero();
    	 h = ad;  // child class can be used as parent class, but reverse is false.
    	 
        Hero garen = new Hero();
        garen.name= "gailun";
        garen.hp  = 500;
        System.out.println(garen.name + " present blood " +garen.hp);
        System.out.println("revocer100");
        garen.recovery(100);
        System.out.println("present blood" + garen.hp);
        Hero teemo =  new Hero("timo",383);
        
        //dead, attack 400
        teemo.hp = teemo.hp - 400;
        //class attribute
        Hero.copyright = "Riot Games copyright"; 
        System.out.println(teemo.copyright);
        teemo.revive(teemo);
        System.out.println(teemo.hp);
        
        ADHero adh=new ADHero();
        APHero aph=new APHero();
        ADAPHero adph=new ADAPHero();
        h.kill(adh);
        h.kill(aph);
        h.kill(adph);
        //polymorphism 
        //step1 create interface using implements
        //strp2: create child class extends parent class
        //step3: in child class override the method in interfaces
        //step4: create method in parent class and call method in interface
        //step5: in parent class initialize an object and call #(child class) object ,call the method by the object created
         
        System.out.println(h.toString());
         
    }
       
}