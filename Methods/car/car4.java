package car;
import java.lang.*;
public class car4 {
     double resaleValue(double price,double depreciation) {
    	 if(price<depreciation) {
    		 return 0;
    	 }
    	 else {
    		 return price-depreciation;
    	 }
     }
	public static void main(String[] args) {
		/*4. "Create a method that returns the resale value (price - depreciation)."
	    → Return type, with parameters*/
		double price=500000;
		double depreciation=15000;
		car4 obj=new car4();
		double resV=obj.resaleValue(price,depreciation);
		System.out.println("resaleValue: "+resV);
		
	}

}
