//
//Michael Diaz
//10.10.14
//Roulette Java
//The program prompts the user to ask to play one of three random games
//
//
//
//
public class Roulette                                    {

    public static void main (String [] args)                 {
       
        
        
          int yourNum = 0 + (int)(Math.random()*38);
          System.out.println("your roulette number: "+yourNum);
          
          
          
         
           
            int timesProfited=0;
            int trials = 0;
            int totalCompleteLosses = 0;
            int totalWinnings = 0;
          
          
                
            
            
                while (trials<1000)   {
                
                int counter = 0;
            
            
                  int runs = 0;
            
            
                    while (runs<100)    
                    {
                        
                        
                        int randomNum = 0 + (int)(Math.random()*38);
                        
                        runs++;
                        
                        
                        if (randomNum==yourNum)
                        {
                            
                           
                        
                             counter++;
                             
                        
                        }
               
    
                
               
                
                totalWinnings = totalWinnings+counter*36;
                
               
            }
            
            
             if (counter==0)
                {
                
                totalCompleteLosses++;
                
                
                
                }
            
             if (counter>=3){
                
                
                
             timesProfited++;
                
            }
            
            
                trials++;
    
                }
    
            
    
    
    
    
            
        System.out.println("you lost everything: " +totalCompleteLosses+ " times");
        System.out.println("you made $" +totalWinnings);
        System.out.println("number of total wins: " +timesProfited);
        
        
        
    }
        
        
}