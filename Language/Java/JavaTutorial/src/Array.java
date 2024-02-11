import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter array-element : ");
            arr[i] = sc.next().charAt(0);        }
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println("\nThe length of array is "+arr.length);
    }
}
//how take char in array?