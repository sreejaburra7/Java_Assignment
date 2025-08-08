package methods;
import java.lang.*;

public class Student3 {
     String gradeBasedOnPercentage(double percentage) {
    	 if(percentage>=90) {
    		 return "A+";
    	 }
    	 else if(percentage>=80) {
    		 return "A";
    	 }
    	 else if(percentage>=70) {
    		 return "B";
    	 }
    	 else if(percentage>=60) {
    		 return "C";
    	 }
    	 else if(percentage>=50) {
    		 return "D";
    	 }
    	 else {
    		 return "F";
    	 }
     }
	public static void main(String[] args) {
		// 3. "Create a method to return the grade based on percentage."
		//→ Return type, with parameter
		Student3 obj=new Student3();
		double percentage=75.5;
		String grade=obj.gradeBasedOnPercentage(percentage);
        System.out.println(percentage);
        System.out.println("grade :"+grade);
	}

}
