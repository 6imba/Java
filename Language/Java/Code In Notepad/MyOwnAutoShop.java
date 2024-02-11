import java.util.Scanner;
public class MyOwnAutoShop {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter for constructor super: ");
		int s = ip.nextInt();
		double r = ip.nextDouble();
		String c = ip.nextLine();
		
		//for Car
		System.out.println("Enter speed, regularPrice and color for the car: ");
		int speed = ip.nextInt();
		double regularPrice = ip.nextDouble();
		String color = ip.nextLine();
		Car car = new Car(speed, regularPrice, color);
		
		
		//for sedan
//		System.out.println("Enter the length for Sedan: ");
//		int value = ip.nextInt();
//		System.out.println("Enter for constructor super: ");
//		int sp = ip.nextInt();
//		double rp = ip.nextDouble();
//		String co = ip.nextLine();
		Sedan sed = new Sedan(s, r, c);
		
		
		//for ford
		
	
		Ford f1 = new Ford(s, r, c);
		
		
		//for Truck 
		System.out.println("Enter for constructor super: ");
	
		Truck t = new Truck(s, r, c);
	
	}
	
	
	
	
}
