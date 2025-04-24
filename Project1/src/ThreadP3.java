
public class ThreadP3 extends Thread
{

	public void run()
	{
		try
		{
		System.out.println("Your Thread Name is::"+currentThread().getName());
		System.out.println("Your Thread priority is::"+currentThread().getPriority());
		Thread.sleep(10000);
		System.out.println("This is Thread Concepts");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		
		//Multiple Threads
		ThreadP3 t1=new ThreadP3();
		t1.start();
		ThreadP3 t2=new ThreadP3();
		t2.start();
		t1.setName("Process-1");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		

	}

}
