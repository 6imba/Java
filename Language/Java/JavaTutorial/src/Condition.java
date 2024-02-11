//ifelse,switch condition

import java.util.Scanner;
public class Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age : ");
        int age = sc.nextInt();
        if(age>=20){
            System.out.println("Voter");
        }
        else{
            System.out.println("Not-Voter");
        }
    }
    
}
