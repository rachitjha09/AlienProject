import java.util.Random;

public class Alien {

    private final String NAME;
    private static Random r = new Random();

    // NAME will consist of type and 1 or 2 digit random number
    public Alien(String type) {
        this.NAME = type + r.nextInt(100);
    }

    public String getName() {
        return this.NAME;
    }

    public String toString() {
        return this.NAME;
    }

}

