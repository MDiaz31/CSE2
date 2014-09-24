//Michael Diaz
//9.23.14
//IncomeTax Java
//The program prompts the user to give the value of their
//incomes by the thousand and tells them their tax
//
//
//
//
//import the scanner
import java.util.Scanner;

//define the class
public class CourseNumber                                         {


    //define main method
    public static void main (String [] args)                     {
        
        
        //define scanner
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        //ask the user for their input
        System.out.println("Enter the course number");
             if (myScanner.hasNextInt() )                       { 
              int courseNumber=myScanner.nextInt();
              if (courseNumber>0)                               {
              if (courseNumber>=186510 && courseNumber<=201440) {
                  
              //define necessary variables    
            int lastDigits;
            int semesterNumber;
            
            //store the last two digits entered by the user
            lastDigits=courseNumber%100;
           
            
            //program only works if the last two digits equal 40, 30, 20, or 10
            if ((lastDigits<=40) && (lastDigits%10==0))  {
            
            if (lastDigits==10) {
                
                System.out.print("This course was offered Spring Semester");
            }
            
            else if (lastDigits==20) {
                System.out.print("This course was offered Summer 1 Semester");
            }
                  
            else if (lastDigits==30) {
                System.out.print("This course was offered Summer 2 Semester");
            }
                  
            else if (lastDigits==40) {
                System.out.print("This course was offered Fall Semester");
            }
            
            int year=courseNumber/100;
    
                System.out.println(" of " +year);
                
              }//end if "last digits are 40,30,20,10"
              
              else {
                  System.out.println(courseNumber%100+ " is not a legitimate semester");
              }//end else 1
              
              
              }//end if range is okay
              
              else {
                  
                  System.out.println("The number was outside the range [186510,201440]");
              }//end else 2
                  
    
    
             
                     }//end if number entered was positive
    

    
             }//end if it was an int
    
        
        
     }//end main method
    
    
}//end class

    
    
    
    //over
    
