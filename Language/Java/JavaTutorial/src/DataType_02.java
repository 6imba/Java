/*DataType in Java
1. Primitive DataType  ==>  int,byte,char,boolean etc.
2. Non_Primitive DataType ==> string,array,user-define class
*/

import java.util.Scanner;
public class DataType_02 
{
    public static void main(String[] args)
    {
        System.out.println("Write your character : ");
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);
        System.out.println("Character that you have entered is "+name);
    }
}

