package characters.player;

import items.HealingTool;
import items.Item;
import items.Weapon;

import java.util.ArrayList;

public class Healer extends Player {

    private ArrayList<Item> inventory;
    private HealerType archetype;
    private HealingTool equipped;

    public Healer(String name, HealerType healerType){
        super(name, healerType.getBaseHealth(), healerType.getBasePowerRating(), healerType.getBaseDefenceRating());
        this.archetype = healerType;
        this.equipped = null;
    }

    public HealerType getArchetype(){
        return this.archetype;
    }

    public void equip(Item healingTool){
        if (this.getInventory().contains(healingTool)) {
            if (healingTool instanceof HealingTool) {
                this.equipped = (HealingTool) healingTool;
            }
        }
    }

    public Item getEquipped(){
        return this.equipped;
    }
}
