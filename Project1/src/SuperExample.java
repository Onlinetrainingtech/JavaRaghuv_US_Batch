 class B12
{
	int employeeid=2001;//global variable
    void get1()
    {
    	System.out.println("This is BaseClass::"+employeeid);
    }
	
}
class D12 extends B12
{
	void get2()
	{
		int employeeid=2002;//local variable
		System.out.println("This is Derivedclass::"+super.employeeid);
	}
}
public class SuperExample {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.get2();

	}

}
