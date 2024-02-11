//
//package StringJava;
//
////first_class
//public class TestRobert {
//    
//    //main_method
//    public static void main(String[] args){
//        
//    }
//    
//}
//
//public class Robort{
//    
//}


//package StringJava;
//
////first_class
//public class TestRobert {
//    
//    //main_method
//    public static void main(String[] args){
//        Robert r1 = new Robert(); //instansiate_object
//        Robert r2 = new Robert();
//        
//        r1.color = "Green";
//        r1.name = "Green";
//        r1.version = 9;
//        
//        r1.introduction();
//    }
//    
//}
//
//class Robert{
//    String color,name;
//    int version;
//    
//    void introduction(){
//        System.out.println("My name is "+this.name);
//    }
//    
//}





package StringJava;

//first_class
public class TestRobert {
    
    //main_method
    public static void main(String[] args){
        Robert r1 = new Robert("Green","Car",1); //instansiate_object

        Robert r2 = new Robert("Blue","Bike",1);
        //Robert r2 = new Robert('Blue','Bike',1);
        
        r1.introduction();
        r2.introduction();
    }
    
}

class Robert{
    String color,name;
    int version;
    
    Robert(String given_color, String given_name, int given_version){
        this.color = given_color; 
        this.name = given_name;
        this.version = given_version;
    }
    
    void introduction(){
        System.out.println("My name is "+this.name);
    }
    
}