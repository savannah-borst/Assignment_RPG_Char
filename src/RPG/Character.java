package RPG;

public abstract class Character {
    private String name;
    private int level;
    //base prim attr
    //total prim attr

    public Character(String name) {
        this.name = name;
        this.level = 1;
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
}
