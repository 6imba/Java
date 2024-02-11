import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner object7 = new Scanner(System.in);
        
        System.out.println("Enter how many first Fibonacci series number you want : ");
        int n = object7.nextInt();
        System.out.println("The first "+n+" Fibonacci are : ");
        long a=0,b=1,c=0;//only c instead of c=0 then error c is not initiaized appear in error1
        for (int i = 1; i <= n-2; i++) {
            c = a+b;
            if(i==1)
            {
                System.out.print(a+"\t"+b+"\t"+c+"\t");
            }
            else
            {
                System.out.print(c+"\t");//"/t" is a escpae sequence in java
            }
            a=b;
            b=c;
            }
        float avg = (float)c/n;//since avg is declared of type float, therefore we are converting the c/n to type float by writing (float)c/n ( as int/int will give int in Java ).
        System.out.println("\n"+"The average is "+avg+".");
        }
    }
