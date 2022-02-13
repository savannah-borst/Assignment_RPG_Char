package RPG;

public abstract class Item {
    private String name;
    private int requiredLevel;
    //slot

    public Item(String name, int requiredLevel) {
        this.name = name;
        this.requiredLevel = requiredLevel;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }
}
