import java.util.Scanner;

public class M6HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get employee details
        System.out.print("Enter employee name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        // Step 2: Calculate gross pay (no overtime)
        double grossPay = payRate * hoursWorked;

        // Step 3: Display the results
        System.out.println("\n--- Employee Pay Summary ---");
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Pay Rate: $%.2f%n", payRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

        input.close();
    }
}
