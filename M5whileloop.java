import java.util.Scanner;

public class M5whileloop 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);

        String Keep_going = "yes";

        while(Keep_going.equalsIgnoreCase("yes") )
        {
            System.out.println(" My name is Allen Gaines ");

            System.out.println("do you wish to run again: (yes or no)");
            Keep_going = k.next();
            

        }
        System.out.println("Program has ended");
        k.close();
    }
}