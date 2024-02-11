import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        //datatype arrayvariable[]= new datatype[size]
        //int [] RollNo = new int [50]
        String[] fruits = new String [6];//declear array 
        fruits[0]="Apple";
        fruits[1]="Banana";
        fruits[2]="Cheery";
        for (int i = 0; i < fruits.length; i++) //arrayvariable.length = arraylength
        {
        System.out.println(fruits[i]);
        }
        
        Scanner objscan = new Scanner(System.in);
        
        System.out.println("Enter the size of array or total number of family member  : ");
        int size = objscan.nextInt();//size of array 
        
        int[] family = new int [size];//array
        
        String name[] = new String [size];//arrayname
        int age[] = new int [size];//arrayage
        
        for (int i = 0; i < family.length; i++)//input array data 
        {   
            System.out.println("Enter Name : ");
            name[i] = objscan.next();//It take only single word how to input sentences
            System.out.println("Enter Age : ");
            age[i] = objscan.nextInt();
        }
        for (int i = 0; i < family.length; i++) //output array data
        {
            System.out.println("Name : "+ name[i] + "\t Age : "+age[i]);
        }
       
    }
}
