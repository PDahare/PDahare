package Scanner;

import java.util.Scanner;

public class stringUpperToLoverNviceVersa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter input here");
		String str=sc.next();
		StringBuffer res =new StringBuffer();
		for (int i =0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				res.append((char)(ch +32));
			}
			else if (ch>='a' && ch<='z')
			{
				res.append((char)(ch-32));
			}
			else
			{
				res.append(ch);
			}
		}
		String ans=res.toString();
		System.out.println(ans);
	}

}
