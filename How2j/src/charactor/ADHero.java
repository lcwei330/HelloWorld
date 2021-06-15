package charactor;

import property.Item;
import property.LifePotion;

@SuppressWarnings("unused")
public class ADHero extends Hero implements AD, Mortal {

	int moveSpeed = 400;

	@Override
	public void die() {
		System.out.println("die Physic Hero");
	}

	@Override
	public void physicAttack() {
		System.out.println("Physical attack");
	}

	public void attack() {
		System.out.println(name + "attack once , not sure target");
	}

	// override :the same method ,with different attribute.
	public void attack(Hero h1) {
		System.out.println(name + "attack" + h1.name + "once");
	}

	public void attack(Hero h1, Hero h2) {
		System.out.println(name + "attack both" + h1.name + "and" + h2.name + "at the same time ");
	}
//    // 可变数量的参数
//    这时，可以采用可变数量的参数
//    只需要设计一个方法
//    public void attack(Hero ...heros)
//    即可代表上述所有的方法了
//    在方法里，使用操作数组的方式处理参数heros即可
//    public void attack(Hero... heros) {
//        for (int i = 0; i < heros.length; i++) {
//            System.out.println(name + " 攻击了 " + heros[i].name);
// 
//        }
//    }

	// super
	// explicitly call parent class construction method with attributes
	public ADHero(String name) {
		super(name);
		System.out.println("AD Hero construction method");
	}

	public int getMoveSpeed() {
		return this.moveSpeed;
	}

	public int getMoveSpeed2() {
		return super.moveSpeed;
	}

	public void useItem(Item i) {
		System.out.println("adhero use item");
		super.useItem(i);
		//super can call the attribute and methods in parent class
	}

	/*
	 * 作为子类，无论如何 都会调用父类的构造方法。 默认情况下，会调用父类的无参的构造方法。 但是，当父类没有无参构造方法的时候(
	 * 提供了有参构造方法，并且不显示提供无参构造方法)，子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
	 * 这个时候，必须通过super去调用父类声明的、存在的、有参的构造方法
	 */
	public ADHero() {
        super("");
    }

	public static void main(String[] args) {
		ADHero bh = new ADHero(" ");
		bh.name = "gold hunter";

		Hero h1 = new Hero();
		h1.name = "gailun";
		Hero h2 = new Hero();
		h2.name = "timo";

		bh.attack(h1);
		bh.attack(h1, h2);
		System.out.println(bh.getMoveSpeed());
		System.out.println(bh.getMoveSpeed2());
	}

}