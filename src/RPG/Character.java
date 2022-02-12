package RPG;

public abstract class Character {
    private final String name;
    private int level;
    private PrimaryAttribute basePrimaryAttributes;
    //total prim attr

    public Character(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.level = 1;
        this.basePrimaryAttributes = new PrimaryAttribute(strength, dexterity, intelligence); //set up PrimaryAttribute
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        level++;
    }

    public String getBaseAttributes() {
        return this.basePrimaryAttributes.getStrength() + ", " + this.basePrimaryAttributes.getDexterity() + ", " + this.basePrimaryAttributes.getIntelligence();
    }
}
