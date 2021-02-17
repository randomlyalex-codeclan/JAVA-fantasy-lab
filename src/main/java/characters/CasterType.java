package characters;

public enum CasterType {

    WARLOCK(900),
    WIZARD(800);


    private final int baseHealth;

    CasterType(int baseHealth ){
        this.baseHealth = baseHealth;
    }

    public int getBaseHealth() {
        return baseHealth;
    }
}
