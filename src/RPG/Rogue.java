package RPG;

public class Rogue extends Character {

    public Rogue(String name) {
        super(name, 2, 6, 1);
        setCharacterDPS("dexterity");
    }

    // level up + set attributes.
    public void levelup() {
        setLevel();
        updateBaseAttributes(1, 4, 1);
        setCharacterDPS("dexterity");
    }

    public void Equip(Weapon weapon) throws InvalidWeaponException{
        if (weapon.getWeaponType() == Weapon.Type.DAGGER || weapon.getWeaponType() == Weapon.Type.SWORD) {
            setEquipment(weapon);
            setCharacterDPS("dexterity");
        } else {
            throw new InvalidWeaponException(super.getName() + " can't equip " + weapon.getWeaponType() + " but can equip: Axes, Hammers and Swords.");
        }
    }

    public void Equip(Armor armor) throws InvalidArmorException {
        if (armor.getArmorType() == Armor.Type.LEATHER || armor.getArmorType() == Armor.Type.MAIL) {
            setEquipment(armor);
            setCharacterDPS("dexterity");
        } else {
            throw new InvalidArmorException(super.getName() + " can't equip " + armor.getArmorType() + " but can equip: Mail, Plate.");
        }
    }

}
