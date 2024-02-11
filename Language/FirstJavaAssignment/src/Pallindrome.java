import java.util.Scanner;

public class Pallindrome {
    public static void main (String[] args)
    {
        System.out.println("Enter a word : ");
        
        Scanner obj = new Scanner(System.in);
        
        String word = obj.nextLine(),reverse="";//strings take both numeric as well as character
        for (int i =word.length()-1; i>=0; i--) 
        {
            reverse = reverse + word.charAt(i);
        }
        if(reverse.equals(word))//for string use var.equals(var)
        {
            System.out.println("The word "+word+" is Pallindrome !");
        }
        else
        {
            System.out.println("The word "+word+" is not Pallindrome !");
        }
                
    }
}
