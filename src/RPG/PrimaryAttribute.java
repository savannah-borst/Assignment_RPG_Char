package RPG;

public class PrimaryAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;

    //constructor
    public PrimaryAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    //Set all by adding the passed argumented attributes
    public void setAllAttributes(int strength, int dexterity, int intelligence) {
        this.strength += strength;
        this.dexterity += dexterity;
        this.intelligence += intelligence;
    }

    //getter get all attributes as string with , between
    public String getAllAttributes() {
        return strength + ", " + dexterity + ", " + intelligence;
    }
}
