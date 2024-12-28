package Array;

import java.util.Arrays;

public class seperateZeroFromArray {

	//Write a programe to separate zeros and non zeroes in a given Array
	
	public static void main(String[] args) {

		int[] inputArr= {0,10,43,25,0,38,98,191,0};
		int counter=0;
		// iterating through the array
		for (int i=0; i<inputArr.length; i++)
		{
			if(inputArr[i]!=0)
			{
				inputArr[counter]=inputArr[i];
				counter++;
			}
		}
		
		while(counter<inputArr.length) {
			inputArr[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArr));
	}

}
