//Michael Diaz
//9.14.14
//Root
//program two
//it'll take a number from the user, give a rough cube root of it, and the cube it
//all if it's rough because the program's going to estimate the value of a cube root
//
//
//
//import that scanner
import java.util.Scanner;
    
    //define the class
    public class Root       {
        
        //now main method
        public static void main (String [] args) {
            
            //define the scanner
            Scanner myScanner;
            myScanner = new Scanner ( System.in );
            
            //print the user's variable in a string when the program runs
            System.out.println("Enter a number to be cube rooted: ");
            double numberToCube=myScanner.nextInt();
            
            //define each of the guesses
            double guess = numberToCube/3;
            double secondGuess = ((guess*guess*guess)+numberToCube)/(3*(guess*guess));
            double thirdGuess = (2*(guess*guess*guess)+numberToCube)/(5*(guess*guess));
            double fourthGuess = (3*(guess*guess*guess)+numberToCube)/(9*(guess*guess));
           
            //print the fourth guess which should give a rough estimate of a cube root based on the user's inputted number
            System.out.println("The cube root is roughly " +fourthGuess);
            
            
            //to get the number back close to the original input, this cubes the cube root
            double cubedNumber = fourthGuess*fourthGuess*fourthGuess;
            System.out.println("That cube root cubed is " +cubedNumber);

            
            
            
                 
            
                    }
        
        
        
         }

