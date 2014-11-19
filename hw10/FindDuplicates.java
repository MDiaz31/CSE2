//Michael Diaz
//11.18.14
//
//
//
//
//
//imp scanner
import java.util.Scanner;

//define class
public class FindDuplicates{

  //method returns true/false depending on number of pairs
  public static boolean hasDups(int [] userNums) {
      
      
     int pairs=0;
      //compares var i to the length of the array
      for (int i=0; i<userNums.length; i++){
        //compares x to i as i increases
        for (int x=0; x<i; x++){
            //if the numbers are the same its a pair
            if (userNums[i]==userNums[x]){
                //so increment pairs
                pairs++;
                
            }
        //if there are any matches there are pairs  
        if (pairs > 0) {
             
             return true;
        }
      }     
    }
    //no pairs then return false
    return false;
    
  }


  //new method to find exactly one pair
  public static boolean exactlyOneDup(int [] userNums) { 
      
    int pairs=0;
      //same code as above except...
      for (int i=1; i<userNums.length; i++){
      
        for (int x=0; x<i; x++){
        
            if (userNums[i]==userNums[x]){
                
                pairs++;
                
            }
            
  
        }
      }
               //it only returns true if there is exactly one pair
               if (pairs == 1) {
             
             return true;
         } 
      //otherwise its false
        return false;
    
    
  
}

  //my main method
  public static void main(String [] arg){
    //define scanner
    Scanner scan=new Scanner(System.in);
      //defi array length
      int num[]=new int[10];
      String answer="";

      do{
          System.out.print("Enter 10 ints- ");
          for(int j=0;j<10;j++){
            num[j]=scan.nextInt();
    
          }
          String out="The array ";
          out+=listArray(num); //return a string of the form "{2, 3, -9}"   
          if(hasDups(num)){
            out+="has ";
          }
          else{
            out+="does not have ";
          }
          out+="duplicates.";
          System.out.println(out);
          out="The array ";
          out+=listArray(num);    
          if(exactlyOneDup(num)){
            out+="has ";
          }
          else{
            out+="does not have ";
          }
          out+="exactly one duplicate.";
          System.out.println(out);

          System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
          answer=scan.next();
    } while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
}
