import java.util.Scanner;
public class LoopContinueBreak {
    public static void main (String[] args)
    {
        Scanner object = new Scanner(System.in);
        
        System.out.println("Enter a number of which u want table :");
        int number = object.nextInt();
        for(int i =1;i<=10;i++)
        {
            if(i==1)
            {
            continue;//here contineu will skip number *1 like 2*1=2,3*1=3etc
            }
            if(i==8)
            {
            break;//here break will close when 1=8
            }
            int value=i*number;
            System.out.println(number+"*"+i+"="+value+"\n");
        }
        
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
            System.out.print("*");
            }
        System.out.println("");

        }
        
    }
}
