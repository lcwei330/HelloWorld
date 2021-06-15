package charactor;

public class TestGiantDragon {
	  public static void main(String[] args) {
	        //will throw exceptions when try to initialize it by new ;
//	      GiantDragon g = new GiantDragon();
	         
	        //can only get the object by getInstance.
	         
	        GiantDragon g1 = GiantDragon.getInstance();
	        GiantDragon g2 = GiantDragon.getInstance();
	        GiantDragon g3 = GiantDragon.getInstance();
	         
	        //refers to the same object
	        System.out.println(g1==g2);
	        System.out.println(g1==g3);
	    }
	}

