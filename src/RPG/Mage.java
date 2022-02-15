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

    //Equip to check Weapon and armor type. level check in Character abstract class
    public void Equip(Item item) throws InvalidWeaponException, InvalidArmorException {
        Slot slotCheck  = item.getSlot();
        //Weapon
        if (slotCheck == Slot.WEAPON) {
            if (item.getWeaponType() == Weapon.Type.STAFF || item.getWeaponType() == Weapon.Type.WAND) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidWeaponException(super.getName() + " can't equip " + item.getWeaponType() + " but can equip: Staffs, Wands.");
            }
        }
        //Armor
        if (slotCheck == Slot.BODY || slotCheck == Slot.HEAD || slotCheck == Slot.LEGS) {
            if (item.getArmorType() == Armor.Type.CLOTH) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidArmorException(super.getName() + " can't equip " + item.getArmorType() + " but can equip: Cloth.");
            }
        }
    }
}
