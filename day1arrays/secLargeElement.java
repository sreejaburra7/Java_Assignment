package arrays;
import java.lang.*;
import java.util.*;
public class secLargeElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>firstMax) {
					secondMax=firstMax;
					firstMax=arr[i];	
				}
				else if(arr[i]>secondMax && arr[i]!=firstMax) {
					secondMax=arr[i];
				}
			
			}
			System.out.println(secondMax);
	}

}
