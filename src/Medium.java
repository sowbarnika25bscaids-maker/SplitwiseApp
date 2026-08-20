public class Medium {
    public static void main(String[] args) {

        // Medium 1
        byte byteValue = 100;
        short shortValue = 1000;
        int intValue = 100000;

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);

        // byte range: -128 to 127
        // short range: -32,768 to 32,767
        // int range: -2,147,483,648 to 2,147,483,647

        System.out.println();

        // Medium 2
        long largeValue = 9_000_000_000L;

        System.out.println("Long value: " + largeValue);

        // int is insufficient because its maximum value is 2,147,483,647.

        System.out.println();

        // Medium 3
        byte castedValue = (byte) 300;

        System.out.println("300 cast to byte: " + castedValue);

        System.out.println();

        // Medium 4
        int number;
        double amount;
        String expenseName;

        number = 10;
        amount = 500.0;
        expenseName = "Dinner";

        System.out.println("Number: " + number);
        System.out.println("Amount: " + amount);
        System.out.println("Expense: " + expenseName);

        System.out.println();

        // Medium 5
        // Expense details
        String expenseDescription = "Dinner";
        double totalAmount = 1200.0;
        int numberOfPeople = 4;

        // Calculate individual share
        double individualShare = totalAmount / numberOfPeople;

        // Print heading
        System.out.println("=== Splitwise Console Backend ===");
        System.out.println();

        // Print expense summary
        System.out.println("Expense description: " + expenseDescription);
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Each person should pay: " + individualShare);
        System.out.println();

        // Print feature status
        System.out.println("Feature status: Basic calculation completed.");
    }
}