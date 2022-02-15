package RPG;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 5, 2, 1);
    }

    // level up + set attributes.
    public void levelup() {
        super.setLevel();
        super.setBaseAttributes(3, 2, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }

    public int getDamageIncrease() {
        //each point of strength increases warrior damage
        String[] attr = super.getBaseAttributes().split(",");
        //strength is at index 0
        return Integer.parseInt(attr[0]);
    }

    public void setEquipment(Item item) throws InvalidWeaponException {
        if (item.getSlot() == Slot.WEAPON) {

            if (item.getType() == Weapon.Type.AXE || item.getType() == Weapon.Type.HAMMER || item.getType() == Weapon.Type.SWORD) {
                super.setEquipment(item.getSlot(), item);
            }else if (item.getRequiredLevel() > super.getLevel()) {
                throw new InvalidWeaponException("The level of this weapon is to high for " + super.getName() + "to equip.");
            } else {
                throw new InvalidWeaponException(super.getName() + " can't equip " + item.getType() + " but can equip: Axes, hammers and swords.");
            }
        }
    }
}
