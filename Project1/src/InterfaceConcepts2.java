interface BI_1
{
	void get1();
}
interface BI_2 extends BI_1
{
	void get2();
}
class DI_1 implements BI_2
{
	public void get1()
	{
		System.out.println("This is get1 functions");
	}
	public void get2()
	{
		System.out.println("This is get2 functions");
	}
}
public class InterfaceConcepts2 {

	public static void main(String[] args) {
		
		DI_1 f1=new DI_1();
		f1.get1();
		f1.get2();

	}

}
