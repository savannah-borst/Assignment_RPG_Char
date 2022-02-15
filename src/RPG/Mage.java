package RPG;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 1, 1, 8);
    }

    // level up + set attributes.
    public void levelup() {
        super.setLevel();
        super.setBaseAttributes(1, 1, 5);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }

    public int getDamageIncrease() {
        //each point of intelligence increases mage damage
        String[] attr = super.getBaseAttributes().split(",");
        //intelligence is at index 2
        return Integer.parseInt(attr[2]);
    }

    public void equipWeapon(Weapon weapon) {
        if (weapon.type != Weapon.Type.STAFF || weapon.type != Weapon.Type.WAND) {
            //throw custom InvalidWeaponException
        } else if (weapon.getRequiredLevel() > super.getLevel()) {
            //throw custom InvalidWeaponException
        } else {
            //put into slot.
        }
    }
}
