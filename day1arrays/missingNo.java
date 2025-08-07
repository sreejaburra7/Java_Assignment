package arrays;
import java.lang.*;
import java.util.*;
public class missingNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int totalSum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			totalSum+=arr[i];
		}
		int actualSum=((size+1)*(size+2))/2;
		int missNumber=actualSum-totalSum;
		
		System.out.println(missNumber);
	}

}
