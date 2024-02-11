import java.util.Scanner;
public class Fibbonacci {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i,a=0, b=1, c;
        System.out.print("Enter the frequency(n) of Fibionnaci series :");
        int n = sc.nextInt();
        for(i=0;i<(n-2);i++) //        for(i=1;i<=(n-2);i++)
        { 
            if(i==0){
                System.out.print("  " + a + "  " + b);
            }
            c = a+b;
            System.out.print("  " + c);
            a=b;
            b=c;
        }
    }
}
