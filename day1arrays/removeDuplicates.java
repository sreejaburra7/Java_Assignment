package arrays;
import java.lang.*;
import java.util.*;
public class removeDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int newArr[]=new int[n];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
		    for(int j=0;j<count;j++) {
		    	if(arr[i]==newArr[j]) {
		    		duplicate=true;
		    		break;
		    	}
		    }
		    
		
		if(!duplicate) {
			newArr[count]=arr[i];
			count++;
		}
		}
		for(int i=0;i<count;i++) {
			System.out.println(newArr[i]);
		}
		

	}

}
