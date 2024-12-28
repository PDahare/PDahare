package JavaSession;

public class RemoveDuplicate {
	/*
	 * writing a program to remove duplicate from given string
	 */
	public static void main(String[] args) {

		String str = "automation";
		String output = "";
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);

			if (output.indexOf(ch) == -1) //output.indexOf(ch)==-1 this will check char is not present in output
			{
				output = output + ch; //if the char is not present we are adding in output 
			}
		}
		System.out.println(output);
	}
}
