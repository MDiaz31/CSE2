//Michael Diaz
//9.23.14
//Months Java
//The program prompts the user to give a number that corresponds
//with a month and then tells them the number of days
//in that month
//
//
//
//
//
//
// import scanner
import java.util.Scanner;

        //define class
        public class Months         {
        
            //define main method
            public static void main (String [] args)    {
            
                //define scanner
                Scanner myScanner;
                myScanner=new Scanner (System.in);
         
                //promt user to enter their num
                System.out.println("enter a number that corresponds with a month " );
                
                //only works if the number is a pos int
                      if (myScanner.hasNextInt() )                      { 
                int month=myScanner.nextInt();
                if (month>0 && month<=12)                {
               //each of these attaches a number value to a month of the year
                if (month==1)      {
                     
                     System.out.println("The number you entered corresponds with January");
                }
                     
                if (month==2)       {
              
                     System.out.println("The number you entered corresponds with February");
              
                }
        
                 if (month==3)       {
              
                     System.out.println("The number you entered corresponds with March");
              
                }
                    
                    if (month==4)       {
              
                     System.out.println("The number you entered corresponds with April");
              
                }
                    
                    if (month==5)       {
              
                     System.out.println("The number you entered corresponds with May");
              
                }
                    
                    if (month==6)       {
              
                     System.out.println("The number you entered corresponds with June");
              
                }
                    
                    if (month==7)       {
              
                     System.out.println("The number you entered corresponds with July");
              
                }
                    
                    if (month==8)       {
              
                     System.out.println("The number you entered corresponds with August");
              
                }
                    
                    
                    if (month==9)       {
              
                     System.out.println("The number you entered corresponds with September");
              
                }
                    
                    if (month==10)       {
              
                     System.out.println("The number you entered corresponds with October");
              
                }
                    
                    if (month==11)       {
              
                     System.out.println("The number you entered corresponds with November");
              
                }
                    
                    
                    if (month==12)       {
              
                     System.out.println("The number you entered corresponds with December");
              
                }
                    
                    
                    
                 //number of days per month
                 
                    if (month==1)      {
                     
                     System.out.println("There are 31 days this month");
                }
                     //february has a special sequence because of leap years
                    if (month==2)       {
              
              System.out.println("Enter the year" );
                    //need to know whether or not it was a leap year
              int year=myScanner.nextInt();
              
              year=(year%4);
              if (year==0)  {
                  
                  System.out.println("There are 29 days this month");
              }
              else  {
                     System.out.println("there are 28 days this month");
              }
                }
        
                    if (month==3)       {
              
                     System.out.println("There are 31 days this month");
              
                }
                    
                    if (month==4)       {
              
                     System.out.println("There are 30 days this month");
              
                }
                    
                    if (month==5)       {
              
                     System.out.println("There are 31 days this month");
              
                }
                    
                    if (month==6)       {
              
                     System.out.println("There are 30 days this month");
              
                }
                    
                    if (month==7)       {
              
                     System.out.println("There are 31 days this month");
              
                }
                    
                    if (month==8)       {
              
                     System.out.println("There are 31 days this month");
              
                }
                    
                    
                    if (month==9)       {
              
                     System.out.println("There are 30 days this month");
              
                }
                    
                    if (month==10)       {
              
                     System.out.println("There are 31 days this month");
              
                }
                    
                    if (month==11)       {
              
                     System.out.println("There are 30 days this month");
              
                }
                    
                    
                    if (month==12)       {
              
                     System.out.println("There are 30 days this month");
              
                }
                    
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                    
                }//end if 1
                
                else {
                    System.out.println("you didn't enter a number between one and twelve")
                }//end else 1
                
             }//end if 2
                 
                 
                 
                 
                 
                 
                 
                 
}//end method

}//end class

//over
