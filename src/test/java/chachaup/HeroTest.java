package chachaup;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void heroInstantiatesCorrectly() {
        Hero hero = new Hero("chacha",24,"invisibility","believes in people");
        assertTrue(hero instanceof Hero);
    }
}