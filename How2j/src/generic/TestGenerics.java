package generic;
import java.util.ArrayList;
import charactor.ADHero;
import charactor.APHero;


public class TestGenerics {
	public static void main(String[] args) {
		ArrayList heros=new ArrayList();
		heros.add(new ADHero());
		heros.add(new APHero());
		APHero apHero=(APHero) heros.get(0);
		ADHero adHero=(ADHero) heros.get(0);
		ADHero adHero2=(ADHero) heros.get(0);
		
		ArrayList<Number> numbers=new ArrayList<>();
		
	}

}
