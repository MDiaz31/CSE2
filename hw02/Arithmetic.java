//Michael Diaz
//
//
//
//
//
//define a class
public class Arithmetic {

    //add main method
    public static void main(String [] args)     {
        
 
        
        //number of pairs of socks
        int nSocks=3;
        //cost per pair
        //$ is part of the variable name
        double sockCost$=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        //define variables for total cost and tax on socks
        double totalSockCost; 
        double sockTax;
     

        //define variables for total cost and tax on glasses
        double totalGlassCost;
        double glassTax;
        
        //define variables for total cost and tax on envelopes
        double totalEnvelopeCost;
        double envelopeTax;
        

        
        //calculate total cost and tax for socks
        totalSockCost=nSocks*sockCost$;
        sockTax=totalSockCost*taxPercent;
       
        //convert to two decimal places
        sockTax=sockTax*100;
        sockTax=(int)sockTax;
        sockTax=sockTax/100;
       
        //calculate total cost and tax for glass
        totalGlassCost=nGlasses*glassCost$;
        glassTax=totalGlassCost*taxPercent;
        
        //convert to two decimal places
        glassTax=glassTax*100;
        glassTax=(int)glassTax;
        glassTax=glassTax/100;
        
        //calculate total cost and tax for envelopes
        totalEnvelopeCost=nEnvelopes*envelopeCost$;
        envelopeTax=envelopeCost$*taxPercent;
        
        //convert to two decimal places
        envelopeTax=envelopeTax*100;
        envelopeTax=(int)envelopeTax;
        envelopeTax=envelopeTax/100;
        
        
        //print out each of the calculations
        System.out.println("Total cost of socks was "+(totalSockCost)+" dollars");
        System.out.println("Total tax on socks was "+(sockTax)+ " dollars");

        System.out.println("Total cost of glasses was "+totalGlassCost+" dollars");
        System.out.println("Total tax on glasses was "+glassTax+" dollars");
        
        System.out.println("Total cost of envelopes was "+totalEnvelopeCost+" dollars");
        System.out.println("Total tax on envelopes was "+envelopeTax+" dollars");
        
        
        
        
        //calculate total price for everything
        //define a new variable for the whole price first
        double totalPrice;
        totalPrice=totalEnvelopeCost+totalGlassCost+totalSockCost;
        
        //convert to two decimal places
        totalPrice=totalPrice*100;
        totalPrice=(int)totalPrice;
        totalPrice=totalPrice/100;
        
        System.out.println("The total price of everything purchased wass " +totalPrice+ " dollars");
        
        //calculate the total price for everything with tax
        //define a new variable for total price with tax first
        
     
        double totalAfterTax;
        
        //convert to two decimal places
        totalAfterTax=totalPrice+((totalPrice*taxPercent));
        totalAfterTax=totalAfterTax*100;
        totalAfterTax=(int)totalAfterTax;
        totalAfterTax=totalAfterTax/100;
        
        
        //print final computation
        System.out.println("The total price after tax was " +(totalAfterTax+ " dollars"));
        
        
        

        

        
        
        
        
        
        
    }
    
}
