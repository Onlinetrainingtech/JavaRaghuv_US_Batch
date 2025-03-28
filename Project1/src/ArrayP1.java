import java.util.Scanner;

public class ArrayP1 {

	public static void main(String[] args) {
		
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

}
