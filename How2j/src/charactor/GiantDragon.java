package charactor;

public class GiantDragon {

	// private , can not initialize it out side the class
	private GiantDragon() {

	}

	// prepare a class attribute ,refer to an object. only one value since it is class attribute.
//Singleton Pattern 1: hungry loading initialized the object; thread safe
	private static GiantDragon instance = new GiantDragon();
	
	
	//Singleton Pattern 2: lazy loading w/o initialize an object, refers to null;thread unsafe
	 //prepare a class attribute ,refer to an object. refers to null when initialized
  //  private static GiantDragon instance; 

	// public static method , offer the object initialized  in  the previous line.
	public static GiantDragon getInstance() {
		//call it for the first time and found no objects. then Initialize an object.
        if(null==instance){
            instance = new GiantDragon();
        }
		return instance;
	}

}
