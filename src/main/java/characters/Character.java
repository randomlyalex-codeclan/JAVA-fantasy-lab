package characters;

import behaviours.IAttack;
import behaviours.IDefend;
import items.Item;

public abstract class Character {

    private String name;
    private int currentHealth;
    private int powerRating;
    private int defenceRating;

    public Character(String name, int startingHealth, int startingPowerRating, int startingdefenceRating) {
        this.name = name;
        this.currentHealth = startingHealth;
        this.powerRating = startingPowerRating;
        this.defenceRating = startingdefenceRating;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getPowerRating() {
        return this.powerRating;
    }

    public int getDefenceRating() {
        return defenceRating;
    }

    public abstract void attack(Item item, Character character);
    public abstract void defend(Item item, Character character);

}
