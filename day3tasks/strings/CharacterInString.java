package strings;
import java.lang.*;
import java.util.*;
public class CharacterInString {

	public static void main(String[] args) {
		//1)Write a Java Program that to check whether user given Character is Present in String or not ?
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     String str=sc.nextLine();
     char ch=sc.next().charAt(0);
     boolean found=false;
     for(int i=0;i<str.length();i++) {
    	 if(str.charAt(i)==ch) {
    		 found=true;
    		 break;
    	 }
     }
     if(found) {
    	 System.out.println("character found");
     }
     else {
    	 System.out.println("character not found");
     }
	}

}
