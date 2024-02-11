import java.util.Scanner;
public class Truck extends Car {

	
	public Truck(int ss, double rr, String cc)
	{
		super(ss, rr, cc);
		
	}
	
	public double getSalePrice() {
		Scanner s = new Scanner(System.in);
		int weight = s.nextInt();
		if(weight>2000)
		{
			return super.getSalePrice() - (0.1 * super.getSalePrice());
		}
		else
		{
			return super.getSalePrice();
		}
		}
	
}
