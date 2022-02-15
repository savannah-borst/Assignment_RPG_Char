package RPG;

public class Armor extends Item{
    private Type type;
    private PrimaryAttribute armorAttributes;

    //took some inspiration from: https://stackoverflow.com/questions/48627744/how-do-you-implement-an-enum-in-an-object-class-java/48627811
    enum Type {
        CLOTH,
        LEATHER,
        MAIL,
        PLATE
    }
    public Armor(String name, int requiredLevel, Slot slot, Armor.Type type) {
        super(name, requiredLevel, slot, type);
    }
}
