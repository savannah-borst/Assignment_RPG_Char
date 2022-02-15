package RPG;

public abstract class Item {
    private String name;
    private int requiredLevel;
    private Slot slot;


    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }
}
