import java.util.Scanner;

public class ElectionEligibilyCheck
{
	
	// Write the Programe for a person whether he / she eligible or not
public static void main(String[] args)
{
	// Create the scanner object to read input from the console
	Scanner scanner= new Scanner(System.in);
	
	// Prompt the user to enter there name
	System.out.println("Please enter your name");
	
	// Read the input as a string
	String name = scanner.nextLine();
	
	//Prompt the user to enter there Age
	System.out.println("Please Enter your Age");
	
	//read the entered value as a integer
	int Age = scanner.nextInt();
	
	//check whether enter Age is more than or equals to 18 or not
	// using if else condition
	if (Age >= 18)
	{
		System.out.println("Hey congrats "+ name + " Your are Eligible for voting");
		
	}
	else
	{
		System.out.println("Sorry Your are not Eligible");
	}
	
	
}
}
