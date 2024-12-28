package gowriInstitute;

public class Q5FindOutWords {

	public static int NumOfWord(String str) {
		String[] s1 = str.split(" ");
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			count++;
			// System.out.println(s1[i]);
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "I love java and selenium";
		System.out.println(NumOfWord(str));
	}
}
