//Mike Diaz
//Dec 5
//define class
public class MatrixSorter{
 //main method
 public static void main(String arg[]){
    //define a 3d array
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    //print the min of the array
    System.out.println("The smallest entry in the 3D matrix is "+
  	findMin(mat3d));
    //print sorted matrix
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
   //method to build the 3d array
   public static int [][][]buildMat3d(){
       
       //define slabs
    int [][][] array  = new int [3][][];
        for (int n=0; n<3; n++){
        array[n]=new int [3+(2*n)][];
            for (int s=0; s<3+(2*n); s++){
            array[n][s]=new int [n+s+1];
                for (int j=0; j<n+s+1; j++){
                array [n][s][j]=(int)(Math.random()*100);
                
      
           
                }
           
            }
        }
   
   return array;
   
   }
   
   //method to print the array
   public static void show(int [][][] array){
       
       
      for (int n=0; n<3; n++){
        for (int s=0; s<3+(2*n); s++){
          for (int j=0; j<n+s+1; j++){
            System.out.print(array[n][s][j]+" ");
       
       
       
          }
       
           System.out.println("");
        }
       
       System.out.println("--------------------");
       
    }

}
//method to sort the array
    public static int [][]sort(int array[][]){
    boolean bool = true;
    while (bool){  
    bool = false;
    for (int s=0; s<7; s++){
        for (int j=0; j<s+2; j++){
            if (array[s][j]> array[s][j+1]){
                //save the switching array while theyre being swapped
                int swapper=array[s][j];
                array[s][j]=array[s][j+1];
                array[s][j+1]=swapper;
            bool =true;
                
            }
            }
        
    
        
        
    }
    //the trues change to falses once the loops have searched the
    //entire array and made all necessary changes to sort
    boolean boolaboola = true;
    while (boolaboola){  
    boolaboola = false;
    for (int x=0; x<6; x++){
        for (int y=0; y<x+2; y++){
            if (array[x][0]> array[x+1][0]){
                int swapper=array[x][0];
                array[x][0]=array[x+1][0];
                array[x+1][0]=swapper;
            boolaboola =true;   

            
        }    
          
   }
    }
    }
    
}
return array;
}
//method to find the minimum
    public static int findMin(int array[][][]){
        
        int min=100;
        for (int n=0; n<3; n++){
        for (int s=0; s<3+(2*n); s++){
          for (int j=0; j<n+s+1; j++){
            if (array[n][s][j]<min){
                
                min=(array[n][s][j]);
                
                
            }
       
       
       
          }
       
         
        }
       
    }
    

    return min;
    }
    
    
    
}
