//
//Michael Diaz
//10.27.14
//Roulette Java
//The program tells the user how many times their randomly selected roulette
//number wins
//
//
//
//define class
public class Roulette                                    {
    //main method
    public static void main (String [] args)                 {
       
        
        //generate random roulette number
          int yourNum = 0 + (int)(Math.random()*38);
          System.out.println("your roulette number: "+yourNum);
          
          
          
         
           //define necessary variables
            int timesProfited=0;
            int trials = 0;
            int totalCompleteLosses = 0;
            int totalWinnings = 0;
          
          
                
            
                //run 1000 trials
                while (trials<1000)   {
                
                int counter = 0;
            
            
                  int runs = 0;
            
                    //run 100 random roulette results
                    while (runs<100)    
                    {
                        
                        
                        int randomNum = 0 + (int)(Math.random()*38);
                        
                        runs++;
                        
                        //if your random roulette number matches
                        //any of the 100 random roulette numbers produced
                        //then add the to the number of total wins
                        if (randomNum==yourNum)
                        {
                            
                           
                        
                             counter++;
                             
                        
                        }
               
    
                
               
                
                totalWinnings = totalWinnings+counter*36;
                
               
            }
            
            //if your number never matches the roulette numbers
            //produced then its a complete loss
             if (counter==0)
                {
                
                totalCompleteLosses++;
                
                
                
                }
            
            
            //if your number matches more than twice, you've
            //profited
             if (counter>=3){
                
                
                
             timesProfited++;
                
            }
            
            
                trials++;
    
                }
    
            
    
    
    
    
            //print all the results
        System.out.println("you lost everything: " +totalCompleteLosses+ " times");
        System.out.println("you made $" +totalWinnings);
        System.out.println("number of total wins: " +timesProfited);
        
        
        
    }//end method
        
        
}//end class




//over