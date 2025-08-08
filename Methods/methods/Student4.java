package methods;
import java.lang.*;
public class Student4 {
     String EligibleForScholorship(double percentage) {
    	 if(percentage>80) {
    		 return "Eligible For Scholarship";
    	 }
    	 else {
    		 return "not eligible for scholarship";
    	 }
     }
	public static void main(String[] args) {
		// 4. "Create a method to check if student is eligible for scholarship (above 80%)."
		  // → Return type, with parameter
    Student4 obj=new Student4();	
    double percentage=90;
    String res=obj.EligibleForScholorship(percentage);
    System.out.println(res);
    }

}
