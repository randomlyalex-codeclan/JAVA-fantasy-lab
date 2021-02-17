package characters;

import items.Item;
import items.Weapon;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int currentHealth;
    private ArrayList<Item> inventory;
    private int experience;

    public Character(String name, int startingHealth){
        this.name = name;
        this.currentHealth = startingHealth;
        this.inventory = new ArrayList<Item>();
        this.experience = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
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
}


