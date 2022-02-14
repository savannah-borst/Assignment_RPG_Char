package RPG;

public class Equipment {
    //Armor head;
    //Armor body;
    //Armor legs;
    Weapon weapon;

    enum EquipmentSlots {
        HEAD,
        BODY,
        LEGS,
        WEAPON
    }

    public Equipment() {

    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon.getName();
    }
}
