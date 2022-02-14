package RPG;

public class Ranger extends Character{
    public Ranger(String name) {
        super(name, 1, 7, 1);
    }

    // level up + set attributes.
    public void levelup() {
        super.setLevel();
        super.setBaseAttributes(1, 5, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }

    public int getDamageIncrease() {
        //each point of Dexterity increases ranger damage
        String[] attr = super.getBaseAttributes().split(",");
        //dexterity is at index 1
        return Integer.parseInt(attr[1]);
    }
}
