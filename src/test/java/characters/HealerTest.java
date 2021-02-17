package characters;

import characters.player.Healer;
import characters.player.types.HealerType;
import items.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

        private Healer healerCharacter;

        @Before
        public void before(){
            healerCharacter = new Healer("Soft hands", HealerType.CLERIC);
        }

        @Test
        public void hasName(){
            assertEquals("Soft hands", healerCharacter.getName());
        }

        @Test
        public void hasStartingHealth(){
            assertEquals(500, healerCharacter.getCurrentHealth());
        }

        @Test
        public void hasStartingInventory(){
            assertEquals(0, healerCharacter.getInventory().size());
        }

        @Test
        public void hasHealerType(){
            assertEquals(HealerType.CLERIC, healerCharacter.getArchetype());
        }

        @Test
        public void equiqHealingTool(){
            HealingTool healingTool = new HealingTool("Healing Potion 5000", 100);
            healerCharacter.addToInventory(healingTool);
            healerCharacter.equip(healingTool);
            assertEquals(healingTool, healerCharacter.getEquipped());
        }

}
