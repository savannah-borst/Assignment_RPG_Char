package RPG;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mage jael = new Mage("Jael");
        Rogue savannah = new Rogue("Savannah");
        Ranger charona = new Ranger("Charona");
        Warrior mathijs = new Warrior("Mathijs");

        System.out.println(jael.getName() + " " + jael.getLevel());
        System.out.println(savannah.getName() + " " + savannah.getLevel());
        System.out.println(charona.getName() + " " + charona.getLevel());
        System.out.println(mathijs.getName() + " " + mathijs.getLevel());

        savannah.levelUp();
        System.out.println(savannah.getName() + " " + savannah.getLevel());
    }
}
