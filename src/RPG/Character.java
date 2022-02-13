package RPG;

public abstract class Character implements Hero{

    private final String name;
    private int level;
    private PrimaryAttribute basePrimaryAttributes;
    //total prim attr

    //constructor
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

    // level up + argument for added attributes.
    public void levelup(int strength, int dexterity, int intelligence) {
        level++;
        this.basePrimaryAttributes.setAllAttributes(strength, dexterity, intelligence);
    }

    public String getBaseAttributes() {
        return this.basePrimaryAttributes.getAllAttributes();
    }
}
