import java.util.*;
public class main{
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for Player 1's name
        System.out.print("Enter Player 1's name: ");
        String player1 = scanner.nextLine();

        // Prompt for Player 2's name
        System.out.print("Enter Player 2's name: ");
        String player2 = scanner.nextLine();

        // Display confirmation of entered names
        System.out.println("\nWelcome to the Magical Arena!");
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);

        // Close the scanner to free resources
        scanner.close();
    }
}