public class Method {
    public static void main(String[] args)//Java Main Method
    {
        //no Return Type And no Parameter methods
        MySelf();
        
        //no Return Type And Parameter methods
        System.out.println(Sum(2,7));
        int j=1,k=2,sum=Sum(j,k);
        System.out.println(Sum(j,k));
        
        //Return Type And no Parameter methods
        int u = Multiply()*2;
        System.out.println("Answer Go : "+u);
        
        //Return Type And Parameter methods
        Difference(5,8);
        
        
    }
    public static void MySelf()//no Return Type And no Parameter methods
    {
        System.out.println("Hello World ! Its me Amir Shrestha.");
    }
    public static void Difference(int a,int b)//no Return Type And Parameter methods
    {
        System.out.println("Difference of "+a+" & "+b+" is "+(a-b));
    }
    public static int Multiply()//Return Type And no Parameter methods
    {
       return 6*3;
    }
    public static int Sum(int x, int y)//Return Type And Parameter methods
    {
        return x+y;
    }
}
