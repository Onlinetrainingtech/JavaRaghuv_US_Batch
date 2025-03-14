import java.io.DataInputStream;
import java.io.IOException;

class Sample5
{
	int empid,salary;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws IOException 
	{
		System.out.println("Enter the data is::");
		empid=Integer.parseInt(dis.readLine());
		salary=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+salary+""+empname);
	}
}
public class RuntimeInput_2 {

	public static void main(String[] args) throws IOException {
		
		Sample5 obj=new Sample5();
		obj.input();
		obj.display();

	}

}
