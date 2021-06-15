package charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal {
	@Override
	public void die() {
		System.out.println("die mixed Hero");
	}
@Override
public void magicAttack() {
	System.out.println("magic attack");
}
@Override
public void physicAttack() {
	System.out.println("physic attack");
}

@Override
public void attack() {
    //
    System.out.println("这个ADAPHero自己的attack方法");
}
}
