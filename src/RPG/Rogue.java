package RPG;

public class Rogue extends Character{
    public Rogue(String name) {
        super(name, 2, 6, 1);
    }

    // level up + argument for added attributes.
    // level up + set attributes.
    public void levelup() {
        super.setLevel(1);
        super.setBaseAttributes(1, 4, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }
}
