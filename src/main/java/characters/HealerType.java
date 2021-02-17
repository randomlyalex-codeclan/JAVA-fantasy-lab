package characters;

public enum HealerType {

    CLERIC(500);


    private final int baseHealth;

    HealerType(int baseHealth ){
        this.baseHealth = baseHealth;
    }

    public int getBaseHealth() {
        return baseHealth;
    }
}
