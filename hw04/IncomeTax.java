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

//define class
public class IncomeTax                                       {

    //define main method
    public static void main (String [] args)                 {
        
        //define the scanner
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        
        //define all the variables
        double firstBracketRate=.14;
        double secondBracketRate=.12;
        double thirdBracketRate=.07;
        double fourthBracketRate=.04;
                      
        //prompt the user to enter their number
        System.out.println("Enter an int that represents the number of thousands of dollars of your income: " );
         
         
         //only works if its positive;also multiples their number by 1000 to get their actual income
          if (myScanner.hasNextInt() )                      { 
                int income=myScanner.nextInt()*1000;
                if (income>0)                               {
                                         { 
                
         //print the income       
        System.out.println("Your income then is: " +income);
        
        
        //if the income is over 78000 use these functions
        if (income>=78000)   { 
            
        
        double firstBracketTwoDigitDec=income*firstBracketRate;
        
        firstBracketTwoDigitDec=firstBracketTwoDigitDec*100;
        firstBracketTwoDigitDec=(int)firstBracketTwoDigitDec;
        firstBracketTwoDigitDec=firstBracketTwoDigitDec/100;
        
        System.out.println("Based on that, your tax rate is fourteen percent and you need to pay " +firstBracketTwoDigitDec+ " in tax" );
        
                            }
        //if its between these two values use these functions
        if (income>=40000 && income<78000)   {
          
            
            
        double secondBracketTwoDigitDec=income*secondBracketRate;
        
        secondBracketTwoDigitDec=secondBracketTwoDigitDec*100;
        secondBracketTwoDigitDec=(int)secondBracketTwoDigitDec;
        secondBracketTwoDigitDec=secondBracketTwoDigitDec/100;
             
        System.out.println("Based on that, your tax rate is twelve percent and you need to pay " +secondBracketTwoDigitDec+ " in tax" );
            
            
                     
                                         }
        
         //if its between these two values use these funcs    
        if (income>=20000 && income<40000)   {
          
            
       
        double thirdBracketTwoDigitDec=income*thirdBracketRate;
        
        thirdBracketTwoDigitDec=thirdBracketTwoDigitDec*100;
        thirdBracketTwoDigitDec=(int)thirdBracketTwoDigitDec;
        thirdBracketTwoDigitDec=thirdBracketTwoDigitDec/100;
            
        System.out.println("Based on that, your tax rate is seven percent and you need to pay " +thirdBracketTwoDigitDec+ " in tax" );
         
                                            }
        //if its below 20000 use these functions
        if (income<20000)   {
          
            
        double fourthBracketTwoDigitDec=income*fourthBracketRate;
        
        fourthBracketTwoDigitDec=fourthBracketTwoDigitDec*100;
        fourthBracketTwoDigitDec=(int)fourthBracketTwoDigitDec;
        fourthBracketTwoDigitDec=fourthBracketTwoDigitDec/100;
            
        System.out.println("Based on that, your tax rate is four percent and you need to pay " +fourthBracketTwoDigitDec+ " in tax" );
        
                                            }//end if 1
        
        
        
        
        
                     }//end if 2
                }//end if 3
                
                
                else {
                    System.out.print("you entered a value less than 0");
                    
                    
                }//end else 1
                
            }//end if 4
            
            else{
                System.out.println("you didn't enter an integer");
            }//end else 2
            
        }//end method
    }//end class
    
    
    
    //over