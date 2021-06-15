package property;

public class Weapon extends Item{
	    int damage; //
	    String name;
		int price;
		
	    public static void main(String[] args) {
	        Weapon infinityEdge = new Weapon();
	        infinityEdge.damage = 65; //damage attribute new designed in weapon
	         
	        infinityEdge.name = "infinity edge";//name attribute inheritated from class Item，
	        infinityEdge.price = 3600;
	    }
	}

