package RPG;

public class Rogue extends Character {
    private double weaponDPS;

    public Rogue(String name) {
        super(name, 2, 6, 1);
    }

    // level up + set attributes.
    public void levelup() {
        super.setLevel();
        super.setBaseAttributes(1, 4, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }

    public double DPS() {
        //get string and split up
        String[] attr = super.getTotalPrimaryAttributes().split(",");
        //strength is at index 0
        int strength = Integer.parseInt(attr[0]);
        return this.weaponDPS * (1 + strength / (double)100);
    }


    public void Equip(Weapon weapon) throws InvalidWeaponException{
        if (weapon.getWeaponType() == Weapon.Type.DAGGER || weapon.getWeaponType() == Weapon.Type.SWORD) {
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
