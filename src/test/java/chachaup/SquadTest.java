package chachaup;

import chachaup.domain.Squad;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    //tests for getting all squad items
    @Test
    void getAllSquads_Squad() {
        ArrayList<Squad> squads = new ArrayList<>();
        assertEquals(squads,Squad.getAll());
    }

}