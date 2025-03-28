import java.util.Scanner;

public class Arrayp2 {

	public static void main(String[] args) {
		
		int empid[][]=new int[2][2];
		int i,j,n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the Array value is::");
				empid[i][j]=sc.nextInt();
				System.out.println("Your array value::"+empid[i][j]);
			}
		}
		

	}

}
