package RPG;

public class Ranger extends Character{
    public Ranger(String name) {
        super(name, 1, 7, 1);
    }

    // level up + argument for added attributes.
    // level up + set attributes.
    public void levelup() {
        super.setLevel(1);
        super.setBaseAttributes(1, 5, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }
}
