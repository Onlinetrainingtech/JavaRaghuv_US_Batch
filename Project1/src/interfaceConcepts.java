interface BI
{
	int a=100;
	void get1();
}
class DI implements BI
{
	public void get1()
	{
		System.out.println("Your value is::"+a);
	}
}
public class interfaceConcepts {

	public static void main(String[] args) {
	
		DI f1=new DI();
		f1.get1();

	}

}
