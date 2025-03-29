enum names{mohamed,azar,raja}
public class EnumProgram1 {

	public static void main(String[] args) {
		
		for(names m:names.values())
		{
			System.out.println("Your enum value is::"+m);
		}
	}

}
