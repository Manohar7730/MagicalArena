import java.util.*;

public class Dice {
    private Random random;

    // Constructor to initialize the random number generator
    public Dice() {
        random = new Random();
    }

    // Method to roll the dice (returns a number between 1 and 6)
    public int roll() {
        return random.nextInt(6) + 1; // Generate a random number between 1 and 6
    }
}
