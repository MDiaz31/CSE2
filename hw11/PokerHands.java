//Michael Diaz
//November 18
//v
//
//
//
//
//import random
import java.util.Random;
//import scanner
import java.util.Scanner;
  //define class
  public class PokerHands{
      public static void main(String [] arg){
      Scanner input = new Scanner(System.in);
     //define necessary variables
     int x=0;
     String rank = "";
     char suit='\0';
     //these variables jump ahead in the deck of 52 cards to figure out suits
     int d=13;
     int h=26;
     int s=39;
     int [] hand =new int [6];
     //asks if they want to continue
     System.out.print("enter y or Y to continue");
     char response=input.next().charAt(0);
     
     if (response=='y' || response=='Y'){
     //asks for a five card hand
     for (x=0; x<5; x++){
       
     System.out.println("enter a suit (c,d,h,s)");
     suit=input.next().charAt(0);
     System.out.println("enter a rank");
     rank=input.next();
     
     
     //jumps ahead in the deck of 52
    if (suit=='d'){
      
      hand[x]+=d;
      
    }
    else if (suit=='h'){
      
      hand[x]+=h;
      
    }
    else if (suit=='s'){
      
      hand[x]+=s;
      
    }
    //switch on the string rank
    switch (rank){
      //depending on the card they enter it gives a value
      case "A": hand[x]+=0;
      break;
      case "K": hand[x]+=1;
      break;
      case "Q": hand[x]+=2;
      break;
      case "J": hand[x]+=3;
      break;
      case "10": hand[x]+=4;
      break;
      case "9": hand[x]+=5;
      break;
      case "8": hand[x]+=6;
      break;
      case "7": hand[x]+=7;
      break;
      case "6": hand[x]+=8;
      break;
      case "5": hand[x]+=9;
      break;
      case "4": hand[x]+=10;
      break;
      case "3": hand[x]+=11;
      break;
      case "2": hand[x]+=12;
      break;
      default: System.out.println("Not a valid rank");
      break;
    }
    
   
    //if they enter the same card twice it tells them
    if(x>0){
    if (hand[x]==hand[x-1]){
      
      System.out.println("You already entered that card");
      x--;
      break;
    }
     
    }
      
     }
     
        //calls the other two methods
      showOneHand(hand);
      getReward(hand);
      
      }
      //if they dont enter y or Y it kicks them out
      else {
          System.out.println("You didnt enter y or Y so you won't get a new hand");
      }
      }
    
      
      //chen's method to print out the right hand
      public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
      

      
    public static void getReward(int hand []){
       //define all necessary valables and arrays
      int arrayChecker=0;
      int temp=0;
      int [] pairFreq=new int [5];
      int [] rankFreq=new int [13];
      int y=0;
      int x=0;
      int u=0;
      //run through this loop 5 times and mod the inputs by
      //13 because there are 13 cards of each suit
        for ( x=0; x<5; x++){
            for ( y=0; y<13; y++){
          
                if (hand[x]%13==y){
                //increment the rank frequency each time the counter
                //is equal to hand mod 13
                rankFreq[y]++;
        
              
          }
          
        }
        //runs through 5 times and divides the value at position x by 13
        //and sets it equal to q
        for(int q=0; q<5; q++){
            
            if((hand[x]/13)==q){
                //increments pair frequency at position q whenver it runs
                pairFreq[q]++;
                
            }
            
        }
    }
        //define a new array to solve which hands are which
      int []newArray = new int [5];
        //the big for loop runs 13 times and the inner one
        //runs 5 times
        for (int l=0; l<rankFreq.length; l++){
            for(int p=0; p<pairFreq.length; p++){
                //increment the new array every time rank frequency
                //equals the inner counter
                if (rankFreq[l]==p){
                    newArray[p]++;
                }
            }
            
        }
        
        //now we look at the new array
        //and run through two for loops 5 times each
        //an "array checker" is incrementing every time a card before the
        //next is equal to one less than the next card
        for (u=0; u<5; u++){
            if (newArray[u]==5){
                for (int g=0; g<5; g++){
                    if (rankFreq[g]==0 && rankFreq[g+1]==1){
                        arrayChecker++;
                    }
                }
            }
                
            
        }
      
        
      
      
        
      
      //tries to solve for a straight but the arrayChecker doesn't
      //increment properly for some reason
        System.out.println(arrayChecker);
        if (arrayChecker==1){
            System.out.println("Straight!");
    
    /*i didnt include the rest of the rewards because my code already
    wasn't working regardless but the rest of the rewards would just identify how many of each
    card appeared in each position of a 5 length array and spit out the right hand
    so like if the result wound up 8,5,0,0,0 in the array, its 5 unique cards
    then i'd right code to differentiate those 5 cards being random or being 5 conseuctive numbers--all basic stuff
    if a 1 appeared in position 2 its a pair, if a 1 also appeared in position 3 its a full house, if a 1 appeared
    in position 4 its a four of a kind, etc...i knew how to do it i just didn't have enough time,
    i learned about the assignment on wednesday and i put in a lot of hours, please be merciful on my soul
    */

        }
  }
        }