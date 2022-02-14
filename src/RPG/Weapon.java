package RPG;

public class Weapon extends Item {
    WeaponType type;

    //took some inspiration from: https://stackoverflow.com/questions/48627744/how-do-you-implement-an-enum-in-an-object-class-java/48627811
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
    public Weapon(String name, int requiredLevel, String slot, WeaponType type) {
        super(name, requiredLevel, slot);
        this.type = type;
    }
}
