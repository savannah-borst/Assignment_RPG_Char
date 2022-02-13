package RPG;

public class Ranger extends Character{
    public Ranger(String name) {
        super(name, 1, 5, 1);
    }

    // level up + argument for added attributes.
    @Override
    public void levelup() {
        super.levelup(1, 5, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }
}
