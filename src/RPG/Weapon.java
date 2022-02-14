package RPG;

public class Weapon extends Item {
    WeaponType type;
    private final int damage;
    private final double attackPerSec;
    private final double DPS;

        //took some inspiration from: https://stackoverflow.com/questions/48627744/how-do-you-implement-an-enum-in-an-object-class-java/48627811
    enum WeaponType {
        AXE,
        BOW,
        DAGGER,
        HAMMER,
        STAFF,
        SWORD,
        WAND
    }

    //constructor
    public Weapon(String name, int requiredLevel, String slot, WeaponType type, int damage, double attackPerSec) {
        super(name, requiredLevel, slot);
        this.type = type;
        this.damage = damage;
        this.attackPerSec = attackPerSec;
        this.DPS = damage * attackPerSec;
    }

    public WeaponType getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackPerSec() {
        return attackPerSec;
    }

    public double getDPS() {
        return DPS;
    }


}
