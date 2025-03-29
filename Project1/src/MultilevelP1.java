class B1
{
	int empid=1001;
	String empname="azar";
	void get1()
	{
		System.out.println("BaseClass Value is::"+empid);
	}
}
class D1 extends B1
{
	void get2()
	{
		System.out.println("Drv class is::"+empname);
	}
}

class D2 extends D1
{
	void get3()
	{
		System.out.println("get3 value is::"+empid+""+empname);
	}
}
public class MultilevelP1 {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
