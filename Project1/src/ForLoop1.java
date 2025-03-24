import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		
		//int i,n;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the n value is::");
		//n=sc.nextInt();
		/*for(i=0;i<=n;i++)
		{
			System.out.println("I value is::"+i);
		}*/
		
		/*i=0;
		for(;i<=n;i++)
		{
			System.out.println("I value is::"+i);
		}*/
		
		/*i=0;
		for(;i<=n;)
		{
			System.out.println("I value is::"+i);
			i++;
		}*/
		
		//int numbers[]=new int[4];
		
		int[] numbers= {1,2,3,4,5};
		for(int num:numbers)
		{
			System.out.print(num);
		}
		

	}

}
