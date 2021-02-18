package characters.player;

import characters.Character;
import characters.player.types.MeleeType;
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

    public void attack(Item item, Character character){

    }
    public void defend(Item item, Character character){}
    public void use(Item item, Character character){}
}
