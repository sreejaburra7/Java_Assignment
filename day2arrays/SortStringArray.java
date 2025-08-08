package day2arrays;
import java.lang.*;
import java.util.*;
public class SortStringArray {

	public static void main(String[] args) {
		//1) Java Program to Sort a String Array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(String s:arr) {
			System.out.println(s);
		}

	}

}
