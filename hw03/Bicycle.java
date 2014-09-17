//Michael Diaz
//9.12.14
//first program: Bicycle
//looking to solve distance traveled and avg miles per hour





//import the scanner
import java.util.Scanner;

//define class
public class Bicycle {
    
    //main method
    public static void main (String[] args) {

        //def scanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        
        //define each of the variables the program will need
        double PI = 3.14159;
        int inches=1;
        int inchesPerFoot=12;
        int feetPerMile=5280;
        int secondsPerMinute=60;
        int minutesPerHour=60;
        int wheelDiameter=27;
        

        //print out the line where the user will input the count
        System.out.println("Enter count number here: ");
        double count=myScanner.nextInt();
        
        //print out the line where the user will input the seconds
        System.out.println("Enter seconds number here: ");
        double seconds=myScanner.nextInt();
        
        
        //define calculations the program will need to define distance and time
        double totalDistance = (PI*wheelDiameter*count)/(inchesPerFoot*feetPerMile);
        double totalTime = (seconds/secondsPerMinute);
        
        //round by casting
        totalDistance=totalDistance*100;
        totalDistance=(int) totalDistance;
        totalDistance=totalDistance/100;
        
        
        //print out the final calculation for distance and time
        System.out.println("The distance was " +totalDistance+ " and the time was " +totalTime);
        
        
        //define variables to help calculate avg MPH
        double secondsPerHour=(secondsPerMinute*minutesPerHour);
        double averageMPH=totalDistance/(seconds/secondsPerHour);
        
        
        //round
        averageMPH=averageMPH*100;
        averageMPH=(int)averageMPH;
        averageMPH=averageMPH/100;
        
        
        //print out the average miles per hour based on previous variable definitions and calculations
        System.out.println("The average Miles Per Hour is: " +averageMPH);

        
        
        
        
       
      
        
                }//end method



     }//end class

