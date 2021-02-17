package characters;

import java.util.ArrayList;
import items.Item;
import items.Spell;

public class Caster extends Character {

    private String name;
    private int currentHealth;
    private ArrayList<Item> inventory;
    private CasterType archetype;
    private Spell equippedSpell;

    public Caster(String name, CasterType casterType){
        super(name, casterType.getBaseHealth());
        this.archetype = casterType;
        this.equippedSpell = null;
    }

    public CasterType getArchetype(){
        return this.archetype;
    }

    public Spell getEquippedSpell(){
        return this.equippedSpell;
    }

    public void equipSpell(Spell spell) {
        this.equippedSpell = spell;
    }


}
