import java.util.Scanner;

public class ExtractDigits {
    public static void main (String[] args)
    {
        Scanner obj = new Scanner (System.in);
        
        System.out.println("Enter a numeric integer value : ");
        int org = obj.nextInt();
        int ans;
        double y =0;
        String sum="";
        
        while(org>0)//here wew 
        {
            ans = org%10;//extract numer
            sum=sum+ans+" "; //remainning   
            org = org/10;//quotient
        }
        
        System.out.println(sum);
    }
}
