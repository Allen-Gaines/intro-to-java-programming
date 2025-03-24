
public class rate2 {

    public static void main(String[] args) 
    {
        
        //commision rate structure 
        double commRate;
        int netWidgetsSold = 105; 




        //if else structure 
        if (netWidgetsSold >=0 && netWidgetsSold <=100 ) 
            commRate = .1;
        
        else if(netWidgetsSold <=199 ) 
            commRate = .15; 
        else if (netWidgetsSold <=299)
            commRate = .20;
        else 
            commRate = .25;
        



        System.out.println(commRate);
    }
}