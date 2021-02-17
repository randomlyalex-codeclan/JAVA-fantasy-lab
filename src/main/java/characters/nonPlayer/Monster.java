package characters.nonPlayer;

import characters.Character;
import items.Item;

public class Monster extends Character {

    public Monster(String name, int startingHealth, int powerRating, int defenceRating){
        super(name, startingHealth, powerRating, defenceRating);
    }

    public void attack(Item item, Character character){}
    public void defend(Item item, Character character){}


}
