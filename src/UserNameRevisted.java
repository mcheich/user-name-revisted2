import java.util.Scanner;

public class UserNameRevisted {

	public static void main(String[] args) {
		/* 	User Name revisited
			Ask the user for a user name of at least 4 characters in length. 
			Continue prompting the user until they actually enter a user name that is long enough.

			Examples
			Enter a user name:
			bob

			not long enough! try again!

			bob
			still not long enough! try again!!!!
			
			bobby
			Welcome bobby!
		*/
		
		System.out.println("Welcome " + getUserName() + " !");

	}

	public static String getUserName() {
		
		System.out.println("Enter a user name:");
		
		Scanner input = new Scanner(System.in);
		String output = input.next(); 
		
		while(output.length() < 5) {
			System.out.println("still not long enough! try again!!!!");	
			output = input.next(); 
		}
		
		input.close();
		
		return output;
	}
//
//	public static boolean checkUserNameLength(String str) {
//		
//		if(str.length() < 5) {
//			return false;
//		}
//		return true;
//	}
//
}
