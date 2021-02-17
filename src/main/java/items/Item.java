package items;

public abstract class Item {
    private String name;
    private int powerRating;

    public Item(String name, int powerRating) {
        this.name = name;
        this.powerRating = powerRating;
    }

    public String getName() {
        return name;
    }

    public int getPowerRating() {
        return powerRating;
    }
}
