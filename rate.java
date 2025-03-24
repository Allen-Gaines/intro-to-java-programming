public class rate {

    public static void main(String[] args) 
    {
        
        //commision rate structure 
        double commRate;
        int netWidgetsSold = 100; 




        //if else structure 
        if  (netWidgetsSold >=0 or <=100 ) 
            commRate = .1;
        
        else if(netWidgetsSold >=101 and <=199 ) 
            commRate = .15; 
        else if (netWidgetsSold >=200 and <=299)
            commRate = .20;




        System.out.println(commRate);
    }
}