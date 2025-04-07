// Allen Gaines

// M4HW1

// 03/17/2025

// A program that processes commission rates 

import java.util.Scanner;



public class M4H1_GainesAllen {

    


    public static void main(String[] args) 
    {
        //commision rate structure 
        int widgetsSold = 0;
        int returnWidgets = 0;
        int basesalary = 2000;
        double commRate;
        int count; 
        int numofweeks = 4; 
        double WIGITSOLDAMMOUNT = 4.79;
        String keepgoing = "y"; 
        int netWidgetsSold = widgetsSold - returnWidgets; 
        for ( count= 1; count <= numofweeks; count++)
        { 
            Scanner sold = new Scanner(System.in);
            System.out.print("Enter the number of widgets sold: " );
            widgetsSold = sold.nextInt();
            
        }
        for ( count= 1; count <= numofweeks; count++)
        {
            Scanner sold = new Scanner(System.in);
            System.out.print("Enter the number of returns: ");
            returnWidgets = sold.nextInt();

       
        }
       
        
       

        





        //if else structure 
        if (netWidgetsSold >=0 && netWidgetsSold <=100 ) 
            commRate = .1;
        
        else if(netWidgetsSold <=199 ) 
            commRate = .15; 
        else if (netWidgetsSold <=299)
            commRate = .20;
        else 
            commRate = .25;
        double widgetSaleAmmount = netWidgetsSold *WIGITSOLDAMMOUNT;
        double commAmmount = commRate * widgetSaleAmmount ;
        double Monthlysalary =commAmmount + basesalary;
        
        


        System.out.println("Sales person: Allen Gaines");
        System.out.println("net witdets sold:" + netWidgetsSold);
        System.out.println("widget sales ammount: " + widgetSaleAmmount);
        System.out.println("commision ammount: " +commAmmount);
        
        System.out.println("monthly salary: " + Monthlysalary);

        while (keepgoing.equals("y"));
        {
            System.out.println("thank you for using this program");
        }
        

    }

}