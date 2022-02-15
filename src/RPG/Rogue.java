package RPG;

public class Rogue extends Character {

    public Rogue(String name) {
        super(name, 2, 6, 1);
    }

    // level up + set attributes.
    public void levelup() {
        super.setLevel();
        super.setBaseAttributes(1, 4, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }

    public int getDamageIncrease() {
        //each point of Dexterity increases rogue damage
        String[] attr = super.getBaseAttributes().split(",");
        //dexterity is at index 1
        return Integer.parseInt(attr[1]);
    }

    public void equipWeapon(Weapon weapon) {
        if (weapon.type != Weapon.Type.DAGGER || weapon.type != Weapon.Type.SWORD) {
            //throw custom InvalidWeaponException
        } else if (weapon.getRequiredLevel() > super.getLevel()) {
            //throw custom InvalidWeaponException
        } else {
            //put into slot.
        }
    }
}
