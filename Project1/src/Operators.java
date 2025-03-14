import java.util.Scanner;

public class Operators {

	int x,y;
	Scanner sc=new Scanner(System.in);
	void relationalOperator()
	{
		System.out.println("Enter the x and y value is::");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("RelationalOperator");
		System.out.println("Lessthan::"+(x<y));
		System.out.println("Greaterthan::"+(x>y));
		System.out.println("Equal to::"+(x==y));
		System.out.println("NotEqual::"+(x!=y));
	}
	void logicalOperator()
	{
		
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("logicalOpeator");
		System.out.println("LogicalAND::"+((x>y)&&(y<x)));
		System.out.println("LogicalOR::"+((x>y)||(y<x)));
		System.out.println("LogicalNOT::"+(!(x>y)));
	}
	void bitwiseOperator()
	{
		System.out.println("Enter the x and y value is::");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("BitwiseOperator");
		System.out.println("BitwiseAND::"+(x&y));
		System.out.println("BitwiseOR::"+(x|y));
		System.out.println("BitwiseXOR::"+(x^y));
		System.out.println("Leftshift::"+(x<<1));
		System.out.println("Rightshift::"+(x>>1));
		System.out.println("Ons cmpl::"+(~x));
	}
	public static void main(String[] args) {
		
         Operators obj=new Operators();
         //obj.relationalOperator();
         //obj.logicalOperator();
         obj.bitwiseOperator();
	}

}
