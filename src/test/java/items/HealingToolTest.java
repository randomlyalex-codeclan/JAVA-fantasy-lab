package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HealingToolTest {
    HealingTool healingTool;

    @Before
    public void before(){
        healingTool = new HealingTool("Potion", 50);
    }

    @Test
    public void hasName() {
        assertEquals("Potion", healingTool.getName());
    }

    @Test
    public void hasPowerRating() {
        assertEquals(50, healingTool.getPowerRating());
    }
}
