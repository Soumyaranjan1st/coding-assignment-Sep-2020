import java.util.Arrays;
import java.util.Scanner;

public class Exam {
   static int minDiff(int[]arr,int a,int b) {
	   int result=Integer.MIN_VALUE;
	   Arrays.sort(arr);
	   for(int i=0;i<=a-b;i++) 
		   result=Math.min(result, arr[i]-arr[i+b-1]);
		return result;   
   }
   static int findElements(int res,int arr[],int a,int b) {
	   int result=Integer.MIN_VALUE;
	   for(int i=0;i<=a;i++) {
		   result=Math.min(result, arr[i+b-1]-arr[i]);
		   if(res==result)
			   return i;
	   }
	   return 0;
   }
   public static void main(String[]args) {
	   int array[]= {7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
	   String iteams[]= {"Fitbit Plus: 7980","IPods: 22349","MI Band: 999","Cult Pass: 2799","Macbook Pro: 229900","Digital Camera: 11101","Alexa: 9999","Sandwich Toaster: 2195","Microwave Oven: 9800","Scale: 4999"};
	   int a=array.length-1;
	   System.out.println("Enter the number of employees:");
	   Scanner t=new Scanner(System.in);
	   int b=t.nextInt();
	   int result=minDiff(array,a,b);
	   System.out.println("Number of the employees:"+b);
	   int index=findElements(result,array,a,b);
	   System.out.println("The goodies selected for distribution are:");
	   for(int i=index;i<index+b;i++)
		   System.out.println(iteams[i]+"\n");
	   System.out.println("And the difference between the chosen goodie with highest price and the lowest price is:"+result);
		   
	   
   }
}
