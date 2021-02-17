package characters.player;

import java.util.ArrayList;

import characters.nonPlayer.Monster;
import characters.player.types.CasterType;
import items.Item;
import items.Spell;

public class Caster extends Player {

    private ArrayList<Item> inventory;
    private CasterType archetype;
    private Spell equipped;
    private Monster monster;

    public Caster(String name, CasterType casterType) {
        super(name, casterType.getBaseHealth(), casterType.getBasePowerRating(), casterType.getBaseDefenceRating());
        this.archetype = casterType;
        this.equipped = null;
        this.monster = null;
    }

    public CasterType getArchetype() {
        return this.archetype;
    }

    public void equip(Item spell) {
        if (this.getInventory().contains(spell)) {
            if (spell instanceof Spell) {
                this.equipped = (Spell) spell;
            }
        }
    }

    public Item getEquipped() {
        return this.equipped;
    }


    public void assignMonster(Monster monster) {
        this.monster = monster;
    }

    public Monster getMonster() {
        return this.monster;
    }

}
