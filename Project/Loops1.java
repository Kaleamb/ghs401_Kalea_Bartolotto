public class Loops1
{
    public static void main (){
        //declare an array of size 100 that holds 100 integers
        int[] myArray = new int[100];
        //store the contents of the array in a loop
        for(int i=0; i<myArray.length; i++){
            //store the array as multiple of 6
            myArray[i]= i*5;
            
            System.out.println("Item "+(i+1)+" is "+ myArray[i]);
        }
        
    }
}
 
        
