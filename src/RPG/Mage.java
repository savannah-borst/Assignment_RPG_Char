package RPG;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 1, 1, 8);
    }

    // level up + set attributes.
    public void levelup() {
        super.setLevel();
        super.setBaseAttributes(1, 1, 5);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }

    public int getDamageIncrease() {
        //each point of intelligence increases mage damage
        String[] attr = super.getBaseAttributes().split(",");
        //intelligence is at index 2
        return Integer.parseInt(attr[2]);
    }

    public void setEquipment(Item item) throws InvalidWeaponException, InvalidArmorException {
        Slot slotCheck  = item.getSlot();
        if (slotCheck == Slot.WEAPON) {
            //check level requirement
            if (item.getRequiredLevel() > super.getLevel()) {
                throw new InvalidWeaponException("The level of this weapon is to high for " + super.getName() + " to equip.");
            }
            // check if types are equal to Staff,Wand. if so set equipment if not throw.
            else if (item.getWeaponType() == Weapon.Type.STAFF || item.getWeaponType() == Weapon.Type.WAND) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidWeaponException(super.getName() + " can't equip " + item.getWeaponType() + " but can equip: Staffs, Wands.");
            }
        }

        if (slotCheck == Slot.BODY || slotCheck == Slot.HEAD || slotCheck == Slot.LEGS) {
            if (item.getRequiredLevel() > super.getLevel()) {
                throw new InvalidArmorException("The level of this armor is to high for " + super.getName() + " to equip.");
            }
            if (item.getArmorType() == Armor.Type.CLOTH) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidArmorException(super.getName() + " can't equip " + item.getArmorType() + " but can equip: Cloth.");
            }
        }
    }
}
