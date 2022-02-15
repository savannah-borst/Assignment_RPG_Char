package RPG;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Warrior thor = new Warrior("Thor");
        Weapon mjolnir = new Weapon("Mjolnir", 1, Slot.WEAPON, Weapon.Type.WAND,5, 4.5);
        thor.equipWeapon(mjolnir);

        //System.out.println(thor.getCharEquipment());
        //System.out.println(thor.getCharEquipment());

        //TO DO
        //Weapon check! + making Armor

    }
}
