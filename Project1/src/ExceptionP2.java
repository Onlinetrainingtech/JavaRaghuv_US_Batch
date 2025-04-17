import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP2 {

	void get1()
	{
		try
		{
		int empid[]=new int[5];//Array declaration
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("I value is::"+empid[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("Please check the size");
		}
		catch(InputMismatchException t1)
		{
			System.out.println("Check the Input");
		}
		finally
		{
			System.out.println("This is finally block");
		}

	}
	public static void main(String[] args) {
		
		ExceptionP2 f1=new ExceptionP2();
		f1.get1();

	}

}
