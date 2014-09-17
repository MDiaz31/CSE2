//Michael Diaz
//September 3
//CSE2


//program should: 
//print the number of minutes per trip
//print the number of counts per trip
//print the distance of each trip in miles
//print the distance for the two trips combined


//define a class
public class Cyclometer {

    //main method
    public static void main(String[] args) {
        
        //input data
        int secsTrip1=480;    //number of seconds for trip 1
        int secsTrip2=3220;   //number of seconds for trip 2
        int countsTrip1=1561; //number of wheel rotations on trip 1
        int countsTrip2=9037; //number of wheel rotations on trip 2
        
        
        //variables and output data
        double wheelDiameter=27.0; // define wheel diameter
        double PI=3.14159;                // define pi (for diameter of the wheel)
        double feetPerMile=5280;          // define number of feet per mile
        double inchesPerFoot=12;          // define number of inches per foot
        double secondsPerMinute=60;       // define number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //define the distance for each trip individually and both combined
        
        
        
        System.out.println("Trip 1 took "+ 
        (secsTrip1/secondsPerMinute) +" minutes and had "+ 
        countsTrip1+" counts.");
        
        System.out.println("Trip 2 took "+ 
        (secsTrip2/secondsPerMinute)+" minutes and had "+ 
        countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        
        
        //compute
        
        //calculate each of the distance with the previously defined values 
        //(of inches, feet, miles)
        
        distanceTrip1 = distanceTrip1 / (inchesPerFoot*feetPerMile); //want to compute the disance 
                                                  //in miles so:
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        
        totalDistance=distanceTrip1+distanceTrip2;
        //now, print the output data
        
        System.out.println("Trip1 was "+distanceTrip1+" miles");
        System.out.println("Trip2 was "+distanceTrip2+" miles");
        System.out.println("The total distances was "+totalDistance+" miles");
        
        
        
        
    }   //main method required for every Java Program

}   //end of main method


