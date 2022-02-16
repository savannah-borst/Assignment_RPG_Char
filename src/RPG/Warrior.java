package RPG;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 5, 2, 1);
    }

    // level up + set attributes.
    public void levelup() {
        setLevel();
        updateBaseAttributes(3, 2, 1);
    }

    //equip weapon
    public void Equip(Weapon weapon) throws InvalidWeaponException {
        //check weapon types else throw
        if (weapon.getWeaponType() == Weapon.Type.AXE || weapon.getWeaponType() == Weapon.Type.HAMMER || weapon.getWeaponType() == Weapon.Type.SWORD) {
            super.setEquipment(weapon);
        } else {
            throw new InvalidWeaponException(super.getName() + " can't equip " + weapon.getWeaponType() + " but can equip: Axes, Hammers and Swords.");
        }
    }

    //equip armor
    public void Equip(Armor armor) throws InvalidArmorException {
        //check armor types else throw
        if (armor.getArmorType() == Armor.Type.MAIL || armor.getArmorType() == Armor.Type.PLATE) {
            super.setEquipment(armor);
        } else {
            throw new InvalidArmorException(super.getName() + " can't equip " + armor.getArmorType() + " but can equip: Mail, Plate.");
        }
    }
}
