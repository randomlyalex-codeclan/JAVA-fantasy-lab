package characters;

import characters.nonPlayer.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {

    private Monster monster;

    @Before
    public void before(){
        monster = new Monster("frank",500,40, 50);
    }

    @Test
    public void hasName(){
        assertEquals("frank", monster.getName());
    }

    @Test
    public void hasStartingHealth(){
        assertEquals(500, monster.getCurrentHealth());
    }

    @Test
    public void hasPowerRating(){
        assertEquals(40, monster.getPowerRating());
    }

    @Test
    public void hasDefenceRating(){
        assertEquals(50, monster.getDefenceRating());
    }


}

