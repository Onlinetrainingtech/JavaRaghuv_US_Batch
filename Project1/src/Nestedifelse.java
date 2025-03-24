import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age is::");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Are You a citizen (Yes/No)");
			String citizen=sc.next();
			if(citizen.equalsIgnoreCase("yes")) {
				System.out.println("Your are eligiable to vote");
			}else {
				System.out.println("You Must be a citizen to vote");
			}
		}else {
			System.out.println("You are not eligible to vote");
		}

	}

}
