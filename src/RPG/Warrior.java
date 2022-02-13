package RPG;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name, 5, 2, 1);
    }

    @Override
    public void levelup() {
        super.levelup(3, 2, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }
}
