package RPG;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Mage jael = new Mage("Jael");
        Rogue savannah = new Rogue("Savannah");
        Ranger charona = new Ranger("Charona");
        Warrior mathijs = new Warrior("Mathijs");

        System.out.println(jael.getName() + " " + jael.getLevel() + " " + jael.getBaseAttributes());
        System.out.println(savannah.getName() + " " + savannah.getLevel() + " " + savannah.getBaseAttributes());
        System.out.println(charona.getName() + " " + charona.getLevel() + " " + charona.getBaseAttributes());
        System.out.println(mathijs.getName() + " " + mathijs.getLevel() + " " + mathijs.getBaseAttributes());

        jael.levelup();
        savannah.levelup();
        charona.levelup();
        mathijs.levelup();
        System.out.println(jael.getName() + " " + jael.getLevel() + " " + jael.getBaseAttributes());

    }
}
