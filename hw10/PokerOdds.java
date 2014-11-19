//Michael Diaz
//November 18
//hw10
//
//
//
//
//
//
//
//
//import random
import java.util.Random;
//import scanner
import java.util.Scanner;
  //define class
  public class PokerOdds{
    //showHands method
    public static int[] showHands(){
      Scanner input = new Scanner(System.in);
      
      String string="";
      //huge do while loop to promt the user if they want to go
      //again after the first run
      //!!!!!do{
      //define the deck
      int [] deck = new int [52];
      //define the hand
      int [] hand = new int [5]; 
          //as long as i is less than the length of the array run the loop
          for (int i=0; i<deck.length; i++){
              deck [i] = i+1;
          }
          //replace drawn cards with -1's
          for (int n=0; n<5; n++){
              hand [n]=-1;
          }  
          //draws a card at random then makes the deck smaller as 
          //each card is drawn to the hand
          for (int x=0; x<5; x++){
              int randomCard = (int)(Math.random()*(52-x));
              hand[x]=deck[randomCard];
              deck[randomCard]=deck[51-x];
              deck[51-x]=-1;
          }
          
              //designate a quarter of the deck to clubs, define
              //queens, kings, jacks
              System.out.print("Clubs: ");
              for (int u=0; u<5; u++){
              if (hand[u]/13==0){
                if (hand[u]%13+1==11){
                System.out.print("J ");
                }
                else if (hand[u]%13+1==12){
                System.out.print("Q ");
                }  
                else if (hand[u]%13+1==13){
                System.out.print("K ");
                } 
                else{
                System.out.print(hand[u]%13+1+" ");
                }
              }
            }
            System.out.println();
            //same as above but with diamonds instead
            System.out.print("Diamonds: ");
              for (int u=0; u<5; u++){
              if (hand[u]/13==1){
                if (hand[u]%13+1==11){
                System.out.print("J ");
                }
                else if (hand[u]%13+1==12){
                System.out.print("Q ");
                }  
                else if (hand[u]%13+1==13){
                System.out.print("K ");
                } 
                else{
                System.out.print(hand[u]%13+1+" ");
                }
              }
            }
            System.out.println();
            //hearts this time
            System.out.print("Hearts: ");
              for (int u=0; u<5; u++){
              if (hand[u]/13==2){
                if (hand[u]%13+1==11){
                System.out.print("J ");
                }
                else if (hand[u]%13+1==12){
                System.out.print("Q ");
                }  
                else if (hand[u]%13+1==13){
                System.out.print("K ");
                } 
                else{
                System.out.print(hand[u]%13+1+" ");
                }
              }
            }
            System.out.println();
            //and spades
            System.out.print("Spade: ");
              for (int u=0; u<5; u++){
              if (hand[u]/13==3){
                if (hand[u]%13+1==11){
                System.out.print("J ");
                }
                else if (hand[u]%13+1==12){
                System.out.print("Q ");
                }  
                else if (hand[u]%13+1==13){
                System.out.print("K ");
                } 
                else{
                System.out.print(hand[u]%13+1+" ");
                }
              }
            }
            System.out.println();
            
          
      //right before the loop returns it prompts the user
      //if they want to try a new hand
      //!!!!System.out.println("again? ");
      //!!!!string = input.next();
      
      //returns the hand array to the main method
      return hand;
     
      //only runs again if they type y or Y
    //!!!!}while ((string.equals("Y")) || (string.equals("y")));
    
      
    }
    
      //new method
      public static void simulateOdds(){
        //define total misses
        int totMisses=0;
        //make a 13 slot array to put counters on each position 
        //to keep track of total number of pairs
        int [] eachCard = new int [13];
        //runs through the array assigns each position 0
        for(int s=0; s<13; s++){
          eachCard[s] = 0;
        }
        //mod each number by 13 to get card values rather than 0-51
        for (int x=0; x<10000; x++){
          int [] showHandVal = showHands();
            for(int z=0; z<5; z++){
              for (int y=z; y<5; y++){
                if (showHandVal[y]%13== showHandVal[z]%13 && y!=z){
                  
                  eachCard[showHandVal[z]%13]++;
                  
                  
                }
               
              }
              System.out.println();
              
              
              
            }
         
          
          
          
        }
        //prints results by checking each position
        System.out.println("K "+eachCard[12]);
        System.out.println("Q "+eachCard[11]);
        System.out.println("J "+eachCard[10]);
        System.out.println("10 "+eachCard[9]);
        System.out.println("9 "+eachCard[8]);
        System.out.println("8 "+eachCard[7]);
        System.out.println("7 "+eachCard[6]);
        System.out.println("6 "+eachCard[5]);
        System.out.println("5 "+eachCard[4]);
        System.out.println("4 "+eachCard[3]);
        System.out.println("3 "+eachCard[2]);
        System.out.println("2 "+eachCard[1]);
        System.out.println("A "+ eachCard[0]);
        
        //adds all the times pairs occurs and subtracts it from 1000, the number of runs
        int numberOfWins=eachCard[0]+eachCard[1]+eachCard[2]+eachCard[3]+eachCard[4]+eachCard[5]+eachCard[6]+eachCard[7]+eachCard[8]+eachCard[9]+eachCard[10]+eachCard[11]+eachCard[12];
        int numberOfLosses=10000-numberOfWins;
        
        System.out.println("number of total no pairs "+numberOfLosses);
        
        
      }
    
    
      //main method that just runs both other methods
      public static void main(String [] arg){
    showHands();
    simulateOdds();
  
  
  } 
    
    
    
    }





//note about the things with !!!! next to them (the do while loop)
//I couldn't figure out how to hit the return statement because the
//while part of the do-while comes afterward.
//Had I included the Y/y part it would have prompted the user if
//they wanted to play agin after each of the 10,000 runs which
//would have made grading this a much (muchhh) longer endeavor.
//So I removed those things for the sake of letting you see the final
//output.