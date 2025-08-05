package day2arrays;
import java.lang.*;
import java.util.*;
public class StringArrayInput {

	public static void main(String[] args) {
		//2)Write a Java Program that to check if a String array contains User given string Value ?
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		System.out.println("enter the input element");
		String input=sc.next();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i].equals(input)) {
				found=true;
				break;
			}
				
		}
		if(found) {
			System.out.println("string found");
		}
		else {
			System.out.println("string not found");
		}
	
	}

}
