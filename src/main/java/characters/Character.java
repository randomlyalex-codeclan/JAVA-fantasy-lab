package characters;

import behaviours.IAttack;
import behaviours.IDefend;
import items.Item;

//Strength aka Body, Might, Brawn, Power ...
//        A measure of how physically strong a character is. Strength often controls the power and/or damage of melee attacks, the maximum weight the character can carry, and sometimes hit points. Armor and weapons might also have a Strength requirement to use them.
//        Constitution aka Stamina, Endurance, Vitality, Recovery ...
//        A measure of how sturdy a character is. Constitution often influences hit points, resistances for special types of damage (poisons, illness, heat etc.) and fatigue.
//        Defense aka Resistance, Fortitude, Resilience, ...
//        A measure of how resilient a character is. Defense usually decreases taken damage by either a percentage or a fixed amount per hit. Occasionally combined with Constitution.
//        Dexterity aka Agility, Reflexes, Quickness, ...
//        A measure of how agile a character is. Dexterity controls attack and movement speed and accuracy, as well as evading an opponent's attack (see Armor Class).




public abstract class Character {

    private String name;
    private int currentHealth;
    private int powerRating;
    private int defenceRating;
    private int lastDiceRoll;

    public Character(String name, int startingHealth, int startingPowerRating, int startingdefenceRating) {
        this.name = name;
        this.currentHealth = startingHealth;
        this.powerRating = startingPowerRating;
        this.defenceRating = startingdefenceRating;
        this.lastDiceRoll = 0;
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

    public int getLastDiceRoll(){ return this.lastDiceRoll;}
    public void setDiceRoll(int diceRoll){
//    probably should sanity check for positive dice rolls here?
        this.lastDiceRoll = diceRoll;
    }
    public void resetDiceRoll(){ this.lastDiceRoll = 0;}

    public abstract void attack(Item item, Character character);
    public abstract void defend(Item item, Character character);

}
