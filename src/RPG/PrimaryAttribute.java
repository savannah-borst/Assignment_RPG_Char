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

    //setters - has to be turned to one setter all at the same time (lvl up)
    public void setStrength(int strength) {
        this.strength += strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence += intelligence;
    }

    //getters
    public String getAllAttributes() {
        return strength + ", " + dexterity + ", " + intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }
}
