
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// function to print Name 
		System.out.print("Enter your name");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		// function to return UniversityID
		System.out.println("Enter your UniversityID");
		String id = input.nextLine();
		
		// function to return major 
		System.out.println("Enter your major");
		String major = input.nextLine();
		
		
	}
// method to print your name 
	public static void Name(String nam) {
		System.out.println("Your name is:" +nam);
	}
	// method to return your UniversityID
	public static String UniversityID(String uid) {
		System.out.println("Your Nuiversity ID is:" + uid);
		return (uid);
		
		
	}
	// method to print your name, University ID, and you major 
	public static void All(String nam, String uid, String maj ) {
		
		// Name: Sultan Mohammed ALmuammar Alyami 
		// Course Name: 212CSS-4 Object Oriented Programming 
		// Section: 32 
		// Academic ID: 441105509 
		// Instructor: Ibrahim Hassan Alyami 
		//Date: February 15,2021 
		
	}
}
