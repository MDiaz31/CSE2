//Michael Diaz
//10.26.14
//Root Java
//The program prompts the user to enter a number then returns
//the square root
//
//
//
//import the scanner
import java.util.Scanner;

//define the class
public class Root                                         {


    //define main method
    public static void main (String [] args)                     {
        
        
        //define scanner
        Scanner input;
        input=new Scanner (System.in);
        
        
        //user enters input
        System.out.println("enter your number: ");
        
        //define necessary variables
        double min = 0;
        double yourNum = input.nextInt();
        double max = yourNum+1;
        double difference = max-min;
        double newMiddleValue=0;
        
      
       
        
        //set the tolerance
        while (difference>0.0000001*(1+yourNum))     {
            
            //half the value of the max if necessary to find root
            newMiddleValue=((max+min)/2);
            
            double highVal=newMiddleValue*newMiddleValue;
           
           
           //if the highest val is higher than your oritinal num
           //go into this process to make the max your new middle to get
           //closer to the sqrt
            if (highVal>=yourNum)
            {
            
            max=newMiddleValue;
            
            
            }
            
            
            //change the minimum to the new middle value to
            //get close to the sqrt from the bottom end of
            //the spectrum
            
            else if (highVal<yourNum)
            
            min = newMiddleValue;


            
            {   
                
        
        //set var difference to maximum-minimum values
        difference=max-min;
        
        
        
        
            
            
  
            
            
            
            
            }//end else if
        
       
        }//end tolerance loop
        //print the new middle value which should be the sqrt
        System.out.println(newMiddleValue);
        
    }//end method
}//end class
