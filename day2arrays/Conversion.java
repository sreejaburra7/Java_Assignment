package day2arrays;
import java.lang.*;
import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		//5)Write a Java Program that to Convert an int value to String and Viceversa ?
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string value: ");
      String str=sc.next();
      System.out.println("Converted to intger"+Integer.parseInt(str));
      System.out.println("enter integer value: ");
      int n=sc.nextInt();
      System.out.println("converted to String "+Integer.toString(n));
     
	}

}
