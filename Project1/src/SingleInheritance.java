class B
{
	int empid=1001;
	String empname="azar";
	void get1()
	{
		System.out.println("BaseClass Value is::"+empid);
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Drv class is::"+empname);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
