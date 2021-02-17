package characters;

public class Monster {
    String name;
    int currentHealth;
    int powerRating;
    int defenceRating;

    public Monster(String name, int currentHealth, int powerRating, int defenceRating) {
        this.name = name;
        this.currentHealth = currentHealth;
        this.powerRating = powerRating;
        this.defenceRating = defenceRating;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public int getDefenceRating() {
        return defenceRating;
    }
}
