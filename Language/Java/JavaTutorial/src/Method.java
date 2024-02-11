//class named as Method
public class Method {
    //main_function
    public static void main (String[] args){
        IntroduceMyself(); //method_call
        int result = sum(2,3); //method_call
        System.out.println(result);
        System.out.println(sum(7,8));//method_call
    }
    
    //method_defination //1. NO return_type & NO parameter
    public static void IntroduceMyself(){
        System.out.println("Hello World! Amir is here.");
    }
    
    //method_defination //1. return_type & parameter
    public static int sum(int x, int y){
        return x+y;
    }
    
}


/*
Type of method:
1. NO return_type & NO parameter
2. return_type & NO parameter
3. NO return_type & parameter
4. return_type & parameter
*/