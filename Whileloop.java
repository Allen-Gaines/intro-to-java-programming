import java.util.Scanner;

public class Whileloop 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);

        String Keep_going = "yes";

        while(Keep_going.equalsIgnoreCase("yes") )
        {   
            double  item5, total, tax, subtotal=0 ;
            System.out.print(" enter the number of Items: ");
            int num = k.nextInt();
            for(int i = 1; i <= num; i++)
        {
                System.out.println("Enter price of an item: "+ i +": ");
                item5 = k.nextDouble();
                subtotal = subtotal + item5; 


        }




        //subtotal = item1 + item2 + item3 + item4 + item5;

            tax = subtotal * 0.06;

            total = tax + subtotal;
        
             System.out.println(" The total is: " + total);

            System.out.println("do you wish to run again: (yes or no)");
            Keep_going = k.next();
            

        }
        System.out.println("Program has ended");
        k.close();
    }
}