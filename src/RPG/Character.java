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

    public HashMap<Slot, Item> getEquipment() {
        return equipment;
    }

    public PrimaryAttribute getTotalPrimaryAttributes() {
        return totalPrimaryAttributes;
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

    public void setEquipment(Slot slot, Item item) throws InvalidWeaponException, InvalidArmorException {
        //Level check throws exception for appropriate gear type
        if (item.getRequiredLevel() > this.getLevel()) {
            if (slot == Slot.WEAPON) {
                throw new InvalidWeaponException("The level of this weapon is to high for " + this.getName() + " to equip.");
            } else if (slot == Slot.BODY || slot == Slot.LEGS || slot == Slot.HEAD) {
                throw new InvalidArmorException("The level of this armor is to high for " + this.getName() + " to equip.");
            }
        } else {
            equipment.put(slot, item);
        }
    }



}
