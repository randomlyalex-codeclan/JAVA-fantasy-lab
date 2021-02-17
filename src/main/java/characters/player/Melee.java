package characters.player;

import items.Item;
import items.Weapon;

public class Melee extends Player {

    private MeleeType archetype;
    private Weapon equipped;

    public Melee(String name, MeleeType meleeType){
        super(name, meleeType.getBaseHealth(), meleeType.getBasePowerRating(), meleeType.getBaseDefenceRating());
        this.archetype = meleeType;
        this.equipped = null;
    }

    public MeleeType getArchetype(){
        return this.archetype;
    }

    public void equip(Item weapon){
        if (this.getInventory().contains(weapon)) {
            if (weapon instanceof Weapon) {
                this.equipped = (Weapon) weapon;
            }
        }
    }

    public Item getEquipped(){
        return this.equipped;
    }

}
