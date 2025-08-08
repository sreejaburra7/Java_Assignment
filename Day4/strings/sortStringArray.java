package strings;
import java.lang.*;
import java.util.*;
public class sortStringArray {

	public static void main(String[] args) {
		/*3)Write a Java Program that to Create a Single-Dimensional String array and try to sort that array in Descending Order alphabetically ?   */
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of string");
    int n=sc.nextInt();
    sc.nextLine();
    String arr[]=new String[n];
    System.out.println("enter the string elements");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextLine();
    }
    for(int i=0;i<arr.length-1;i++) {
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[i].compareTo(arr[j])<0) {
    			String temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    	}	
    }
    }
    System.out.println("strings in descending order :");
	for(String s:arr) {
		System.out.println(s);
	}

	}
}
