public class Main {
    
    public static void main(String args[]){
       int[] arr={12,14,7,8,9,84,56};
       int largest=arr[0];
       int secLargest=0;
       System.out.println("Length of the Array is "+ arr.length);
       for(int i=0; i<arr.length; i++){
         if(arr[i]>largest){
           secLargest=largest;
           largest=arr[i];
           
         }
         else if(arr[i]<largest && arr[i]>secLargest){
           secLargest=arr[i];
         }
         
       }
       System.out.println("largest number "+largest);
       System.out.println("Second largest number "+secLargest);
    }
}