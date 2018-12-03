
public class Array
{
    public static void main(){
        //declare an array of zixe 12 that holds 12 integers
        int[] myArray = new int[20];
        
        //print the length of the array using the .length call
        System.out.println("The length of the array is" + myArray.length);
         
        //store three arbitrary values in the array in three abritrary locations
        myArray[0] = 55;
        myArray[3] = 100;
        myArray[11] = 73;
        myArray[1] = 17;
        myArray[myArray.length-2] =121;
        
        //print the contents of the array in a lop, using .length to end the loop
        for(int i=0; i<myArray.length; i++){
        System.out.println("The value of the element: " + i + " in the array is" +myArray[i]);
    }
}
}
        