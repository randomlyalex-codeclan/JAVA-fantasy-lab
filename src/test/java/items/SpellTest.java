package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpellTest {

    Spell spell;

    @Before
    public void before(){
            spell = new Spell("Fireball",150);
    }

    @Test
    public void hasName(){
        assertEquals("Fireball", spell.getName());
    }

    @Test
    public void hasPowerRating(){
        assertEquals(150, spell.getPowerRating());
    }
}