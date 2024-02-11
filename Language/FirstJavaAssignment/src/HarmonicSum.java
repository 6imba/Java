
public class HarmonicSum {
    public static void main (String[] args)
    {
        double n=0;
        for (int i = 1; i <= 5000; i++) {
            n=n+1/i;  
        }
        System.out.println("The sum from left-to-right is "+n);
        
        double m=0;
        for (int i = 5000; i >=1; i--) {
            m=m+1/i;  
        }
        System.out.println("The sum from right-to-left is "+m);
        System.out.println("Both method is same ! \n");
        
        double a=0;
        for (int i = 1; i <= 1000; i++) {
            a=a+1/i;  
        }
        System.out.println("When Maximum-denominator is 1000 the value of pie is "+a);
        
        double b=0;
        for (int i = 1; i <= 10000; i++) {
            b=b+1/i;  
        }
        System.out.println("When Maximum-denominator is 10000 the value of pie is "+b);
        
        double c=0;
        for (int i = 1; i <= 100000; i++) {
            c=c+1/i;  
        }
        System.out.println("When Maximum-denominator is 100000 the value of pie is "+c);
        
        double d=0;
        for (int i = 1; i <= 1000000; i++) {
            d=d+1/i;  
        }
        System.out.println("When Maximum-denominator is 1000000 the value of pie is "+d);
        
    }
}
