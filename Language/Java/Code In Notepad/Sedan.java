
public class Sedan extends Car {
	
	
	public Sedan(int ss, double rr, String cc)
	{
	super(ss, rr, cc);
	}

	int length;
	
	public double getSalePrice()
	{
		System.out.println("The sale price is ....");
		return length;
	}
}
