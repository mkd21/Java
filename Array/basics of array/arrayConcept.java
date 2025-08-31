


public class arrayConcept {
    
    public static void main(String[] args) {
       
        int arr[] = {4 , 9 , 10 , 3};     // if we have values available 

        // what if we dont have a value to assign right now but in future we will have those values 

        int arr1[] = new int[5];     // we got array to size 5 with initial values as 0


        System.out.println("values before assigning");
        
        for(int i = 0; i < arr1.length; i++ )
        {
            System.out.print(arr1[i] + " ");
        }
        
        
        arr1[0] = 4;
        arr1[1] = 14;
        arr1[2] = 19;
        arr1[3] = 9;
        arr1[4] = 1;

        System.out.println();
        System.out.println("after assigning the values");
        
        for(int i = 0; i < arr1.length; i++ )
        {
            System.out.print(arr1[i] + " ");
        }

    }
}
