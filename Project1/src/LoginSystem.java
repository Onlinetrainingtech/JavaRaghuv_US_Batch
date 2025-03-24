import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		if(username.equals("admin")) {
			if(password.equals("admin@123")) {
				System.out.println("Login admin Successfull");
			}else {
				System.out.println("Incorrect admin Password!!!");
			}
			}else if(username.equals("user")){
			    	if(password.equals("user123")) {
			    		System.out.println("LoginUserSuccess!!!");
			    }else {
			    	System.out.println("Incorrect user Password!!!");
			}
		}else {
			System.out.println("Invalid UserName!!!");
		}

	}

}
