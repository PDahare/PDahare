package JavaSession;

public class MergeArray {
	
	/*
	 *  let us consider a={2,5,8,7}, b={10,5,9,4}
	 *  Output = {2,4,5,9,8,5,7,10}
	 */
	
	public static void main(String[] args) {
		int[] a={2,5,8,7};
		int[] b={10,5,9,4};
		int result[]=new int[a.length+b.length];
		int index=0;
		for(int i=0; i<a.length; i++) 
		{
			result[index++]=a[i];
			result[index++]=b[b.length-1-i];
		}
		
		for(int c: result) {
	
			System.out.print(c+" ");
		}
	}
	

}
