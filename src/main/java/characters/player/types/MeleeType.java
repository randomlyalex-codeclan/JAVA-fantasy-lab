package characters.player.types;

public enum MeleeType {
    BARBARIAN(1000, 30,20),
    KNIGHT(1500, 50, 30),
    DWARF(1200, 25, 50);

    private final int baseHealth;
    private final int basePowerRating;
    private final int baseDefenceRating;

    MeleeType(int baseHealth, int basePowerRating, int baseDefenceRating ){

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
