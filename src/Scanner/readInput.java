package Scanner;

import java.util.Scanner;

public class readInput {

	public static void main(String[] args) throws Exception {
// Read a number =>int
		int num;
		System.out.println("Enter a number");
		Scanner readNum=new Scanner(System.in);
	//	System.in
		num=readNum.nextInt();
		System.out.println("The Entered Number is "+num);
		
		// Read a String =>String
		System.out.println("Enter a name");

		String name;
		Scanner readName=new Scanner(System.in);
		name=readName.next();
		System.out.println("The Entered Name "+name);
		
//	try {
//		System.out.println(10/0);
//	}
//	catch(Exception e)
//	{
//		throw new Exception("error msg is cant be divide number with 0");
//	}
//		
	}

}
