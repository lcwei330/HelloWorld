package charactor;

public class APHero extends Hero implements AP,Mortal {
	// the child class hide the parent class method by using "static"
	  public static void battleWin(){
	        System.out.println("ad hero battle win");
	    }
	  
	@Override
	public void die() {
		System.out.println("die magicHero");
	}
@Override
public void magicAttack() {
	System.out.println("magic attack");
}

public static void main(String[] args) {
    new APHero();
}

}
