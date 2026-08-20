public class Easy {
    public static void main(String[] args) {

        // Easy 1
        String expenseDescription = "Lunch";
        double totalAmount = 800.0;
        int numberOfPeople = 5;

        double individualShare = totalAmount / numberOfPeople;

        System.out.println("Expense description: " + expenseDescription);
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Updated share: " + individualShare);

        System.out.println();

        // Easy 2
        final String APP_VERSION = "0.1";

        System.out.println("=== Splitwise Console Backend ===");
        System.out.println("App Version: " + APP_VERSION);

        System.out.println();

        // Easy 3
        boolean isActive = true;

        System.out.println("App active: " + isActive);
    }
}