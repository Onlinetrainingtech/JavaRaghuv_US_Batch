
public class MethodOverloadingP1 {

	void get1(int empid)
	{
		System.out.println("Your empid is::"+empid);
	}
	void get1(int salary,String empname)
	{
		System.out.println("your salary is::"+salary+"your empname is::"+empname);
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingP1 f1=new MethodOverloadingP1();
		f1.get1(1001);
		f1.get1(10000,"azar");

	}

}
