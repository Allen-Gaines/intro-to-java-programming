
import java.io.*;
import java.util.Scanner;

// By implementing Serializable interface
// we make sure that state of instances of class DogStepTracker
// can be saved in a file.
class DogStepTracker implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int steps;
    String dogName;
    String owner; 
    String breed; 

    // DogStepTracker class constructor
    public DogStepTracker(int steps, String dogName, String owner, String breed){
        this.steps = steps;
        this.dogName = dogName;
        this.owner = owner;
        this.breed = breed;  
        
    }
}

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner Scanner = new Scanner(System.in);
       
        System.out.println("Enter the number of steps: ");
        int steps = Scanner.nextInt();
        Scanner.nextLine();
        
        System.out.println("Enter the dogs name: ");
        String dogName = Scanner.next();
        Scanner.nextLine();

        System.out.println("Enter the number of breed: ");
        String breed = Scanner.next();
        Scanner.nextLine();

        System.out.println("Enter the number of owner: ");
        String owner = Scanner.next();
        Scanner.nextLine();

        Scanner.close();
        
        DogStepTracker tracker = new DogStepTracker(steps, dogName, breed, owner);
        

        

        // Serializing 'tracker'
        FileOutputStream fos = new FileOutputStream("dog_tracker.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tracker);

        // De-serializing 'tracker'
        FileInputStream fis = new FileInputStream("dog_tracker.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogStepTracker deserializedTracker = (DogStepTracker) ois.readObject(); // down-casting object

        System.out.println("Dog Name: " + dogName + ", Steps: " + steps);
        System.out.println("owner: " + owner);
        System.out.println("Breed: " + breed);
        // closing streams
        oos.close();
        ois.close();
    }
}

