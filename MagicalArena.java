import java.util.*;
public class MagicalArena{
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for Player 1's name
        System.out.print("Enter Player 1's name: ");
        String player1 = scanner.nextLine();

        // Prompt for Player 2's name
        System.out.print("Enter Player 2's name: ");
        String player2 = scanner.nextLine();

        // Default health for both players
        int player1Health = 100;
        int player2Health = 100;

        // Random generator
        Random random = new Random();

        // Generate Player 1's attributes
        int player1Strength = random.nextInt(11) + 10; // Strength: 10 to 20
        int player1Attack = random.nextInt(player1Strength - 10) + 10; // Attack: 10 to (strength - 1)

        // Generate Player 2's attributes
        int player2Strength = random.nextInt(11) + 10; // Strength: 10 to 20
        int player2Attack = random.nextInt(player2Strength - 10) + 10; // Attack: 10 to (strength - 1)

        // Display welcome message and player details
        System.out.println("\nWelcome to the Magical Arena!");
        System.out.println("Here are the player details:");

        System.out.println("\nPlayer 1: " + player1);
        System.out.println(" - Health: " + player1Health);
        System.out.println(" - Strength: " + player1Strength);
        System.out.println(" - Attack: " + player1Attack);

        System.out.println("\nPlayer 2: " + player2);
        System.out.println(" - Health: " + player2Health);
        System.out.println(" - Strength: " + player2Strength);
        System.out.println(" - Attack: " + player2Attack);

        // Close the scanner to free resources
        scanner.close();
    }
}