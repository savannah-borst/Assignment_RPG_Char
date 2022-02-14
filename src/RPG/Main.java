package RPG;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Warrior thor = new Warrior("Thor");
        Weapon mjolnir = new Weapon("Mjolnir", 1, "Weapon", Weapon.WeaponType.HAMMER,5, 4.5);
        thor.equipWeapon(mjolnir);

        System.out.println(thor.getCharEquipment());
        System.out.println(thor.getCharEquipment());
    }
}
