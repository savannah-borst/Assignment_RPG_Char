package RPG;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 1, 1, 8);
    }

    // level up + set attributes.
    public void levelup() {
        setLevel();
        updateBaseAttributes(1, 1, 5);
    }

    public void Equip(Weapon weapon) throws InvalidWeaponException{
        if (weapon.getWeaponType() == Weapon.Type.STAFF || weapon.getWeaponType() == Weapon.Type.WAND) {
            super.setEquipment(weapon);
        } else {
            throw new InvalidWeaponException(super.getName() + " can't equip " + weapon.getWeaponType() + " but can equip: Axes, Hammers and Swords.");
        }
    }

    public void Equip(Armor armor) throws InvalidArmorException {
        if (armor.getArmorType() == Armor.Type.CLOTH) {
            super.setEquipment(armor);
        } else {
            throw new InvalidArmorException(super.getName() + " can't equip " + armor.getArmorType() + " but can equip: Mail, Plate.");
        }
    }
}
