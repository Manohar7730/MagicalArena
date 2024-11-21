import java.util.*;
public class MagicalArena{
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for Player 1's name
        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.nextLine();

        // Prompt for Player 2's name
        System.out.print("Enter Player 2's name: ");
        String player2Name = scanner.nextLine();

         // Random generator
        Random random = new Random();

        Player player1 = new Player(
            player1Name,
            100,
            random.nextInt(11) + 10, // Strength between 10 and 20
            0 // Placeholder for attack
        );
        player1.setPlayerAttack(random.nextInt(player1.getPlayerStrength() - 1) + 1); // Attack less than strength

        Player player2 = new Player(
            player2Name,
            100,
            random.nextInt(11) + 10, // Strength between 10 and 20
            0 // Placeholder for attack
        );
        player2.setPlayerAttack(random.nextInt(player2.getPlayerStrength() - 1) + 1); // Attack less than strength

        // Display welcome message and player details
        System.out.println("\nWelcome to the Magical Arena!");
        System.out.println("Here are the player details:");

        System.out.println("\nPlayer 1: " + player1.getPlayerName());
        System.out.println(" - Health: " + player1.getPlayerHealth());
        System.out.println(" - Strength: " + player1.getPlayerStrength());
        System.out.println(" - Attack: " + player1.getPlayerAttack());

        System.out.println("\nPlayer 1: " + player2.getPlayerName());
        System.out.println(" - Health: " + player2.getPlayerHealth());
        System.out.println(" - Strength: " + player2.getPlayerStrength());
        System.out.println(" - Attack: " + player2.getPlayerAttack());

        // Close the scanner to free resources
        scanner.close();
    }
}