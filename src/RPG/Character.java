package RPG;

import java.util.HashMap;

public abstract class Character {
    //fields
    private final String name;
    private int level;
    private PrimaryAttribute basePrimaryAttributes;
    private PrimaryAttribute totalPrimaryAttributes;
    private HashMap<Slot, Item> equipment;

    //constructor
    public Character(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.level = 1;
        this.basePrimaryAttributes = new PrimaryAttribute(strength, dexterity, intelligence); //set up PrimaryAttribute
        this.equipment = new HashMap<>();
    }

    //getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getBaseAttributes() {
        return this.basePrimaryAttributes.getAllAttributes();
    }

    public String getEquipment() {
        String print = "";
        for (Slot i: this.equipment.keySet()) {
            print = i + " " + this.equipment.get(i).getName();
        }
        return print;
    }

    public String getTotalPrimaryAttributes() {
        return totalPrimaryAttributes.getAllAttributes();
    }

    //setters
    public void setLevel(){
        this.level++;
    }

    public void setBaseAttributes(int strength, int dexterity, int intelligence) {
        this.basePrimaryAttributes.setAllAttributes(strength, dexterity, intelligence);
    }

    public void setTotalPrimaryAttributes(PrimaryAttribute totalPrimaryAttributes) {
        this.totalPrimaryAttributes = totalPrimaryAttributes;
    }

    public void setEquipment(Weapon weapon) throws InvalidWeaponException {
        if (weapon.getRequiredLevel() <= this.level) {
            equipment.put(weapon.getSlot(), weapon);
        } else {
            throw new InvalidWeaponException("The level of this weapon is to high for " + this.getName() + " to equip.");
        }
    }

    public void setEquipment(Armor armor) throws InvalidArmorException {
        if (armor.getRequiredLevel() <= this.level) {
            equipment.put(armor.getSlot(), armor);
        } else {
            throw new InvalidArmorException("The level of this armor is to high for " + this.getName() + " to equip.");
        }
    }

}
