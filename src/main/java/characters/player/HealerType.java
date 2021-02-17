package characters.player;

public enum HealerType {

    CLERIC(500, 1, 20);


    private final int baseHealth;
    private final int basePowerRating;
    private final int baseDefenceRating;

    HealerType(int baseHealth, int basePowerRating, int baseDefenceRating ){

        this.baseHealth = baseHealth;
        this.basePowerRating = basePowerRating;
        this. baseDefenceRating = baseDefenceRating;
    }

    public int getBaseHealth() {
        return baseHealth;
    }
    public int getBasePowerRating() {
        return basePowerRating;
    }
    public int getBaseDefenceRating() {
        return baseDefenceRating;
    }


}
