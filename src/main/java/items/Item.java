package items;

//Items should have modifiers that are related to attributes of the chracter class:
//
////
//        Strength aka Body, Might, Brawn, Power ...
//        A measure of how physically strong a character is. Strength often controls the power and/or damage of melee attacks, the maximum weight the character can carry, and sometimes hit points. Armor and weapons might also have a Strength requirement to use them.
//        Constitution aka Stamina, Endurance, Vitality, Recovery ...
//        A measure of how sturdy a character is. Constitution often influences hit points, resistances for special types of damage (poisons, illness, heat etc.) and fatigue.
//        Defense aka Resistance, Fortitude, Resilience, ...
//        A measure of how resilient a character is. Defense usually decreases taken damage by either a percentage or a fixed amount per hit. Occasionally combined with Constitution.
//        Dexterity aka Agility, Reflexes, Quickness, ...
//        A measure of how agile a character is. Dexterity controls attack and movement speed and accuracy, as well as evading an opponent's attack (see Armor Class).


public abstract class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
