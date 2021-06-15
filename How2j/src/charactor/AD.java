package charactor;

public interface AD {
	 void physicAttack();

	default public void attack() {
		System.out.println("physical attack");
	}
}
