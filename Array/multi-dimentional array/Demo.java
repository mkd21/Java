
import java.util.Arrays;

// multi dimentional array 

// arr = [ [4 , 3 ,5 ,1] , [9 , 1 ,5 ,1] , [9 , 31 ,35 ,0] ]

public class Demo 
{
    public static void main(String[] args) {
        
        int arr[][] = new int[3][4];

        // System.out.println(arr.length);    // 3

        // System.out.println(arr[0].length);  // 4 

        // System.out.println(arr[0]); // [I@372f7a8d array is an object and if we try to print them we get these values because arrays don't have toString() method

        // System.out.println(Arrays.toString(arr[0]));


        // int res = (int) (Math.random() * 100);

        // System.out.println(res);

        // inserting the random values using math.random() method
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i] [j] = (int) (Math.random() * 10);
            }
        }


        // printing the values of the array 
        for(int i = 0; i < arr.length; i++ )
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}