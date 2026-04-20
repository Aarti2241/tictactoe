 public class TicTacToeUC4 {

    // Method to convert slot number to row and column
    public static void convertSlotToIndex(int slot) {

        // Convert slot (1–9) to row index (0–2)
        int row = (slot - 1) / 3;

        // Convert slot (1–9) to column index (0–2)
        int col = (slot - 1) % 3;

        // Display calculated indices
        System.out.println("Slot " + slot + " is at:");
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    public static void main(String[] args) {

        int slot = 5; // Example slot

        // Call method to convert slot
        convertSlotToIndex(slot);
    }
}
