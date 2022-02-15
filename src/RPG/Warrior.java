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

    //Equip to check Weapon and armor type. level check in Character abstract class
    public void Equip(Item item) throws InvalidWeaponException, InvalidArmorException {
        Slot slotCheck  = item.getSlot();
        //Weapon
        if (slotCheck == Slot.WEAPON) {
            // check if types are equal to Axe, Hammer and sword. if so set equipment if not throw.
            if (item.getWeaponType() == Weapon.Type.AXE || item.getWeaponType() == Weapon.Type.HAMMER || item.getWeaponType() == Weapon.Type.SWORD) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidWeaponException(super.getName() + " can't equip " + item.getWeaponType() + " but can equip: Axes, Hammers and Swords.");
            }
        }
        //Armor
        if (slotCheck == Slot.BODY || slotCheck == Slot.HEAD || slotCheck == Slot.LEGS) {
            if (item.getArmorType() == Armor.Type.MAIL || item.getArmorType() == Armor.Type.PLATE) {
                super.setEquipment(item.getSlot(), item);
            } else {
                throw new InvalidArmorException(super.getName() + " can't equip " + item.getArmorType() + " but can equip: Mail, Plate.");
            }
        }
    }
}
