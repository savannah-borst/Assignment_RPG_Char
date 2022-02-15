package RPG;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 5, 2, 1);
    }

    // level up + set attributes.
    public void levelup() {
        super.setLevel();
        super.setBaseAttributes(3, 2, 1);
    }

    @Override
    public String getBaseAttributes() {
        return super.getBaseAttributes();
    }

    public int getDamageIncrease() {
        //each point of strength increases warrior damage
        String[] attr = super.getBaseAttributes().split(",");
        //strength is at index 0
        return Integer.parseInt(attr[0]);
    }

    //@Override
    public void equipWeapon(Weapon weapon) {
        if (weapon.type != Weapon.Type.AXE || weapon.type != Weapon.Type.HAMMER || weapon.type != Weapon.Type.SWORD) {
            //throw custom InvalidWeaponException
        } else if (weapon.getRequiredLevel() > super.getLevel()) {
            //throw custom InvalidWeaponException
        } else {
            //put into slot.
        }
    }
}
