import java.util.Scanner;

public class TicTacToeUC3 {

    // Method to get user slot input
    public static int getUserSlot() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");

        // Read integer input
        int slot = sc.nextInt();

        // Return slot value to main program
        return slot;
    }

    public static void main(String[] args) {

        // Call method to get user input
        int userSlot = getUserSlot();

        // Display entered slot
        System.out.println("You selected slot: " + userSlot);
    }
}