
public class oops1 {

	String pname="apple";//global variable
	void get1()
	{
		int pid=1001;//local variable
		System.out.println("This is get1 method::"+pid+""+pname);
	}
	void get2()
	{
		System.out.println("This is get2 method::"+pname);
	}
	
	public static void main(String[] args) {
		
		//oops1 obj=new oops1();//creating a object to access the methods
		//obj.get1();
		//obj.get2();

	}

}
