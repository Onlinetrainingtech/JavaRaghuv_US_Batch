
public class StrictfpP1 {
	public strictfp void calculate()
	{
	float a=(float) (10.0/3.0);
	float b=(float) Math.pow(a,2);
	
	System.out.println("Value is a::"+a);
	
	System.out.println("Value of b::"+b);
	}
	public static void main(String[] args) {
	
		StrictfpP1 f1=new StrictfpP1();
		f1.calculate();

	}

}
