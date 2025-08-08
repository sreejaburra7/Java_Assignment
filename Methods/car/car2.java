package car;
import java.lang.*;
public class car2 {
       double mileageOnFuelDistance(double fuel,double distance) {
    	   if(fuel==0) {
    		   return 0;
    	   }
    	   return distance/fuel;
    	   
       }
	public static void main(String[] args) {
		// 2. "Create a method to calculate mileage based on fuel and distance."
	   // → Return type, with parameters

		car2 obj=new car2();
		double f1=500;
		double  d1=900;
	    double res=obj.mileageOnFuelDistance(f1,d1);
	    System.out.println("mileage: "+res);

	}

}
