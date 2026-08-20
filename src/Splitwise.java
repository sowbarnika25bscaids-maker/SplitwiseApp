public class Splitwise {
    public static void main(String[] args) {

        System.out.println("=== Splitwise Console Backend ===");
        System.out.println();

        String expenseDescription = "Dinner";
        double totalAmount = 1200.0;
        int numberOfPeople = 4;

        double individualShare = totalAmount / numberOfPeople;

        System.out.println("Expense description: " + expenseDescription);
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Each person should pay: " + individualShare);
        System.out.println();

        System.out.println("Feature status: Basic calculation completed.");
    }
}