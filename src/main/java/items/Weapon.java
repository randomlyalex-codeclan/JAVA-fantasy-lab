package items;

public class Weapon extends Item {

    private int defenceRating;

    public Weapon(String name, int powerRating, int defenceRating) {
        super(name, powerRating);
        this.defenceRating = defenceRating;
    }

    public int getDefenceRating() {
        return defenceRating;
    }
}
