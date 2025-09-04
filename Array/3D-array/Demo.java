

// example of 3D array 

public class Demo 
{
    public static void main(String[] args) {
        
        int arr[][][] = new int[3][4][6];

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        // inseting the values inside the 3d array 
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j< arr[i].length; j++)
            {
                for(int k = 0; k < arr[i][j].length; k++)
                {
                    arr[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j< arr[i].length; j++)
            {
                System.out.print(" [");
                for(int k = 0; k < arr[i][j].length; k++)
                {
                    System.out.print( arr[i][j][k] + " ");
                }
                System.out.print("] ");
            } 
            System.out.println();
        }
    }
}