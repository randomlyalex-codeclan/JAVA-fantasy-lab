package characters.nonPlayer.enemies;

import characters.Character;
import items.Item;

public class Enemy extends Character {

    private int expValue;

    public Enemy(String name, int startingHealth, int startingPowerRating, int startingDefenceRating, int expValue){
        super(name, startingHealth, startingPowerRating, startingDefenceRating);
        this.expValue = expValue;
    }

    public void attack(Item item, Character character){}
    public void defend(Item item, Character character){}


}
