package characters;

import items.Item;
import items.Weapon;

import java.util.ArrayList;

public class Melee extends Character {

    private String name;
    private int currentHealth;
    private ArrayList<Item> inventory;
    private MeleeType archetype;
    private Weapon equippedWeapon;

    public Melee(String name, MeleeType meleeType){
        super(name, meleeType.getBaseHealth());
        this.archetype = meleeType;
        this.equippedWeapon = null;
    }

    public MeleeType getArchetype(){
        return this.archetype;
    }
    public Weapon getEquippedWeapon(){
        return this.equippedWeapon;
    }

    public void equipWeapon(Weapon weapon){
        this.equippedWeapon = weapon;
    }

}
