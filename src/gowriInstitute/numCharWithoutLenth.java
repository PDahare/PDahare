package gowriInstitute;

		//without using length method find out the no. of character in given string
public class numCharWithoutLenth {
	public static void main(String[] args) {
		String str = "Prashant";
		char[] charStr = str.toCharArray();
		System.out.println(CharCountWithoutLenth(charStr));
	}

	private static int CharCountWithoutLenth(char[] charStr) {
		int count = 0;
		for (char ch : charStr) {
			count++;
		}

		return count;
	}

}
