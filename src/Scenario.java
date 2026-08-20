public class Scenario {
    public static void main(String[] args) {

        // Scenario 1 - Expense share with remainder awareness
        double totalAmount = 1000.0;
        int numberOfPeople = 3;

        double individualShare = totalAmount / numberOfPeople;

        System.out.println("=== Scenario 1 ===");
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Each person should pay: " + individualShare);

        // Double cannot always represent decimal values exactly,
        // so some monetary calculations may produce small floating-point errors.

        System.out.println();

        // Scenario 2 - Constants refactor
        final String HEADING = "=== Splitwise Console Backend ===";
        final String STATUS_MESSAGE = "Feature status: Basic calculation completed.";

        String expenseDescription = "Dinner";
        double splitwiseAmount = 1200.0;
        int splitwisePeople = 4;

        double splitwiseShare = splitwiseAmount / splitwisePeople;

        System.out.println(HEADING);
        System.out.println();

        System.out.println("Expense description: " + expenseDescription);
        System.out.println("Total amount: " + splitwiseAmount);
        System.out.println("Number of people: " + splitwisePeople);
        System.out.println("Each person should pay: " + splitwiseShare);
        System.out.println();

        System.out.println(STATUS_MESSAGE);
    }
}