package RPG;

public class Rogue extends Character {

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

    public int getDamageIncrease() {
        //each point of Dexterity increases rogue damage
        String[] attr = super.getBaseAttributes().split(",");
        //dexterity is at index 1
        return Integer.parseInt(attr[1]);
    }

    public void setEquipment(Item item) throws InvalidWeaponException, InvalidArmorException {
        Slot slotCheck  = item.getSlot();
        if (slotCheck == Slot.WEAPON) {
            //check level requirement
            if (item.getRequiredLevel() > super.getLevel()) {
                throw new InvalidWeaponException("The level of this weapon is to high for " + super.getName() + " to equip.");
            }
            // check if types are equal to Axe, Hammer and sword. if so set equipment if not throw.
            else if (item.getWeaponType() == Weapon.Type.DAGGER || item.getWeaponType() == Weapon.Type.SWORD) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidWeaponException(super.getName() + " can't equip " + item.getWeaponType() + " but can equip: Daggers, Swords.");
            }
        }

        if (slotCheck == Slot.BODY || slotCheck == Slot.HEAD || slotCheck == Slot.LEGS) {
            if (item.getRequiredLevel() > super.getLevel()) {
                throw new InvalidArmorException("The level of this armor is to high for " + super.getName() + " to equip.");
            }
            if (item.getArmorType() == Armor.Type.MAIL || item.getArmorType() == Armor.Type.LEATHER) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidArmorException(super.getName() + " can't equip " + item.getArmorType() + " but can equip: Leather, Mail.");
            }
        }
    }
}
