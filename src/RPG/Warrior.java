package RPG;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name, 5, 2, 1);
    }

    // level up + argument for added attributes.
    // level up + set attributes.
    public void levelup() {
        super.setLevel(1);
        super.setBaseAttributes(3, 2, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }
}
