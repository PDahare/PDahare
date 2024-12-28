package gowriInstitute;

	//Write a method for the given string and find the count of lowercase character

public class countLowerCaseChar {

	public static int LowerCaseCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Prashant";
		System.out.println(LowerCaseCount(str));
	}
}
