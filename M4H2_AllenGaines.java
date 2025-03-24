import java.util.Scanner;

public class M4H2_AllenGaines {

    public static void main(String[] args) {
       int Age;
       int Livedin;
       String results = null;
       Boolean citzen; 
       Boolean felon;
       

        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is your age: ");
        Age = keyboard.nextInt(); 

        System.out.println("how many days have you lived in state: ");
    
        Livedin = keyboard.nextInt();

        System.out.println("Are serving a felony sentence or probabtion: (true ot false) ");
         felon = keyboard.nextBoolean();

        System.out.println("are you a us citizen true or false; ");
        citzen = keyboard.nextBoolean();

    
        if (Age >= 18){
            if ( Livedin > 30){
                if (!felon)
                    if (!citzen){
                                  System.out.println(" you are elegable to vote");
                            }
                    else { 
                           System.out.println("You cannot vote");
                         }
        else { 
                System.out.println("You cannot vote");
             }
                              }
                            }
                        }
                    }

        /*else if (citizen = 1){
            results = " you can vote";
        }
        else if (citizen = 2){
            results = " you cannot vote";
        }
            */
       


        
       



       

    
