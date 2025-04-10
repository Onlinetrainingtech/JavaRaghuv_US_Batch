import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Sample12
{
	//HashSet<Integer>list1=new HashSet<Integer>();
	//TreeSet<Integer>list1=new TreeSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void process()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		list1.add(1004);
		System.out.println("List of data is::"+list1);
		System.out.println("Size of the data is::"+list1.size());
		System.out.println("Remove the data is::"+list1.remove(1001));
		System.out.println("After removing the size::"+list1.size());
		System.out.println("Searching the data is::"+list1.contains(1001));
		Iterator h1=list1.iterator();
		while(h1.hasNext())
		{
			System.out.println("Inside the loop is::"+h1.next());
		}
	}
}
public class CollectionP1 {

	public static void main(String[] args) {
		
		Sample12 f1=new Sample12();
		f1.process();

	}

}
