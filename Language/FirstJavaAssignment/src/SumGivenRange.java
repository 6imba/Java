import java.util.Scanner;

public class SumGivenRange {
    public static void main(String[] args)
    {
        System.out.println("Enter the range for addition : ");
        
        Scanner Object10 = new Scanner(System.in);
        
        long lowerbound=Object10.nextLong(),upperbound=Object10.nextLong(),sum=0,numb=0,duplicate=lowerbound;
        
        for (int i = 0; duplicate <= upperbound; i++) 
        {
            sum = sum + duplicate;
            duplicate++;
            numb++;
        }
        System.out.println("The sum of "+lowerbound+" to "+upperbound+" is "+sum);
        
        float avg=(float)sum/numb;//Manual Java Type Casting​
        System.out.println("The average is "+avg);
    }
}
