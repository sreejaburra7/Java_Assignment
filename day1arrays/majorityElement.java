package arrays;
import java.lang.*;
import java.util.*;
public class majorityElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
	    for(int i=0;i<arr.length;i++) {
	    	int count=1;
	    	boolean isVisited = false;
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			count++;
	    			if(count>n/2) {
	    		    	System.out.println(arr[i]);
	    		    	isVisited = true;
	    		    	break;
	    		    }
	    			
	    		}
	    	}  
	    	if(isVisited == true) {
	    		break;
	    	}
	    
	    }
	    
	    
	}

}
