package strings;
import java.lang.*;
import java.util.*;
public class upperLower {

	public static void main(String[] args) {
		// 5)Write a Java Program that to Convert all uppercase letters into  lowercase and lowercase letters into uppercase in String ?
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String res="";
      for(int i=0;i<str.length();i++) {
    	  char ch=str.charAt(i);
    	  if(Character.isUpperCase(ch)) {
    		  res+=Character.toLowerCase(ch);
    	  }
    	  else if(Character.isLowerCase(ch)) {
    		  res+=Character.toUpperCase(ch);
    	  }
    	  else {
    		  res+=ch;
    	  }
      }
      System.out.println(res);
	}

}
