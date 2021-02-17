package characters;

import items.HealingTool;
import items.Item;
import items.Spell;
import items.Weapon;

import java.util.ArrayList;

public class Healer extends Character {

    private String name;
    private int currentHealth;
    private ArrayList<Item> inventory;
    private HealerType archetype;
    private HealingTool equippedHealingTool;

    public Healer(String name, HealerType healerType){
        super(name, healerType.getBaseHealth());
        this.archetype = healerType;
        this.equippedHealingTool = null;
    }

    public HealerType getArchetype(){
        return this.archetype;
    }

    public void equipHealingTool(HealingTool healingTool){
        this.equippedHealingTool = healingTool;
    }

    public HealingTool getEquippedHealingTool(){
        return this.equippedHealingTool;
    }


}
