package typeCasting;
import java.lang.*;
import java.util.*;
public class WeightFromHeight {

	public static void main(String[] args) {
		// 3. Find the weight of a person based on height
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:  ");
		float height=sc.nextFloat();
		float bmi=22.0f;
		float weight=bmi*height*height;
		int weightI=(int)weight;
		System.out.println("weight of a person based on height: "+weightI);

	}

}
