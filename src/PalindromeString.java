import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first string value");
		String str1 = scan.next();
		
		System.out.println("Enter the 2nd string value");
		String str2 = scan.next();
		
		if (str1.length() != str2.length()) {
			System.out.println("Given two strings are not palindrome");
		}
		else if (str1.contains(str2)) {
			System.out.println("Given String is palindrome");
		}
	}

}
