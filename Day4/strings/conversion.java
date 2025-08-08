package strings;
import java.lang.*;
import java.util.*;
public class conversion {

	public static void main(String[] args) {
		/*2)Write a Java Program that to Convert an Integer to String and float to Character  ?*/
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the int value: ");
    int n=sc.nextInt();
    String intToStr=String.valueOf(n);
    System.out.println("converted integer to string: "+intToStr);
    System.out.println("enter float value");
    float f=sc.nextFloat();
    int floatToInt=(int)f;
    if(floatToInt>=32 && floatToInt<=126) {
    char floatToChar=(char)floatToInt;
    System.out.println("converting float to char : "+floatToChar);
    }
    else {
    System.out.println("cannot convert this value: "+floatToInt);
    
	}
	}

}
