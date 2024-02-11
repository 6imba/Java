import java.util.Scanner;// Import the Scanner class
public class InputAndPrint {
    public static void main (String[] args)
    {
        //here scanner is like a class in java  used for obtaining the input of the primitive datatype
        Scanner amirscanner = new Scanner (System.in);// Create a Scanner object
        //hereamirscanner is object of Scanner class

        String name;//string datatype
        System.out.println("Enter your name : ");
        name = amirscanner.next();//next() method finds and returns the next complete token from this scanner or read and return the inputed data by user.next() can read the input only till space
        System.out.println("String name : " + name);

        
        System.out.println("Enter name, age and salary:");
        String aaa = amirscanner.nextLine();// String input
        int bbb = amirscanner.nextInt();// Numerical input
        double ccc = amirscanner.nextDouble();

         //Output input by user
        System.out.println("Name: " + aaa); 
        System.out.println("Age: " + bbb); 
        System.out.println("Salary: " + ccc);
        
        
        char naam,naamfirstword,naamthirdword;//datatype here char will take only one character/word

        System.out.println("Enter your name : ");
        naamfirstword = amirscanner.next().charAt(0);
        System.out.println("Character in first index of  of entered name : " + naamfirstword);
        //charAt() is a method that returns the character at the specified index in a string.
        
        System.out.println("Enter your name : ");
        naamthirdword = amirscanner.next().charAt(3);
        System.out.println("Character in Third index of entered name : " + naamthirdword);

        System.out.println("Enter your name : ");
        naam = amirscanner.next().charAt(6);//if u enter less character than given index then error occur
        System.out.println("Character in sixth index of  of entered name : " + naam);
        //charAt() is a method that returns the character at the specified index in a string but if index is greater than the number od character present in string it throws IndexOutOfBoundsException.
 
    }
}
