//Michael Diaz
//10.10.14
//Root Java
//The program prompts the user to give the value of their
//incomes by the thousand and tells them their tax
//
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
        
        
        
        System.out.println("enter your number: ");
        
        double min = 0;
        double yourNum = input.nextInt();
        double max = yourNum+1;
        double difference = max-min;
        double newMiddleValue=0;
        
      
       
        
        
        while (difference>0.0000001*(1+yourNum))     {
            
            
            newMiddleValue=((max+min)/2);
            
            double highVal=newMiddleValue*newMiddleValue;
           
           
           
            if (highVal>=yourNum)
            {
            
            max=newMiddleValue;
            
            
            }
            
            else if (highVal<yourNum)
            
            min = newMiddleValue;


            
            {   
                
        
        difference=max-min;
        
        
        
        
            
            
  
            
            
            
            
            }
        
       
        }
        System.out.println(newMiddleValue);
        
    }
}
