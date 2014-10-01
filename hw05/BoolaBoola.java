//Michael Diaz
//9.30.14
//BoolaBoola Java
//This program generates three random booleans and combines them
//randomly with &&'s and ||'s then asks the user if the line is true
//or false and tells them if they were correct or wrong with their answer
//
//
//
//import scanner
import java.util.Scanner;

//define class
public class BoolaBoola                                {

    //define method
    public static void main (String [] args)                 {
        //define scanner
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
                    //define necessary variables
                    boolean a = true;
                    boolean b = true;
                    boolean c = true; 
                    String d = "&&";
                    String e = "&&";
                    
            //generate random variables        
            int andOrIfOne = 1 + (int)(Math.random()*2);
            int andOrIfTwo = 1 + (int)(Math.random()*2);
          
            //switch statement for 'ands' and 'ifs'
            switch (andOrIfOne) {
               
                //if 1 is produced, &&, if 2, ||
                case 1: d = "&&";
                break;
                case 2: d = "||";
                break;
          
            }//end switch
            
            //switch statement for the &&'s and ||'s
            switch (andOrIfTwo) {
               //if one is produced &&, if 2, ||
                case 1: e = "&&";
                break;
                case 2: e = "||";
                break;
            
            }//end switch
            
            //generate random numbers between 1 and 2
            int trueOrFalseOne = 1 + (int)(Math.random()*2);
            int trueOrFalseTwo = 1 + (int)(Math.random()*2);
            int trueOrFalseThree = 1 + (int)(Math.random()*2);
            
        
             //switch statement for the true and falses
             switch (trueOrFalseOne) {
               
                //if 1, true, if 2, false
                case 1: a = true;
                break;
                case 2: a = false;
                break;
           
             }//end switch
                //switch statement, same as above
               switch (trueOrFalseTwo) {
               
                case 1: b = true;
                break;
                case 2: b = false;
                break;
            
             }//end switch
            
               switch (trueOrFalseThree) {
               
                case 1: c = true;
                break;
                case 2: c = false;
                break;
        
               }//end switch
        
        
        //finally, print out a,b,c,d,e which are true/false, &&/||, true false, &&/||, true false
         System.out.println("Does " +a+" "+d+" "+b+" "+e+" "+ c+ " have the value of true or false? enter T,t for true or F,f for false" );
             //get the response from the user, their answer
              String response=myScanner.next();
             
  
  //define the correct answer
  boolean correctAnswer = true;
  
      
        //these statements give the correct answers based on
        ///whatever the output is...so if the program prints "&&", "&&"
        //the correct answer will be &&, &&---then its compared against whatever
        //the user puts in to decide right or wrong (that comes later)
        if (d.equals("&&") && (e.equals("||"))) {
            
            correctAnswer = a && b || c;
        }//end if
        
        else if (d.equals("&&") && (e.equals("&&")))  {
            
            
            correctAnswer = a && b && c;
            
            
        }//end else if
        
        else if (d.equals("||") && (e.equals("&&")))  {
            
            
             correctAnswer = a || b && c;
        
    }//end else if
    
        else if (d.equals("||") && (e.equals("||")))  {
            
               correctAnswer = a || b || c;
    
    
}//end else if
        
        //these next four functions compare the correct answer to
        //that of the user.  if they answer correctly, the program prints
        //correct, and if they answer wrong the program prints wrong

        if ((response.equals("t") || response.equals("T")) && correctAnswer == true)         {
            
            
            System.out.println("Correct");
            
        }//end if
            
         else if ((response.equals("t") || response.equals("T")) && correctAnswer == false)         {
            
            
            System.out.println("Wrong");
            
        
        }//end else if

          else if ((response.equals("f") || response.equals("F")) && correctAnswer == false)         {
            
            
            System.out.println("Correct");
         
          }//end else if
          
        
         else if ((response.equals("f") || response.equals("F")) && correctAnswer == true)         {
            
            
            System.out.println("Wrong, try again");

        
    }//end else if
     //tell the user theyre wrong if they enter anything other than t,T,f,F
        else {
            
            System.out.println("Wrong, try again");
      
        } //end last else
        
    }//end method



}//end calss