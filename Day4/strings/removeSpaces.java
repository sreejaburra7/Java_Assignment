package strings;
import java.lang.*;
import java.util.*;

public class removeSpaces {

	public static void main(String[] args) {
		/*1)Writea Java Program that to accept a user input(Scanner Class) of String and try to remove all the white spaces given within that String ?   */
		System.out.println("enter a string");
      Scanner sc=new Scanner(System.in);
      String input=sc.nextLine();
      String res=input.replaceAll(" ","");
      System.out.println(res);
	}

}
