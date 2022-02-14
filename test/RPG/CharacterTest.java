package RPG;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    Mage testMage;
    Ranger testRanger;
    Rogue testRogue;
    Warrior testWarrior;

    @BeforeEach
    void setUp() {
        testMage = new Mage("testMage");
        testRanger = new Ranger("testRanger");
        testRogue = new Rogue("testRogue");
        testWarrior = new Warrior("testWarrior");
    }

    @Test
    void getStartLevel_ValidInputs_shouldReturnOne() {
        int expected = 1;
        int actual = testMage.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void levelUp_validInputs_shouldReturnTwo() {
        int expected = 2;
        testMage.levelup();
        int actual = testMage.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void mageDefaultAttributes_validInputs_ShouldReturnOneOneEight() {
        String expected = "1, 1, 8";
        String actual = testMage.getBaseAttributes();
        assertEquals(expected, actual);
    }

    @Test
    void rangerDefaultAttributes_validInputs_ShouldReturnOneSevenOne() {
        String expected = "1, 7, 1";
        String actual = testRanger.getBaseAttributes();
        assertEquals(expected, actual);
    }

    @Test
    void rogueDefaultAttributes_validInputs_ShouldReturnTwoSixOne() {
        String expected = "2, 6, 1";
        String actual = testRogue.getBaseAttributes();
        assertEquals(expected, actual);
    }

    @Test
    void warriorDefaultAttributes_validInputs_ShouldReturnFiveTwoOne() {
        String expected = "5, 2, 1";
        String actual= testWarrior.getBaseAttributes();
        assertEquals(expected, actual);
    }
}