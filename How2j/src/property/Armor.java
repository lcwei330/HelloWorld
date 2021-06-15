package property;

public class Armor extends Item{
	 
    int ac; //护甲等级
     
    public static void main(String[] args) {
        Armor cloth = new Armor();
        cloth.name="cloth Armor";
        cloth.price=300;
        cloth.ac = 15;
         
        Armor chainMail = new Armor();
        chainMail.name="chain Armor";
        chainMail.price=500;
        chainMail.ac = 40;
    }
     
}