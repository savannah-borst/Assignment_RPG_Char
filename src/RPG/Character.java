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
        this.totalPrimaryAttributes = new PrimaryAttribute(); //set up empty total PrimaryAttribute
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
        // cycle through all equipment and print type + name
        for (Slot i: this.equipment.keySet()) {
            System.out.println(i + " " + this.equipment.get(i).getName());
        }
        return equipment;
    }

    public String getTotalPrimaryAttributes() {
        //first go to setTotal to check the gear and get up to date attributes
        updateTotalPrimaryAttributes();
        return totalPrimaryAttributes.getAllAttributes();
    }

    //setters
    public void setLevel(){
        this.level++;
    }

    //methods
    //update base attributes (happens when level up to add new attributes)
    public void updateBaseAttributes(int strength, int dexterity, int intelligence) {
        this.basePrimaryAttributes.setAllAttributes(
                this.basePrimaryAttributes.getStrength() + strength,
                this.basePrimaryAttributes.getDexterity() + dexterity,
                this.basePrimaryAttributes.getIntelligence() + intelligence
        );
    }

    public void updateTotalPrimaryAttributes() {
        int strength = 0;
        int dexterity = 0;
        int intelligence = 0;
        //loop through gear character is wearing now
        for (Slot i: this.equipment.keySet()) {
            //split armor attributes in array
            String[] parts = ((Armor) this.equipment.get(i)).getArmorAttributes().split(",");
            //
            strength = Integer.parseInt(parts[0]) + this.basePrimaryAttributes.getStrength();
            dexterity = Integer.parseInt(parts[1]) + this.basePrimaryAttributes.getDexterity();
            intelligence = Integer.parseInt(parts[2]) + this.basePrimaryAttributes.getIntelligence();
        }
        this.totalPrimaryAttributes.setAllAttributes(strength, dexterity, intelligence);
    }

    public void setEquipment(Weapon weapon) throws InvalidWeaponException {
        // level check else throw
        if (weapon.getRequiredLevel() <= this.level) {
            // add to HashMap
            equipment.put(weapon.getSlot(), weapon);
        } else {
            throw new InvalidWeaponException("The level of this weapon is to high for " + this.getName() + " to equip.");
        }
    }

    public void setEquipment(Armor armor) throws InvalidArmorException {
        // level check else throw
        if (armor.getRequiredLevel() <= this.level) {
            // add to HashMap
            equipment.put(armor.getSlot(), armor);
        } else {
            throw new InvalidArmorException("The level of this armor is to high for " + this.getName() + " to equip.");
        }
    }

}
