//Michael Diaz
//
//
//
//
//


import java.util.Scanner;

public class BlockedAgain{



    //checks if the inputted number is between 1 and 9 inclusive 
    public static boolean checkRange(int number){
        
        if ((number>=1) && (number<=9)){
            //returns true if the number is within range 
            return true;
        }
        
        else {
            //returns false otherwise 
            return false;
        
            
        }
        
        
    }

    
    
    // checks if there is an input in the scanner 
    public static boolean checkInt(Scanner input){
        
        boolean check=false;
        
        
        check=input.hasNextInt();
        return check;
        
        
    }
    
    
    // gets the int from the user 
    public static int getInt(){
        
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("Enter an int between 1 and 9, inclusive ");
        
        boolean check=true;
        
        
        while (true){
            
            
            
            
            check=checkInt(input);
            // reads the next entered value from the user 
            String number=input.next();
            
            
            
            if (check==true){
            
            // parses the input if it's an int
            int userNum=Integer.parseInt(number);
            
            
            check=checkRange(userNum);
            
                if(check==true){
                    
                    return userNum;
                    
                    
                }
                
                else {
                    
                    
                    System.out.println("You did not enter an int in [1,9]. Try again ");
                    
                    
                    System.out.println("Enter an int between 1 and 9, inclusive ");
                    
                    
                    check=true;
                }
            
            }
            
            else{
                
                System.out.println("You did not enter an int, try again ");
                
                
                System.out.println("Enter an int between 1 and 9, inclusive ");
             
             
             
                check=true;   
            }
            
            
            
            
        }
        
        
    }
        
        


    public static void line(int j, int y, int z, int userNum){
       
       
       
       
       for(int x=0; x<z; x++){
       
       
       
       
       
       System.out.print(y);
       
       
       }
       
       
       System.out.println("");
    }


    public static void block(int x, int y, int z, int userNum){
        
        
        
        for(int i=0; i<=x; i++){
        
        
        if(i==x){
           
           for(int w=userNum-i; w>0; w--){
           
           System.out.print(" ");
           
            }
           
           for(int w=1; w<z; w++){
               
           
           System.out.print("-");
           
           }
           
           System.out.println("");
           
       }
        
        
        else{
    
    
        for(int w=userNum-i; w>0; w--){
           
           System.out.print(" ");
           
        }
    
    
    
        line(i, y, z, userNum);
        
        }
        
        
        }
        
    
        
    }


    public static void allBlocks(int userNum){
        
        int z=1;
        int y=1;
        
        for(int x=0; x<userNum; x++){
        
        
        block(x, y, z, userNum);
        
        z=z+2;
        y=y+1;
        
        }
        
        
    }


    public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
    }
    
}