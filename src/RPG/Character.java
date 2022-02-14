package RPG;

public abstract class Character {

    private final String name;
    private int level;
    private PrimaryAttribute basePrimaryAttributes;
    private PrimaryAttribute totalPrimaryAttributes;
    private Equipment charEquipment;

    //constructor
    public Character(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.level = 1;
        this.basePrimaryAttributes = new PrimaryAttribute(strength, dexterity, intelligence); //set up PrimaryAttribute
        this.charEquipment = new Equipment();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(){
        this.level++;
    }

    public void setBaseAttributes(int strength, int dexterity, int intelligence) {
        this.basePrimaryAttributes.setAllAttributes(strength, dexterity, intelligence);
    }

    public String getBaseAttributes() {
        return this.basePrimaryAttributes.getAllAttributes();
    }

    public void equipWeapon(Weapon weapon) {
        this.charEquipment.setWeapon(weapon);
    }

    //refactor to get weapon
    public String getCharEquipment() {
        return this.charEquipment.getWeapon();
    }

    //public abstract void equipArmor();
}
