package arrays;
import java.lang.*;
import java.util.*;
public class Swap2Arrays {

	public static void main(String[] args) {
		// 3)Write a Java Program that to swap 2 Given arrays ?
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int arr1[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<arr1.length;i++) {
    	arr1[i]=sc.nextInt();
    }
    System.out.println("enter the size of the array");
    int m=sc.nextInt();
    int arr2[]=new int[m];
    System.out.println("enter the elements");
    for(int j=0;j<arr2.length;j++) {
    	arr2[j]=sc.nextInt();
    }
    for(int i=0;i<n;i++) {
    	int temp=arr1[i];
    	arr1[i]=arr2[i];
    	arr2[i]=temp;
    }
    for(int i=0;i<n;i++) {
    	System.out.print(arr1[i]+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++) {
    	System.out.print(arr2[i]+" ");
    }
    System.out.println();
	}

}
