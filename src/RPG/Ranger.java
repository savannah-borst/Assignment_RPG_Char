package RPG;

public class Ranger extends Character {

    public Ranger(String name) {
        super(name, 1, 7, 1);
    }

    // level up + set attributes.
    public void levelup() {
        setLevel();
        updateBaseAttributes(1, 5, 1);
    }

    public void Equip(Weapon weapon) throws InvalidWeaponException{
        if (weapon.getWeaponType() == Weapon.Type.BOW) {
            super.setEquipment(weapon);
        } else {
            throw new InvalidWeaponException(super.getName() + " can't equip " + weapon.getWeaponType() + " but can equip: Axes, Hammers and Swords.");
        }
    }

    public void Equip(Armor armor) throws InvalidArmorException {
        if (armor.getArmorType() == Armor.Type.LEATHER || armor.getArmorType() == Armor.Type.MAIL) {
            super.setEquipment(armor);
        } else {
            throw new InvalidArmorException(super.getName() + " can't equip " + armor.getArmorType() + " but can equip: Mail, Plate.");
        }
    }
}
