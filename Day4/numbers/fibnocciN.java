package numbers;
import java.lang.*;
import java.util.*;
public class fibnocciN {

	public static void main(String[] args) {
		// 4)Write a Java Program that to print Print Fibonacci Series up to N Terms ?
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms ");
		int n=sc.nextInt();
		int first=0;
		int second=1;
		System.out.println("fibnocci series up to "+n+"terms");
		for(int i=0;i<n;i++) {
			System.out.println(first+" ");
			int next=first+second;
			first=second;
			second=next;
			}
	

	}

}
