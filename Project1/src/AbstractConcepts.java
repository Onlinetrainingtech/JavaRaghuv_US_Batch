abstract class Demo1
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is Normal Methods");
	}
}
class F1 extends Demo1
{
	void get1()
	{
		System.out.println("This is Abstract Methods");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		F1 d1=new F1();
		d1.get1();
		d1.get2();

	}

}
