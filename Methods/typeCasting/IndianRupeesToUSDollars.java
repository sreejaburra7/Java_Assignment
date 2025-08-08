package typeCasting;
import java.lang.*;
import java.util.*;
public class IndianRupeesToUSDollars {

	public static void main(String[] args) {
	//1.Write a program to convert Indian rupees to US Dollars.
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a amount in indian rupee: ");
     float inr=sc.nextFloat();
     float conversion=87.73f;
     float usd=inr/conversion;
     int usdI=(int)usd;
     System.out.println("converted to USD: "+usdI);
	}

}
