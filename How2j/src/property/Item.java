package property;
import charactor.LOL;
public class Item {
	String name;
	public int price;
	
	public void buy(){
        System.out.println("buy ");
    }
    public void effect() {
        System.out.println("has effect after using");
    }
    public  Item() {
    }
    
    public  Item(String name) {
        this.name=name;
    }
    
    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
        //can direct call an object from child class here
        LifePotion lp =new LifePotion();
       
        lp.effect();
        
        Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1 is class Item, run effect print:");
        i1.effect();
        System.out.print("i2 is also class Item, run effect print:");
        i2.effect();
        
    }
}
