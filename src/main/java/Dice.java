import java.util.Random;

public class Dice {
    private final Random rand;
    private final int faces;

    //Maybe have a class static variable as a history of rolls?

    public Dice(int faces) {
        this.rand = new Random();
        this.faces = faces;
    }

    public int roll() {
        return 1 + rand.nextInt(faces);
    }

}
