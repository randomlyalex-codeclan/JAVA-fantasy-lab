package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Great Axe",100,20);
    }

    @Test
    public void hasName() {
        assertEquals("Great Axe", weapon.getName());
    }

    @Test
    public void hasPowerRating() {
        assertEquals(100, weapon.getPowerRating());
    }

    @Test
    public void hasDefenceRating() {
        assertEquals(20, weapon.getDefenceRating());
    }
}