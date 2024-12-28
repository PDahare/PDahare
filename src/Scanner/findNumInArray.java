package Scanner;

import java.util.Scanner;

public class findNumInArray {

	public static void main(String[] args) {
		boolean flag= false;
		int ele;
		int arr[]= {12, 23, 24,35,56,76,78,90};
		Scanner sc=new Scanner(System.in);
		System.out.println("To find number which is present or not\nPlease enter Number here");
		ele=sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==ele)
			{
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Number found "+ele);
		}
		else
			System.out.println("number not found in Array "+ele);
	}
}
