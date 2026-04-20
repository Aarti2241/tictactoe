
import java.util.Random;

public class TicTacToeUC2 {

    public static void main(String[] args) {

        // Step 1: Create Random object
        Random random = new Random();

        // Step 2: Toss (0 or 1)
        int toss = random.nextInt(2);

        // Step 3: Game state variables
        char playerSymbol;
        char computerSymbol;
        String currentPlayer;

        // Step 4: Decide symbols and first player
        if (toss == 0) {
            playerSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = "Player";
        } 
        else {
            playerSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = "Computer";
        }

        // Step 5: Display results
        System.out.println("Toss Result: " + toss);

        System.out.println("Player Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);

        System.out.println(currentPlayer + " will start first.");
    }
}