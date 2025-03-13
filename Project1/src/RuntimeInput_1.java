import java.util.Scanner;

class Sample2
{
	int empid;
	String empname;
	char grade;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid and empname::");
		empid=sc.nextInt();
		empname=sc.next();
		grade=sc.next().charAt(0);
	}
	void display()
	{
		System.out.println("Your Empid is::"+empid+"Empname is::"+empname+"Grade is::"+grade);
	}
	void adminDetails(int adminid,String adminname)//argument or parameters passing
	{
		
		System.out.println("Your admin Login is::"+adminid+""+adminname);
	}
}
public class RuntimeInput_1 {

	public static void main(String[] args) {
		
		Sample2 obj=new Sample2();
		obj.input();
		obj.display();
		obj.adminDetails(1001,"azar");

	}

}
