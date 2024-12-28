package Array;

import java.util.Scanner;

public class Smallest_ele {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check nth smallest");
		int n=sc.nextInt();

		int[] a={12,5,-7,3,47,98,1,2};
		int smallest=a[0];
		int secSmall;
		for(int i=0; i<a.length; i++){
		if(a[i]<=smallest){
		smallest=a[i];
		}
		//if(a[i]>=smallest && a[i]<)
		}
		System.out.println(smallest);
	}

}
