package RPG;

public class Mage extends Character {
    private double weaponDPS;

    public Mage(String name) {
        super(name, 1, 1, 8);
    }

    // level up + set attributes.
    public void levelup() {
        setLevel();
        updateBaseAttributes(1, 1, 5);
    }

    public double DPS() {
        //get string and split up
        String[] attr = super.getTotalPrimaryAttributes().split(",");
        //strength is at index 0
        int strength = Integer.parseInt(attr[0]);
        return this.weaponDPS * (1 + strength / (double)100);
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
