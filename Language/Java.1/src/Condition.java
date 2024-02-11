import java.util.Scanner;
public class Condition {
    public static void main (String[] args)
    {
        Scanner object = new Scanner(System.in);
        
        //ifelse statement
        System.out.println("Enter your age : ");
        int age = object.nextInt();
        if(age>=18)
        System.out.println("Voter !");
        else
        System.out.println("Not elegible for voting !");
        
        //switchcase
        System.out.println("Enter a number of day of week : ");
        int day = object.nextInt();
        switch(day)
        {
        case 1:
        System.out.println("SundaY !");
        break;
        case 2:
        System.out.println("MondaY !");
        break;
        case 3:
        System.out.println("TuesdaY !");
        break;
        case 4:
        System.out.println("WednusdaY !");
        break;
        case 5:
        System.out.println("ThursdaY !");
        break;
        case 6:
        System.out.println("FridaY !");
        break;
        case 7:
        System.out.println("SaturdaY !");
        break;
        default:
        System.out.println("A week consist 8 days !");
        }
    }
}
