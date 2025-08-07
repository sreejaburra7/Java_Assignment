package Numbers;
import java.lang.*;
import java.util.*;
public class BuzzNumber {

	public static void main(String[] args) {
		// 2)Write a Java Program that to Check Whether Given number is Buzz Number or Not ?
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    if(num%7==0 || num%10==7) {
    	System.out.println("Buzz Number");
    }
    else {
    	System.out.println("Not a Buzz Number");
    }
	}

}
