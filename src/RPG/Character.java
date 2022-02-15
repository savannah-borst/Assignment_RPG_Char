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

    public void setEquipment(HashMap<Slot, Item> equipment) {
        this.equipment = equipment;
    }

    public void setTotalPrimaryAttributes(PrimaryAttribute totalPrimaryAttributes) {
        this.totalPrimaryAttributes = totalPrimaryAttributes;
    }
}
