

// in normal multi-dimentional array we need to specify row and col like int arr[][] = new int[3][5]

// in this case columns will remain same at each row like 

// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0

// but what if we dont want columns to be of fixed number? 

// in that case we can use jagged array 

// 0 1 5 2
// 12
// 9 4 2 10
// 3 4

// in each row number of columns can be different 


public class Demo 
{
    public static void main(String[] args) {
        
        int arr[][] = new int[3][];      // jagged array 
        
        arr[0] = new int[5];  // number of cols in 1st row
        arr[1] = new int[2];  // number of cols in 2nd row
        arr[2] = new int[8];  // number of cols in 3rd row


        for(int i = 0; i < arr.length ; i++)  // iterate on rows
        {
            for(int j = 0; j < arr[i].length ; j++)  // iterate on cols
            {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }

        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < arr[i].length; j++)
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // enhanced for loop 

        for(int n[] : arr)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}