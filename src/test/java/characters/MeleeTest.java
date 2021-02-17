package characters;

import characters.player.Melee;
import characters.player.MeleeType;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeleeTest {

    Melee meleeCharacter;

    @Before
    public void before(){
        meleeCharacter = new Melee("Fighty McFightface", MeleeType.DWARF);
    }

    @Test
    public void hasName() {
        assertEquals("Fighty McFightface", meleeCharacter.getName());
    }

    @Test
    public void hasCurrentHealth() {
        assertEquals(1200, meleeCharacter.getCurrentHealth());
    }

    @Test
    public void hasEmptyStrartingInventory() {
        assertEquals(0, meleeCharacter.getInventory().size());
    }

    @Test
    public void hasMeleeType() {
        assertEquals(MeleeType.DWARF, meleeCharacter.getArchetype());
    }

    @Test
    public void canAddItemsToInventory() {
        Weapon weapon = new Weapon("Axe",100,30);
        meleeCharacter.addToInventory(weapon);
        assertEquals(1, meleeCharacter.getInventory().size());
    }

    @Test
    public void canEquipWeapon() {
        Weapon weapon = new Weapon("Axe",100,30);
        meleeCharacter.addToInventory(weapon);
        meleeCharacter.equip(weapon);
        assertEquals(weapon, meleeCharacter.getEquipped());



    }
}
