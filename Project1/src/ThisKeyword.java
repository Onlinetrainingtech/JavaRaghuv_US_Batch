
public class ThisKeyword {

	int e1,s1;
	void get1(int empid,int salary)
	{
		this.e1=empid;
		this.s1=salary;
		System.out.println("This is get1 function::"+empid+""+salary);
	}
	void display()
	{
		System.out.println("This is display method::"+e1+""+s1);
	}
	public static void main(String[] args) {
		
		ThisKeyword f1=new ThisKeyword();
		f1.get1(101,20000);
		f1.display();

	}

}
