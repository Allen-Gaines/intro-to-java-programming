import java.util.Scanner;

public class M5HW1_GAines {

    public static void main(String[] args) 
    {
        String keepgoing = "y"; 
        double sum = 0;
        double average;
        char grade;
        double num;
        Scanner k = new Scanner(System.in);
        int count;

        //System.out.println("How many grades do you want in: ");
        //int numofGrades=k.nextInt();
        
        
    
    do{
        System.out.println("How many grades do you want in: ");
        int numofGrades=k.nextInt();
        
            
        
        for ( count= 1; count <= numofGrades; count++){
            System.out.println("Enter Grade"+ count+ ": ");
            num = k.nextDouble();
            while (num < 0 || num > 100 ) {
                System.out.println("invalid imput ");
                System.out.println("Enter Grade"+ count+ ": ");
                num = k.nextDouble();
                
            }
            sum +=num;
             average = sum / numofGrades; 
             if (average >= 90)
             {
                 grade = 'A';
             }
         else if (average >= 80)
             {
                 grade = 'B';
             }
         else if (average >= 70)
             {
                 grade = 'C';
             }
         else if (average >= 60)
             {
                 grade = 'D';
             }
         else
             {
                 grade = 'F';
             }    
             System.out.println("Grade is " + grade );
                }
            
            System.out.println("Do you want to enter another set of grades? (y/n)");
            keepgoing = k.next();
            
    }


        while (keepgoing.equals("y"));
        {
            System.out.println("thank you for using this program");
        }
        
            
        
        
    

    
            
        
    }
}


