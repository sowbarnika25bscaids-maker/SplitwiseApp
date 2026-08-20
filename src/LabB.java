public class LabB {
    public static void main(String[] args) {

        final double TAX_RATE = 0.18;
        double amount = 1000.0;

        double tax = amount * TAX_RATE;

        System.out.println("Tax: " + tax);

        // TAX_RATE = 0.20; // Compile error
    }
}