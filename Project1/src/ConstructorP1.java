class Employee
{
	Employee()//default cons..
	{
		System.out.println("This is normal function");
	}
    Employee(int a)//param cons
	{
		System.out.println("This is param function"+a);
	}
}

public class ConstructorP1 {

	public static void main(String[] args) {
		
		new Employee();
		new Employee(100);

	}

}
