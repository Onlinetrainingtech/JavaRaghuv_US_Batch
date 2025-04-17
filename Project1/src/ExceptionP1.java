
public class ExceptionP1 {
   void get1()
   {
	   try
	   {
	   int a=10/0;
	   System.out.println("Your value is::"+a);
	   }
	   catch(ArithmeticException t)
	   {
		   System.out.println("Please check the Exception"+t);
	   }
	   get2();
   }
   void get2()
   {
	   System.out.println("This is get2 function");
   }
	public static void main(String[] args) {
		
		ExceptionP1 f1=new ExceptionP1();
		f1.get1();

	}

}
