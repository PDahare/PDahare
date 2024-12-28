import java.util.Scanner;  // Import the Scanner Class

public class UserInput 
{
	public static void main(String[] args)
	{
	// Create the scanner object to read input from the console
		Scanner scanner=new Scanner(System.in);
		
		// Prompt the user to enter there name
		System.out.println("Enter your name Please");
		
		//Read the user name as astring
		String name = scanner.nextLine();
		
		//Prompt the user to enter there Age
		System.out.println("please enter your Age");
		
		// Read the user Age as Integer
		int Age = scanner.nextInt();
		
		// Display the inputs enter by user
		System.out.println("Hello "+ name + " you are "+ Age+ " years old");
		
	
	}
}
