package RPG;

public abstract class Item {
    private final String name;
    private final int requiredLevel;
    private final Slot slot;
    private Weapon.Type type;


    public Item(String name, int requiredLevel, Slot slot, Weapon.Type type) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
        this.type = type;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public Slot getSlot() {
        return slot;
    }

    public Weapon.Type getType() {
        return type;
    }
}
