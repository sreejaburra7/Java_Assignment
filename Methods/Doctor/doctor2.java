package Doctor;
import java.lang.*;
public class doctor2 {
    double calculateBmi(double heightM,double weightKg) {
    	if(heightM<=0) {
    		return 0;
    	}
    	return weightKg/(heightM*heightM);
    	
    }
	public static void main(String[] args) {
		/*2. "Create a method to calculate BMI using height and weight."
        → Return type, with parameters
	   formula : weightKg / (heightMeters * heightMeters);   */
		doctor2 obj=new doctor2();
		double res=obj.calculateBmi(1.65,60);
		System.out.printf("BMI %.2f%n :",res);
	}
}
