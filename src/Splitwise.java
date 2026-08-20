public class Splitwise {
    public static void main(String[] args) {

        System.out.println("=== Splitwise Console Backend ===");
        System.out.println();

        final String EXPENSE_DESCRIPTION = "Dinner";
        final double TOTAL_AMOUNT = 1200.0;
        final int NUMBER_OF_PEOPLE = 4;

        double individualShare = TOTAL_AMOUNT / NUMBER_OF_PEOPLE;

        System.out.println("Expense description: " + EXPENSE_DESCRIPTION);
        System.out.println("Total amount: " + TOTAL_AMOUNT);
        System.out.println("Number of people: " + NUMBER_OF_PEOPLE);
        System.out.println("Each person should pay: " + individualShare);
        System.out.println();
        System.out.println("Feature status: Basic calculation completed.");
    }
}