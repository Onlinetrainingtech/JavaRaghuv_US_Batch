import java.util.Scanner;

public class ifelsestatement {

	
	public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number is::");
	  int num=sc.nextInt();
	  if(num>0){
		  if(num%2==0){
			  System.out.println("Positive Even Number");
		  }else{
			  System.out.println("Positive Odd Numbers");
		  }
	  }else if(num<0){
			  if(num%2==0){
				  System.out.println("Negative Even Number");
			  }else{
				  System.out.println("Negative Odd Numbers");
			  }
		  }
			  else
			  {
				  System.out.println("The number is Zero");
			  }
		  }
	  

	}


