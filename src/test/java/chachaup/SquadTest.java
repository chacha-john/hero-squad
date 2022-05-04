package chachaup;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void squadInstantiatesCorrectly_true() {
        Squad squad = new Squad("chachaUp",12,"poverty");
        assertTrue(squad instanceof Squad);
    }
}