package RPG;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    Mage testMage;

    @BeforeEach
    void setUp() {
        testMage = new Mage("name");
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
}