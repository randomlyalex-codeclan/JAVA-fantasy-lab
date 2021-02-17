package characters.player;

import behaviours.IAttack;
import behaviours.IDefend;
import behaviours.IUse;
import characters.Character;
import items.Item;
import items.Weapon;


import java.util.ArrayList;

public abstract class Player extends Character {


    private ArrayList<Item> inventory;
    private int experience;

    public Player(String name, int startingHealth, int startingPowerRating, int startingDefenseRating){
        super(name, startingHealth, startingPowerRating, startingDefenseRating);
        this.inventory = new ArrayList<Item>();
        this.experience = 0;
    }



    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getExperience() {
        return experience;
    }

    public void addToInventory(Item item){
        this.inventory.add(item);
    }

    public abstract void equip(Item item);

    public abstract Item getEquipped();

    public abstract void attack(Item item, Character character);
    public abstract void defend(Item item, Character character);
    public abstract void use(Item item, Character character);


}


