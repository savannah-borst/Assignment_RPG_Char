package RPG;

public class Weapon extends Item {

    enum WeaponType {
        AXES,
        BOWS,
        DAGGERS,
        HAMMERS,
        STAFFS,
        SWORDS,
        WANDS
    }

    //constructor
    public Weapon(String name, int requiredLevel, String slot) {
        super(name, requiredLevel, slot);
    }
}
