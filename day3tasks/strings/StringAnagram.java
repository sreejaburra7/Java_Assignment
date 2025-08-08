package strings;
import java.lang.*;
import java.util.*;
public class StringAnagram {

	public static void main(String[] args) {
		// 5)Write a Java Program that to Check Whether Given String is Anagram or not ?
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1");
		String str1=sc.nextLine().toLowerCase();
		System.out.println("enter string2");
		String str2=sc.nextLine().toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("not a anagram");
		}
		else {
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
				char temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
		}
	     for(int i=0;i<arr2.length-1;i++) {
				for(int j=i+1;j<arr2.length;j++) {
					if(arr2[i]>arr2[j]) {
					char temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
	     String sorted1=new String(arr1);
	     String sorted2=new String(arr2);
	     if(sorted1.equals(sorted2)) {
	    	 System.out.println("Anagram");
	     }
	     else {
	    	 System.out.println("not a anagram");
	     }
		

	}

}
}
