////1
//public class MathematicalOperation_03 {
//    public static void main(String[] args){
//        int x = 18,y=4,sum=x+y,diff=x-y,remainder=x%y;
//        System.out.println("The sum is "+sum);
//        System.out.println("The difference is "+diff);
//        System.out.println("The remainder is "+remainder);
//    }
//}


////2 user input values
//import java.util.Scanner;
//public class MathematicalOperation_03 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number : ");
//        int x = sc.nextInt();
//        System.out.println("Enter second number : ");
//        int y = sc.nextInt();
//        int sum=x+y,diff=x-y,remainder=x%y;
//        System.out.println("The sum is "+sum);
//        System.out.println("The difference is "+diff);
//        System.out.println("The remainder is "+remainder);
//        
//        
//    }
//}



//3 Aren of circle (final float pie)
import java.util.Scanner;
public class MathematicalOperation_03 {
    public static void main(String[] args){
        final float pie = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        float r = sc.nextFloat();
        float area = pie*r*r;
        System.out.println("The Area of circle with radius " + r + " is "+ area);
    }
}