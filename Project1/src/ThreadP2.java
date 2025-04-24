
public class ThreadP2 implements Runnable
{

	public void run()
	{
		System.out.println("This is Thread concepts");
	}
	public static void main(String[] args) {
		
		ThreadP2 t1=new ThreadP2();
		Thread f1=new Thread(t1);
		f1.start();

	}

}
