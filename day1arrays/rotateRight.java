package arrays;
import java.lang.*;
import java.util.*;
public class rotateRight {
	public static  void reverse(int arr[], int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
  
	}

}
