import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args)
    {
        System.out.println("Enter the size of array : ");
        
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        
        int[] main_array = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) 
        {
            main_array[i]= obj.nextInt();
        }
        
        System.out.println("Enter the elemet to be searched from array :");
        int array_item = obj.nextInt();

        int check = 0;
        
        for (int i = 0; i < size; i++) 
        {
            if(array_item == main_array[i])
            {
                System.out.println("The element is found at index "+i);
                check++;
            }
        }
        if(check == 0)
        {
            System.out.println("Element not found !!! ");
        }
        
    }
}
