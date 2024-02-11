import java.util.Scanner;
public class NextInput{
    public static void main(String[] args)//if error in this line that code error no main method
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Name : ");
        String name = input.nextLine();
        System.out.println("String name : " + name);
        System.out.println("Enter age : ");
        int age = input.nextInt();
        
        System.out.println("Enter Name and age : ");
        String naam = input.nextLine();
        //???error after runing ine 14
        int umer = input.nextInt();
        
        System.out.println("String name : " + naam);
        System.out.println("String name : " + umer);
    }

}


/*
solution : 
        System.out.println("Enter Name and age : ");
        String naam = input.nextLine();
        input.nextLine();
        input.nextLine();//solution
        int umer = input.nextInt();
but after this code naame is not prited
*/