package characters.nonPlayer;

import characters.Character;

public class Monster extends Character {
    String name;
    int currentHealth;
    int powerRating;
    int defenceRating;

    public Monster(String name, int startingHealth, int powerRating, int defenceRating){
        super(name, startingHealth, powerRating, defenceRating);
    }


}
