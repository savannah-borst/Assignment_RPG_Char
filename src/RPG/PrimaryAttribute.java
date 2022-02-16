package RPG;

public class PrimaryAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;

    //constructor
    public PrimaryAttribute() {

    }

    public PrimaryAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Set all by adding the passed argument attributes
    public void setAllAttributes(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    //getter get all attributes as string with , between
    public String getAllAttributes() {
        return strength + "," + dexterity + "," + intelligence;
    }
}
