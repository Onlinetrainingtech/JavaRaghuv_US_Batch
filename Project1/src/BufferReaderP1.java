import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample3
{
	void get()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the your name is::");
		String name=br.readLine();
		System.out.println("Your name is::"+name);
	}
}


public class BufferReaderP1 {

	public static void main(String[] args) throws IOException {
		
		Sample3 f1=new Sample3();
		f1.get();

	}

}
