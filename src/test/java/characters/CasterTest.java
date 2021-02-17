package characters;

import characters.nonPlayer.Monster;
import characters.player.Caster;
import characters.player.CasterType;
import items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasterTest {

    Caster casterCharacter;

    @Before
    public void before(){
        casterCharacter = new Caster("Spelly McSpellface", CasterType.WIZARD);
    }

    @Test
    public void hasName() {
        assertEquals("Spelly McSpellface", casterCharacter.getName());
    }

    @Test
    public void hasCurrentHealth() {
        assertEquals(800, casterCharacter.getCurrentHealth());
    }

    @Test
    public void hasEmptyStartingInventory() {
        assertEquals(0, casterCharacter.getInventory().size());
    }

    @Test
    public void hasCasterType() {
        assertEquals(CasterType.WIZARD, casterCharacter.getArchetype());
    }

    @Test
    public void canAddItemsToInventory() {
        Spell spell = new Spell("Makes Scary Bang & Flash", 20);
        casterCharacter.addToInventory(spell);
        assertEquals(1, casterCharacter.getInventory().size());
    }

    @Test
    public void canEquipWeapon() {
        Spell spell = new Spell("Makes Scary Bang & Flash", 20);
        casterCharacter.addToInventory(spell);
        casterCharacter.equip(spell);
        assertEquals(spell, casterCharacter.getEquipped());
    }

    @Test
    public void canAddMonster(){
        Monster monster = new Monster("Fido", 300, 20, 60);
        casterCharacter.assignMonster(monster);
        assertEquals(monster, casterCharacter.getMonster());
    }
}
