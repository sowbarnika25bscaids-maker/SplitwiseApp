import java.util.Scanner;

public class SplitwiseApp {
    public static void main(String[] args) {

        // Step 1 - Recording 1 data
        final String EXPENSE_DESCRIPTION = "Dinner";
        final double TOTAL_AMOUNT = 1200.0;
        final int NUMBER_OF_PEOPLE = 4;
        final double INDIVIDUAL_SHARE = TOTAL_AMOUNT / NUMBER_OF_PEOPLE;

        // Step 2 - Menu constants
        final int MENU_ADD_EXPENSE = 1;
        final int MENU_VIEW_EXPENSES = 2;
        final int MENU_EXIT = 3;

        // Step 3 - Scanner and running flag
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Step 4 - Menu loop
        while (running) {

            System.out.println("=== Splitwise Console Backend ===");
            System.out.println();
            System.out.println("1. Add expense");
            System.out.println("2. View expenses");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {

                case MENU_ADD_EXPENSE -> {
                    System.out.println("Recording expense (sample data)...");
                    System.out.println("Expense saved: " + EXPENSE_DESCRIPTION
                            + " | amount=" + TOTAL_AMOUNT
                            + " | people=" + NUMBER_OF_PEOPLE);
                    System.out.println();
                }

                case MENU_VIEW_EXPENSES -> {
                    System.out.println("--- Expense Summary ---");
                    System.out.println("Description : " + EXPENSE_DESCRIPTION);
                    System.out.println("Total amount: " + TOTAL_AMOUNT);
                    System.out.println("People      : " + NUMBER_OF_PEOPLE);
                    System.out.println("Each pays   : " + INDIVIDUAL_SHARE);
                    System.out.println();
                }

                case MENU_EXIT -> {
                    running = false;
                }

                default -> {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    System.out.println();
                }
            }
        }

        // Step 5 - Goodbye and cleanup
        System.out.println("Goodbye! Thank you for using Splitwise Console Backend.");
        scanner.close();
    }
}