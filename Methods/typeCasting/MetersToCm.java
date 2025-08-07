package typeCasting;
import java.lang.*;
import java.util.*;
public class MetersToCm {

	public static void main(String[] args) {
		// 2.Convert height from meters to cm.
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the height in meters");
    float meters=sc.nextFloat();
    float cm=meters*100;
    System.out.println("height from meters to cm "+cm);
    int cmI=(int)cm;
    System.out.println("height from meters to cmI "+cmI);

	}

}
