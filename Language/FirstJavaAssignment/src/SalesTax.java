//import java.lang.Math;
import java.util.Scanner;

public class SalesTax {
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter The Total Price tag of the item : ");   
        double Tcost = obj.nextDouble();
        
        double Tax = Tcost*0.06542056074;
        //double Tax = Tcost*7/107;
        
        double Acost = Tcost - Tax;
        
        System.out.println("Actual Cost : "+Acost);
        System.out.println("Sales Tax   : "+Tax);
        System.out.println("Total Price : "+Tcost);

//        This below code also give 2 number after decimal but it is not correct way
//        System.out.println("Actual Cost : "+Math.round(Acost*100.0)/100.0);
//        System.out.println("Sales Tax   : "+Math.round(Tax*100.0)/100.0);
//        System.out.println("Total Price : "+Math.round(Tcost*100.0)/100.0);

    }
}
