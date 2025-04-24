
public class ThreadP1 extends Thread
{
   
	public void run()//This is process
	{
		System.out.println("This is Run Method");
		get1();
	}
	void get1()
	{
		System.out.println("This is Normal Method..");
	}
	
	public static void main(String[] args) {
		
		ThreadP1 f1=new ThreadP1();
		f1.start();//Start the Thread
        
	}

}
