import java.util.Scanner;

public class M6HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        final double BASE_FEE = 50.00;
        final double COST_PER_GALLON = 0.20;

        // Step 1: Get homeowner info and meter readings
        System.out.print("Enter homeowner's name: ");
        String homeownerName = input.nextLine();

        System.out.print("Enter previous month reading (gallons): ");
        int previousReading = input.nextInt();

        System.out.print("Enter current month reading (gallons): ");
        int currentReading = input.nextInt();

        // Step 2: Calculate water usage and charges
        int waterUsed = currentReading - previousReading;
        double waterCharge = waterUsed * COST_PER_GALLON;
        double totalBill = BASE_FEE + waterCharge;

        // Step 3: Display the bill summary
        System.out.println("\n--- Water Bill Summary ---");
        System.out.println("Homeowner's Name: " + homeownerName);
        System.out.println("Previous Reading: " + previousReading + " gallons");
        System.out.println("Current Reading: " + currentReading + " gallons");
        System.out.printf("Total Monthly Charge: $%.2f%n", totalBill);

        input.close();
    }
}
