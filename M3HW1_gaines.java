import java.util.Scanner;

public class M3HW1_gaines 
{

    public static void main(String[] args) 
    {
        System.out.println("M3H1_gaines program");

        //decalare variables
        //declare integer quarter1, quarter2, quarter3,quarter4, annualWidgets
        //java code 
        int quarter1, quarter2, quarter3, quarter4, annualWidgets; 
        //Declare real Salesammount, salesTax, totalAmmount = 0
        //javacode 
        double salesAmmount, salesTax, totalAmmount;
        //constant real WIDGET_COST= 4.79
        //constant real TAX =.07
        //java code
        final double WIDGET_COST = 4.79;
        final double TAX =.07; 
        //declare a variable to get input from keyboard
        // used in conjuction with the import java.util.scanner command
        // to get input from the keyboard 
        //java code 
        Scanner keyboard = new Scanner(System.in);
        //input 
        //Display"Enter sales for quarter one: "
        //input quarter1
        //display "Enter sales for quarter two: "
        //input quarter two
        //display "Enter sales for quarter three: "
        //input quarter3
        //display "Enter sales for quarter four: "
        //input quarter4 
        //java code
        System.out.print("Enter sales for quarter one : ");
        quarter1 = keyboard.nextInt();
        System.out.print("Enter sales for quarter two : ");
        quarter2 = keyboard.nextInt();
        System.out.print("Enter sales for quarter three : ");
        quarter3 = keyboard.nextInt();
        System.out.print("Enter sales for quarter four : ");
        quarter4 = keyboard.nextInt();
        //calculations
        //set annualWidgets= quarter1 + quarter2 +  quarter3 + quarter4
        //sales salesAmmount = annualWidgets * WIDGETS_COST
        //set salesTAX = salesAmmount *TAX
        //set totalAmmount = salesTax + salesAmmount 
        //java code 
        annualWidgets = quarter1 + quarter2 + quarter3 + quarter4;
        salesAmmount = annualWidgets * WIDGET_COST; 
        salesTax = salesAmmount * TAX;
        totalAmmount = salesTax + salesAmmount;
        //output
        //display "Annual Widgets sold: ", annualWidgets
        //Display "Widgets sales Amount:", salesAmount
        //display "sales tax colected: ",salesTaxt
        //display "Total Amount: ", totalAmount 
        //java code 
        
        System.out.println("Anual Widgets sold: " + annualWidgets );
        System.out.println("Widgets sales Amount: " + salesAmmount);
        System.out.println("Sales Tax colected: " + salesTax);
        System.out.println("Total Amount: " + totalAmmount);
    }
}