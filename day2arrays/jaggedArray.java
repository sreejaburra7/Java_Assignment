package day2arrays;
import java.lang.*;
import java.util.*;
public class jaggedArray {

	public static void main(String[] args) {
    //4)Write a Java Program that to Create a Dynamic Jagged array ?
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][];
    for(int i=0;i<arr.length;i++) {
    	System.out.println("enter number of columns:");
    	 int col=sc.nextInt();
    	  arr[i]=new int[col];
    	 for(int j=0;j<arr[i].length;j++) {
    		 arr[i][j]=(int)(Math.random()*10);
    	 }
    }
    for(int a[]:arr) {
    	for(int value:a) {
    	System.out.print(value+" "); 
    }
    	System.out.println();
	}
	}
}
