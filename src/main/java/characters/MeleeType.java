package characters;

public enum MeleeType {
    BARBARIAN(1000),
    KNIGHT(1500),
    DWARF(1200);

    private final int baseHealth;

    MeleeType(int baseHealth ){
        this.baseHealth = baseHealth;
    }

    public int getBaseHealth() {
        return baseHealth;
    }
}
