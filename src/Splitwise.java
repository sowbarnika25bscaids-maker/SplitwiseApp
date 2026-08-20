import java.util.Scanner;
public class Splitwise {
    public static void main(String[] args) {

        // Recording 1 expense data
        String expenseDescription = "Dinner";
        double totalAmount = 1200.0;
        int numberOfPeople = 4;

        double individualShare = totalAmount / numberOfPeople;

        // Menu constants
        final int MENU_ADD_EXPENSE = 1;
        final int MENU_VIEW_EXPENSES = 2;
        final int MENU_EXIT = 3;

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Menu loop
        while (running) {

            System.out.println("=== Splitwise Console Backend ===");
            System.out.println("1. Add expense");
            System.out.println("2. View expenses");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {

                case MENU_ADD_EXPENSE:
                    System.out.println("Expense recorded: " + expenseDescription
                            + " | amount=" + totalAmount
                            + " | people=" + numberOfPeople);
                    System.out.println();
                    break;

                case MENU_VIEW_EXPENSES:
                    System.out.println("--- Expense Summary ---");
                    System.out.println("Description : " + expenseDescription);
                    System.out.println("Total amount: " + totalAmount);
                    System.out.println("People      : " + numberOfPeople);
                    System.out.println("Each pays   : " + individualShare);
                    System.out.println();
                    break;

                case MENU_EXIT:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    System.out.println();
            }
        }

        System.out.println("Goodbye! Thank you for using Splitwise Console Backend.");

        scanner.close();
    }
}