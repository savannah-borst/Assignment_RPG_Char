package RPG;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 1, 1, 8);
    }

    @Override
    public void levelup() {
        super.levelup(1, 1, 5);
    }
}
