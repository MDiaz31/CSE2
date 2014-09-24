//Michael Diaz
//9.23.14
//TimePadding.Java
//The program prompts the user to give the number of seconds
//that have passed during the day and tells them how much time has passed
//in hours, seconds, and minutes instead
//
//
//
//import the scanner
import java.util.Scanner;

//define the class
public class TimePadding                                       {
    //define main method
    public static void main (String [] args)                 {
        
        //define scanner
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        //ask the user for their input
        System.out.println("Enter the number of seconds that have passed today" );
    
             if (myScanner.hasNextInt() )                      { 
              int seconds=myScanner.nextInt();
              if (seconds>0)                               {
                  
                  
                  //define all necessary variables for conversion
                   int hours=seconds/3600;
                   int minutes=(seconds-hours*3600)/60;
                   int nSeconds=((seconds-hours*3600-minutes*60));
                  
                  
                    //if there is a single digit for any of the time increments
                    //the program needs to "pad" with a 0 so it prints like a clock would
                  if ((nSeconds<10) && (minutes<10)) {
                      System.out.print("Time is " +hours+ ":0");
                      System.out.print(+minutes+ ":0");
                      System.out.println(+nSeconds);
                  }
                  
                 else if ((nSeconds>10) && (minutes>10)) {
                      System.out.print("Time is " +hours+ ":");
                      System.out.print(+minutes+ ":");
                      System.out.println(+nSeconds);
                  
                 }
                  else if (nSeconds<10) {
                      System.out.print("Time is " +hours+ ":");
                      System.out.print(+minutes+ ":0");
                      System.out.println(+nSeconds);
                  }
             
                  else if (minutes<10) {
                      System.out.print("Time is " +hours+ ":0");
                      System.out.print(+minutes+ ":");
                      System.out.println(+nSeconds);
                  }
                  
                
        
              }//end if positive
              
              else {
                  System.out.println("not a positive number");
              }//end else 1
             }//end if integer
             else {
                 System.out.println("not an int");
             }//end else 2
    }//end method
}//end class



//over