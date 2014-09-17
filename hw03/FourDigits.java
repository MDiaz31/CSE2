//Michael Diaz
//9.14.14.
//FourDigits Java
//The program takes a number with four decimals inputted by the user
//and returns just each individual digit of the four decimal digits inputted
//
//

//import the scanner
import java.util.Scanner;
//define a class
public class FourDigits {
    //define a main method
    public static void main (String [] args) {
        
        //define the scanner
        Scanner myScanner;
        myScanner=new Scanner (System.in);
    
        //print the line that lets the user put in the number with four decimal digits
        System.out.print ("Write a number with four decimal places here: ");
        double fourDigits = myScanner.nextDouble ( );
        
        //define fourNumbers which helps pull out each of the decimal digits
        int fourNumbers;
        fourNumbers=(int) (fourDigits*10000);
        
        //define variables for each of the digits the program is going to pull out
        int fourthDigit;
        int thirdDigit;
        int secondDigit;
        int firstDigit;
       
       
        //these are the functions on each of the digits that pull them out of the decimals
        //and identifies them as standalone numbers which is the goal of the program
        //divide by 10 to cut off the digits after they've been identified
        fourthDigit=fourNumbers%10;
        fourNumbers=fourNumbers/10;
        thirdDigit=fourNumbers%10;
        fourNumbers=fourNumbers/10;
        secondDigit=fourNumbers%10;
        fourNumbers=fourNumbers/10;
        firstDigit=fourNumbers%10;
        fourNumbers=fourNumbers/10;
        

        
        //print the results
        System.out.println("Here are the four numbers: "+ firstDigit + secondDigit + thirdDigit + fourthDigit);
        
        
        
   
   
    }//end method

    
    
}//end class

