package characters.player;

import characters.nonPlayer.Monster;
import characters.nonPlayer.enemies.Enemy;
import characters.player.Melee;
import characters.player.types.MeleeType;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void canAttackAnEnemyWithAnEquippedWeapon(){
        Weapon weapon = new Weapon("Axe",100,30);
        Enemy enemy = new Enemy("Orc",15,5,2,1);
        meleeCharacter.addToInventory(weapon);
        meleeCharacter.equip(weapon);
        meleeCharacter.attack(meleeCharacter.getEquipped(), enemy);
        assertNotEquals(15,enemy.getCurrentHealth());
    }
}
