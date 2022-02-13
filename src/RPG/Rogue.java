package RPG;

public class Rogue extends Character{
    public Rogue(String name) {
        super(name, 2, 6, 1);
    }

    @Override
    public void levelup() {
        super.levelup(1, 4, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }
}
