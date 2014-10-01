//Michael Diaz
//9.30.14
//Burger King Java
//The program promts the user to ask for burgers, fries, or a soda
//then asks what kind of burger, fries, or soda they'd like
//
//
//
//import scanner
import java.util.Scanner;

//import class
public class BurgerKing                                    {

    //define main method
    public static void main (String [] args)                 {
        
        //define scanenr
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        //print the question to ask the user
        System.out.println("Enter the first letter of the food you want (B,b for burger, S,s for soda, or F,f for fries");
        
    
                //ask the user for their response8
                char food=myScanner.next().charAt(0);
                
                //switch statement for all the food options
                switch (food)           {
                
                //if its b, print out that they asked for a burger
                case 'b':
                System.out.println("You asked for a burger, enter A,a for all the fixings, C,c for cheese, or N,n for none of the above");
                    
                    //second scan for their toppings if they pick burger
                    char toppings=myScanner.next().charAt(0);
                    
                    //switch for each option of topping
                    switch (toppings)   {
                    
                    //a, A is all, c,C is cheese, n, N is nothing
                    case 'a':
                    System.out.println("you asked for a burger with all the fixings");
                    break;
                    
                    case 'A':
                    System.out.println("you asked for a burger with all the fixings");
                    break;
                      
                      
                    case 'c':  
                    System.out.println("you asked for a burger with cheese");
                    break;
                    
                    case 'C':
                    System.out.println("you asked for a burger with cheese");
                    break;
                      
                    case 'n':  
                    System.out.println("you asked for a burger with nothing on it");
                    break;
                    
                    case 'N':  
                    System.out.println("you asked for a burger with nothing on it");
                    break;
                   
                    default: System.out.println("Sorry, not a valid input");
                   
                    }
                
                break;//end the switch
                
                //repeat the exact same things as above except for capital B rather than lower case
                case 'B':
                System.out.println("You asked for a burger, enter A,a for all the fixings, C,c for cheese, or N,n for none of the above");
              
              
              
                  toppings=myScanner.next().charAt(0);
                
                    switch (toppings)   {
    
                    case 'a':
                    System.out.println("you asked for a burger with all the fixings");
                    break;
                    
                    case 'A':
                    System.out.println("you asked for a burger with all the fixings");
                    break;
                      
                    case 'c':  
                    System.out.println("you asked for a burger with cheese");
                    break;
                    
                    case 'C':
                    System.out.println("you asked for a burger with cheese");
                    break;
                      
                    case 'n':  
                    System.out.println("you asked for a burger with nothing on it");
                    break;
                    
                    case 'N':  
                    System.out.println("you asked for a burger with nothing on it");
                    break;
                //if they didnt answer with an appriate letter it gives an error
                    default: System.out.println("Sorry, not a valid input");
               
               
                    }
               
                break;//end second switch
                
                
                //if they enter s, give them a soda
                case 's': 
                System.out.println("you asked for a soda, enter P,p for pepsi, C,c for Coke, S,s for Sprite, or M,m for Mountain Dew");
                
                    //find out what kind they want
                    char sodaType=myScanner.next().charAt(0);
                    switch (sodaType)   {
                    
                    //pepsi
                    case 'p': 
                    System.out.println("you asked for a pepsi");
                    break;
                    
                    case 'P': 
                    System.out.println("you asked for a pepsi");
                    break;
                    //coke
                    case 'c': 
                    System.out.println("you asked for a coke");
                    break;
                    
                    case 'C': 
                    System.out.println("you asked for a coke");
                    break;
                    //sprite
                    case 's': 
                    System.out.println("you asked for a sprite");
                    break;
                    
                    case 'S': 
                    System.out.println("you asked for a sprite");
                    break;
                    //mountain dew
                    case 'm': 
                    System.out.println("you asked for a mountain dew");
                    break;
                    
                    case 'M': 
                    System.out.println("you asked for a mountain dew");
                    break;
                    
                    //if they didnt answer with an appriate letter it gives an error
                    default: System.out.println("Sorry, not a valid input");
                   
                    }
                
                break;//end switch
                
                //same stuff as above but for capital S instead
                case 'S':
                System.out.println("you asked for a soda, enter P,p for pepsi, C,c for Coke, S,s for Sprite, or M,m for Mountain Dew");
                
                
                    sodaType=myScanner.next().charAt(0);
                   
                    switch (sodaType)   {
                
                    case 'p': 
                    System.out.println("you asked for a pepsi");
                    break;
                    
                    case 'P': 
                    System.out.println("you asked for a pepsi");
                    break;
                    
                    case 'c': 
                    System.out.println("you asked for a coke");
                    break;
                    
                    case 'C': 
                    System.out.println("you asked for a coke");
                    break;
                    
                    case 's': 
                    System.out.println("you asked for a sprite");
                    break;
                    
                    case 'S': 
                    System.out.println("you asked for a sprite");
                    break;
                    
                    case 'm': 
                    System.out.println("you asked for a mountain dew");
                    break;
                    
                    case 'M': 
                    System.out.println("you asked for a mountain dew");
                    break;
                    
                    default: System.out.println("Sorry, not a valid input");
                
                    }
                
                
                break;//end if
                
                //if they put in f, give them fries
                case 'f':
                System.out.println("you asked for fries, enter L,l for large or S,s for small:");
               
                    //ask if they want small or large
                    char friesType=myScanner.next().charAt(0);
                    switch (friesType)      {
                    
                    case 'l': 
                    System.out.println("you asked for a large fries");
                    break;
                   
                    case 'L': 
                    System.out.println("you asked for a large fries");
                    break;
                    
                    case 's': 
                    System.out.println("you asked for a small fries");
                    break;
                    
                    case 'S': 
                    System.out.println("you asked for a small fries");
                    break;
                 
                    //if they didnt answer with an appriate letter it gives an error
                    default: System.out.println("Sorry, not a valid input");
                   
                    }
                
                
                break;//end switch
                
                
                //same stuff as above but for a capital F
                case 'F':
                System.out.println("you asked for fries, enter L,l for large or S,s for small:");
                
                    friesType=myScanner.next().charAt(0);
                    
                    switch (friesType)  {
                
                    
                    case 'l': 
                    System.out.println("you asked for a large fries");
                    break;
                   
                    case 'L': 
                    System.out.println("you asked for a large fries");
                    break;
                    
                    case 's': 
                    System.out.println("you asked for a small fries");
                    break;
                    
                    case 'S': 
                    System.out.println("you asked for a small fries");
                    break;
                   
                    default: System.out.println("Sorry, not a valid input");
                   
                    }
                
                break;//end switch
                
                
                    //if they didnt answer with an appriate letter it gives an error
                    default: System.out.println("Sorry, not a valid input");
                    
                    
                    
                }//end the very first swtich
    }//end main method
    
    
}//end class



