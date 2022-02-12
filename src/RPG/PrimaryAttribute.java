package RPG;

public class PrimaryAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;

    public PrimaryAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void setStrength(int strength) {
        this.strength += strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence += intelligence;
    }
}
