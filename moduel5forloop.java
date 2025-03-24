import java.util.Scanner;

public class moduel5forloop 
{

    public static void main(String[] args) 
    { 
        
        Scanner k = new Scanner(System.in);
        
        double  item5, total, tax, subtotal=0 ;
        /* 
        System.out.println("Enter price of an item: ");
        item1 = k.nextDouble();
        System.out.println("Enter price of an item: ");
        item2 = k.nextDouble();
        System.out.println("Enter price of an item: ");
        item3 = k.nextDouble();
        System.out.println("Enter price of an item: ");
        item4 = k.nextDouble();
        System.out.println("Enter price of an item: ");
        item5 = k.nextDouble();
        */
        System.out.print(" enter the number of Items: ");
        int num = k.nextInt();
        for(int i = 0; i < num; i++)
        {
            System.out.println("Enter price of an item: "+ i +": ");
            item5 = k.nextDouble();
            subtotal = subtotal + item5; 


        }




        //subtotal = item1 + item2 + item3 + item4 + item5;

        tax = subtotal * 0.06;

        total = tax + subtotal;
        
        System.out.println(" The total is: " + total);












        k.close();
        
        


    }
}