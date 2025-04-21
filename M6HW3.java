
import java.util.Scanner;

public class M6HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        final double BASE_SALARY = 500.00;
        final double COMMISSION_PER_WIDGET = 0.10;

        // Step 1: Get salesperson info and widget sales
        System.out.print("Enter salesperson's name: ");
        String salespersonName = input.nextLine();

        System.out.print("Enter total widgets sold: ");
        int widgetsSold = input.nextInt();

        System.out.print("Enter widgets returned: ");
        int widgetsReturned = input.nextInt();

        // Step 2: Calculate net sales and total commission
        int netWidgetsSold = widgetsSold - widgetsReturned;
        double commission = netWidgetsSold * COMMISSION_PER_WIDGET;
        double totalPay = BASE_SALARY + commission;

        // Step 3: Display the summary
        System.out.println("\n--- Commission Summary ---");
        System.out.println("Salesperson Name: " + salespersonName);
        System.out.println("Net Widgets Sold: " + netWidgetsSold);
        System.out.printf("Total Commission (including base): $%.2f%n", totalPay);

        input.close();
    }
}
