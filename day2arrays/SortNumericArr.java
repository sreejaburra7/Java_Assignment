package day2arrays;
import java.lang.*;
import java.util.*;
public class SortNumericArr {

	public static void main(String[] args) {
		//  1) Java Program to Sort a Numeric Array
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the value");
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<arr.length;i++) {
	   arr[i]=sc.nextInt();
   }
   for(int i=0;i<arr.length-1;i++) {
	   for(int j=i+1;j<arr.length;j++) {
		   if(arr[i]>arr[j]) {
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;  
		   }
	   }
   }
   for(int a:arr) {
	   System.out.println(a);
   }
	}

}
