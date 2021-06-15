package charactor1;
import charactor.Hero;
 
public class Support extends Hero implements Healer{

	@Override
    public void heal() {
        System.out.println(name+" add some blood");
    }
 
 
    public void heal(Hero hero) {
        System.out.println("add " + hero + " blood");
    }
 
    public void heal(Hero hero, int hp) {
        System.out.println("add " + hero + " some " + hp + "blood");
    }
}