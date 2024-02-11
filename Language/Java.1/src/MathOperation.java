import java.util.Scanner;

public class MathOperation {
    public static void main (String[] args)
    {
        int a=6,b=2;
        int add = a+b;
        int divide = a/b;
        int multiply = a*b;
        float sub = 3.4f-2.77f;//f should be in last of floaat data type in java
        System.out.println(add);
        System.out.println(divide);
        System.out.println(multiply);
        System.out.println("The subtraction is "+sub);
        
        System.out.println("Ans : "+6/9f);
        System.out.println("Ans : "+6/9);
        System.out.println("Ans : "+b/a);
        //System.out.println("Ans : "+b/af);//?????
        //.floatValue()?????
        System.out.println("Ans : "+(float)b/a);//Manual Java Type Casting​


        Scanner obj1 = new Scanner(System.in);
        
        System.out.println("Enter Total Population of Kathmandu and sindhupalchok : ");
        double ktm = obj1.nextDouble();
        double sindhu = obj1.nextDouble();
        double sum = ktm + sindhu;
        System.out.println("The sum of population of Ktm And Palchok is "+sum);
    
        System.out.println("ENTER radius : ");
        double r = obj1.nextDouble();
        final float pie=3.14f;//cannot rewrite final value
        double area =  pie*r*r;
        System.out.println("Area of circle is "+area);
        
        System.out.println("Enter a number of which square root is needed : ");
        double x = obj1.nextDouble();
        System.out.println(Math.sqrt(x));//here u need import java.lang.Math() but ???;
    }
}
