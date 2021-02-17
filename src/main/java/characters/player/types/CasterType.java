package characters.player.types;

public enum CasterType {

    WARLOCK(900, 10, 5),
    WIZARD(800,1,3);


    private final int baseHealth;
    private final int basePowerRating;
    private final int baseDefenceRating;

    CasterType(int baseHealth, int basePowerRating, int baseDefenceRating ){

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
