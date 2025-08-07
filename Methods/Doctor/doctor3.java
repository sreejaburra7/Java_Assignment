package Doctor;
import java.lang.*;
public class doctor3 {
	void healthStatus(double bmi) {
		if(bmi<18.5) {
			System.out.println("under weight");
		}
		else if(bmi>=18.5 && bmi<24.9) {
			System.out.println("Normal weight");
		}
		else if(bmi>=25.0 && bmi<29.9) {
			System.out.println("Over weight");
		}
		else {
			System.out.println("obese");
		}
		
	}

	public static void main(String[] args) {
		/*3. "Create a method to print health status based on BMI."
        → No return, with parameter  
        BMI < 18.5	Underweight , 18.5 ≤ BMI < 24.9	Normal weight , 25.0 ≤ BMI < 29.9	Overweight , BMI ≥ 30.0	Obese*/
		double bmi=24.5;
		doctor3 obj=new doctor3();
		obj.healthStatus(bmi);
		
		

	}

}
